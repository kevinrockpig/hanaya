package com.hanaya.model;

import java.util.Date;
import javax.persistence.Column;



public class baseModel {
	@Column(name = "crete_date")
	private Date create_date;
	@Column(name = "create_by")
	private Integer create_by;
}
