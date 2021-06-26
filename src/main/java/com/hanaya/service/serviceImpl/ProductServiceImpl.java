package com.hanaya.service.serviceImpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hanaya.dao.ProductDao;
import com.hanaya.model.Product;
import com.hanaya.service.ProductService;


@Service
public class ProductServiceImpl implements ProductService{
	@Autowired
	private ProductDao productDao;
	
	
	
	@Override	
	@Transactional
	public Product getPdById(Integer pd_id) {		
		return productDao.getPdById(pd_id);
	}

	
	@Override
	@Transactional
	public Map<String, Object> getPdMap(Integer pd_id) {
		// TODO Auto-generated method stub
		return productDao.getPdMap(pd_id);
	}


	@Override
	@Transactional
	public List<Map<String, Object>> getPdList() {
		// TODO Auto-generated method stub
		return productDao.getPdList();
	}

}
