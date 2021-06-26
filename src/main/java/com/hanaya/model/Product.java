package com.hanaya.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "product")
@Table(name = "product")
public class Product extends baseModel{
	
	@Id
	@Column(name = "pd_id")
	private Integer pd_id;
	@Column(name = "pd_no")
	private String pd_no;
	@Column(name = "pd_name")
	private String pd_name;
	@Column(name = "pd_type_id")
	private Integer pd_type_id;
	@Column(name = "pd_status")
	private Integer pd_status;
	@Column(name = "pd_price")
	private Integer pd_price;
	@Column(name = "pd_sales")
	private Integer pd_sales;
	@Column(name = "pd_description")
	private String pd_description;
	@Column(name = "pd_stock")
	private Integer pd_stock;
	@Column(name = "start_date")
	private Date start_date;
	@Column(name = "end_date")
	private Date end_date;
	
	
	public Integer getPd_id() {
		return pd_id;
	}
	public void setPd_id(Integer pd_id) {
		this.pd_id = pd_id;
	}
	public String getPd_no() {
		return pd_no;
	}
	public void setPd_no(String pd_no) {
		this.pd_no = pd_no;
	}
	public String getPd_name() {
		return pd_name;
	}
	public void setPd_name(String pd_name) {
		this.pd_name = pd_name;
	}
	public Integer getPd_type_id() {
		return pd_type_id;
	}
	public void setPd_type_id(Integer pd_type_id) {
		this.pd_type_id = pd_type_id;
	}
	public Integer getPd_status() {
		return pd_status;
	}
	public void setPd_status(Integer pd_status) {
		this.pd_status = pd_status;
	}
	public Integer getPd_price() {
		return pd_price;
	}
	public void setPd_price(Integer pd_price) {
		this.pd_price = pd_price;
	}
	public Integer getPd_sales() {
		return pd_sales;
	}
	public void setPd_sales(Integer pd_sales) {
		this.pd_sales = pd_sales;
	}
	public String getPd_description() {
		return pd_description;
	}
	public void setPd_description(String pd_description) {
		this.pd_description = pd_description;
	}
	public Integer getPd_stock() {
		return pd_stock;
	}
	public void setPd_stock(Integer pd_stock) {
		this.pd_stock = pd_stock;
	}
	public Date getStart_date() {
		return start_date;
	}
	public void setStart_date(Date start_date) {
		this.start_date = start_date;
	}
	public Date getEnd_date() {
		return end_date;
	}
	public void setEnd_date(Date end_date) {
		this.end_date = end_date;
	}
	
	
	
}
