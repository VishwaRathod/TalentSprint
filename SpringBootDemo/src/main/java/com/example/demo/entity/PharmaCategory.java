package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="pharma_category")
public class PharmaCategory {
	@Column(name="pharma_category")
	private String pharma_category;
	
	@Column(name="pcategory_id")
	private Integer pcategory_id;
	
	
	public PharmaCategory(String pharma_category, Integer pcategory_id) {
		super();
		this.pharma_category = pharma_category;
		this.pcategory_id = pcategory_id;
	}
	
	
	public String getPharma_category() {
		return pharma_category;
	}
	public void setPharma_category(String pharma_category) {
		this.pharma_category = pharma_category;
	}
	public Integer getPcategory_id() {
		return pcategory_id;
	}
	public void setPcategory_id(Integer pcategory_id) {
		this.pcategory_id = pcategory_id;
	}
	@Override
	public String toString() {
		return "PharmaCategory [pharma_category=" + pharma_category + ", pcategory_id=" + pcategory_id + "]";
	}
	
	

}
