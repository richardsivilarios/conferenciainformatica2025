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
@Table(name="products", schema="public")
public class Products implements Serializable {
	public Products() {
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == ORMConstants.KEY_PRODUCTS_CATEGORY) {
			this.category = (com.irojas.demojwt.dominio.Categories) owner;
		}
		
		else if (key == ORMConstants.KEY_PRODUCTS_SUPPLIER) {
			this.supplier = (com.irojas.demojwt.dominio.Suppliers) owner;
		}
	}
	
	@Transient	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	@ManyToOne(targetEntity=com.irojas.demojwt.dominio.Categories.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="categoryid", referencedColumnName="categoryid") }, foreignKey=@ForeignKey(name="fk1krrsjgcawsfg8k8u4hm5gi8q"))	
	private com.irojas.demojwt.dominio.Categories category;
	
	@Column(name="price", nullable=true, precision=38, scale=2)	
	private java.math.BigDecimal price;
	
	@Column(name="productid", nullable=false)	
	@Id	
	@GeneratedValue(generator="COM_IROJAS_DEMOJWT_DOMINIO_PRODUCTS_PRODUCTID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="COM_IROJAS_DEMOJWT_DOMINIO_PRODUCTS_PRODUCTID_GENERATOR", strategy="native", parameters={ @org.hibernate.annotations.Parameter(name="schema", value="public") })	
	private int productid;
	
	@ManyToOne(targetEntity=com.irojas.demojwt.dominio.Suppliers.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="supplierid", referencedColumnName="supplierid") }, foreignKey=@ForeignKey(name="fknb8p2wmntom25do4epoew7ysd"))	
	private com.irojas.demojwt.dominio.Suppliers supplier;
	
	@Column(name="productname", nullable=true, length=255)	
	private String productname;
	
	@Column(name="unit", nullable=true, length=255)	
	private String unit;
	
	public void setPrice(java.math.BigDecimal value) {
		this.price = value;
	}
	
	public java.math.BigDecimal getPrice() {
		return price;
	}
	
	private void setProductid(int value) {
		this.productid = value;
	}
	
	public int getProductid() {
		return productid;
	}
	
	public int getORMID() {
		return getProductid();
	}
	
	public void setProductname(String value) {
		this.productname = value;
	}
	
	public String getProductname() {
		return productname;
	}
	
	public void setUnit(String value) {
		this.unit = value;
	}
	
	public String getUnit() {
		return unit;
	}
	
	public void setCategory(com.irojas.demojwt.dominio.Categories value) {
		if (category != null) {
			category.products.remove(this);
		}
		if (value != null) {
			value.products.add(this);
		}
	}
	
	public com.irojas.demojwt.dominio.Categories getCategory() {
		return category;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Category(com.irojas.demojwt.dominio.Categories value) {
		this.category = value;
	}
	
	private com.irojas.demojwt.dominio.Categories getORM_Category() {
		return category;
	}
	
	public void setSupplier(com.irojas.demojwt.dominio.Suppliers value) {
		if (supplier != null) {
			supplier.products.remove(this);
		}
		if (value != null) {
			value.products.add(this);
		}
	}
	
	public com.irojas.demojwt.dominio.Suppliers getSupplier() {
		return supplier;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Supplier(com.irojas.demojwt.dominio.Suppliers value) {
		this.supplier = value;
	}
	
	private com.irojas.demojwt.dominio.Suppliers getORM_Supplier() {
		return supplier;
	}
	
	public String toString() {
		return String.valueOf(getProductid());
	}
	
}
