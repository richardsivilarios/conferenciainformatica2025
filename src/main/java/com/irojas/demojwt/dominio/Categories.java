/**
 * "Visual Paradigm: DO NOT MODIFY THIS FILE!"
 * 
 * This is an automatic generated file. It will be regenerated every time 
 * you generate persistence class.
 * 
 * Modifying its content may cause the program not work, or your work may lost.
 */

/**
 * Licensee: 
 * License Type: Evaluation
 */
package com.irojas.demojwt.dominio;

import java.io.Serializable;
import javax.persistence.*;
@Entity
@org.hibernate.annotations.Proxy(lazy=false)
@Table(name="categories", schema="public")
public class Categories implements Serializable {
	public Categories() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == ORMConstants.KEY_CATEGORIES_PRODUCTS) {
			return ORM_products;
		}
		
		return null;
	}
	
	@Transient	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	@Column(name="categoryid", nullable=false)	
	@Id	
	@GeneratedValue(generator="COM_IROJAS_DEMOJWT_DOMINIO_CATEGORIES_CATEGORYID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="COM_IROJAS_DEMOJWT_DOMINIO_CATEGORIES_CATEGORYID_GENERATOR", strategy="native", parameters={ @org.hibernate.annotations.Parameter(name="schema", value="public") })	
	private int categoryid;
	
	@Column(name="categoryname", nullable=true, length=255)	
	private String categoryname;
	
	@Column(name="description", nullable=true, length=255)	
	private String description;
	
	@OneToMany(mappedBy="category", targetEntity=com.irojas.demojwt.dominio.Products.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_products = new java.util.HashSet();
	
	private void setCategoryid(int value) {
		this.categoryid = value;
	}
	
	public int getCategoryid() {
		return categoryid;
	}
	
	public int getORMID() {
		return getCategoryid();
	}
	
	public void setCategoryname(String value) {
		this.categoryname = value;
	}
	
	public String getCategoryname() {
		return categoryname;
	}
	
	public void setDescription(String value) {
		this.description = value;
	}
	
	public String getDescription() {
		return description;
	}
	
	private void setORM_Products(java.util.Set value) {
		this.ORM_products = value;
	}
	
	private java.util.Set getORM_Products() {
		return ORM_products;
	}
	
	@Transient	
	public final com.irojas.demojwt.dominio.ProductsSetCollection products = new com.irojas.demojwt.dominio.ProductsSetCollection(this, _ormAdapter, ORMConstants.KEY_CATEGORIES_PRODUCTS, ORMConstants.KEY_PRODUCTS_CATEGORY, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getCategoryid());
	}
	
}
