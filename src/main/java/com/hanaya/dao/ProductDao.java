package com.hanaya.dao;

import java.util.List;
import java.util.Map;

import com.hanaya.model.Product;

public interface ProductDao {
	
	/*
	 * 依商品編號取得詳細
	 * @author Huan 2021-6-19
	 * @param  pd_id <商品編號>
	 * @return Product
	 */
	public Product getPdById(Integer pd_id);
	
	/*
	 * 依商品編號取得詳細
	 * @author Huan 2021-6-28
	 * @param  pd_id <商品編號>
	 * @return List<Map<String, Object>>
	 */	
	public List<Map<String, Object>> getPdInfoById(Integer pd_id);
	
	/*
	 * 商品列表
	 * @author Huan 2021-6-19
	 * @return List<Map<String, Object>>
	 */	
	public List<Map<String, Object>> getPdList();
}
