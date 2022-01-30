package com.hanaya.dao.daoImpl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.CriteriaSpecification;
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
	public List<Map<String, Object>> getPdInfoById(Integer prod_id) {
		List<Map<String,Object>> list = new ArrayList<Map<String, Object>>();
		StringBuilder sql = new StringBuilder();
		sql.append("WITH pty AS (SELECT pt.pd_type_name name, pt.pd_type_id id FROM pd_type pt) ");
		sql.append(" SELECT p.pd_id,p.pd_name, p.pd_status, p.pd_price, p.pd_sales, p.pd_description, ");
		sql.append(" p.pd_stock, p.start_date, p.end_date, pty.id type_id, pty.name type_name FROM product p ");
		sql.append(" LEFT JOIN pty ON pty.id = p.pd_type_id where p.pd_id =:prod_id ");
		
		Session session = sessionFactory.getCurrentSession();
		Query q = session.createSQLQuery(sql.toString());
		q.setParameter("prod_id", prod_id);
		q.setResultTransformer(CriteriaSpecification.ALIAS_TO_ENTITY_MAP);
		list = q.list();
		return list;
	}
	

	
//	@SuppressWarnings("deprecation")
	public List<Map<String, Object>> getPdList() {
		List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
		StringBuilder sql = new StringBuilder();
		sql.append("WITH pty AS (SELECT pt.pd_type_name name, pt.pd_type_id id FROM pd_type pt) ");
		sql.append(" SELECT p.pd_id,p.pd_name, p.pd_status, p.pd_price, p.pd_sales, p.pd_description, ");
		sql.append(" p.pd_stock, p.start_date, p.end_date, pty.id type_id, pty.name type_name FROM product p ");
		sql.append(" LEFT JOIN pty ON pty.id = p.pd_type_id ");
		Session session = sessionFactory.getCurrentSession();
//		List<Map<String, Object>> list = session.createNativeQuery(sql).list();
		Query q = session.createSQLQuery(sql.toString());
		q.setResultTransformer(CriteriaSpecification.ALIAS_TO_ENTITY_MAP);
		list = q.list();
//		System.out.println("sql = "+sql);
//		System.out.println("list  =" + map);

		return list;
	}

}
