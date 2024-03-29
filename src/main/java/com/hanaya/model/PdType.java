package com.hanaya.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "pd_type")
public class PdType {
	
	@Id
	@Column(name = "pd_type_id")
	private Integer pd_type_id;
	@Column(name = "pd_type_name")
	private String pd_type_name;
	@Column(name = "pd_type_up_id")
	private Integer pd_type_up_id;
	@Column(name = "pd_description")
	private String pd_description;
	@OneToMany(cascade=CascadeType.PERSIST,fetch=FetchType.LAZY,mappedBy="pdType")
	private Set<Product> products;
	
	
	public Set<Product> getProducts() {
		return products;
	}
	public void setProducts(Set<Product> products) {
		this.products = products;
	}
	public Integer getPd_type_id() {
		return pd_type_id;
	}
	public void setPd_type_id(Integer pd_type_id) {
		this.pd_type_id = pd_type_id;
	}
	public String getPd_type_name() {
		return pd_type_name;
	}
	public void setPd_type_name(String pd_type_name) {
		this.pd_type_name = pd_type_name;
	}
	public Integer getPd_type_up_id() {
		return pd_type_up_id;
	}
	public void setPd_type_up_id(Integer pd_type_up_id) {
		this.pd_type_up_id = pd_type_up_id;
	}
	public String getPd_description() {
		return pd_description;
	}
	public void setPd_description(String pd_description) {
		this.pd_description = pd_description;
	}
	
	
}
