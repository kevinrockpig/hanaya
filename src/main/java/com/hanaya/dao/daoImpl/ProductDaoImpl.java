package com.hanaya.dao.daoImpl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import com.hanaya.dao.ProductDao;
import com.hanaya.model.Product;


@Repository("ProductDao")
public class ProductDaoImpl implements ProductDao{

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public Product getPdById(Integer pd_id) {	
		Product pd = sessionFactory.getCurrentSession().get(Product.class,pd_id);
//		Product pd = null;
//		Session session = sessionFactory.openSession();
//		String sql ="SELECT p.* FROM product p WHERE p.pd_id = :pd_id ";
//		List<Product> pd_list = session.createNativeQuery(sql, Product.class).setParameter("pd_id", pd_id).list();
//		
//		if(pd_list!=null&&pd_list.size()>0) {
//			for(int i = 0; i < pd_list.size(); i++) {			
//				pd = new Product(); 
//				pd = pd_list.get(i);
//			}
//		}

		return pd;
	}

	
	@Override
	public Map<String, Object> getPdMap(Integer pd_id) {
		// TODO Auto-generated method stub
		Map<String, Object> map = new HashMap();
//		String sql ="SELECT p.* FROM product p WHERE p.pd_id = :pd_id ";
//		Session session = sessionFactory.openSession();
//		List list = session.createNativeQuery(sql).setParameter("pd_id", pd_id).list();
//				
//		if(list!=null&&list.size()>0) {		
//			map = (Map) list.get(0);
//		}
		
		return map;
	}
	

	
	public List<Map<String, Object>> getPdList() {
		String hql ="select new map(p.pd_id,p.pd_name) from product p ";
		Session session = sessionFactory.getCurrentSession();
//		List<Map<String, Object>> list = session.createNativeQuery(sql).list();
		Query q = session.createQuery(hql);
		List<Map<String, Object>> map = q.list();

		return map;
	}

}
