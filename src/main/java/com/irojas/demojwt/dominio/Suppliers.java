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
@Table(name="suppliers", schema="public")
public class Suppliers implements Serializable {
	public Suppliers() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == ORMConstants.KEY_SUPPLIERS_PRODUCTS) {
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
	
	@Column(name="supplierid", nullable=false)	
	@Id	
	@GeneratedValue(generator="COM_IROJAS_DEMOJWT_DOMINIO_SUPPLIERS_SUPPLIERID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="COM_IROJAS_DEMOJWT_DOMINIO_SUPPLIERS_SUPPLIERID_GENERATOR", strategy="native", parameters={ @org.hibernate.annotations.Parameter(name="schema", value="public") })	
	private int supplierid;
	
	@Column(name="address", nullable=true, length=255)	
	private String address;
	
	@Column(name="city", nullable=true, length=255)	
	private String city;
	
	@Column(name="contactname", nullable=true, length=255)	
	private String contactname;
	
	@Column(name="country", nullable=true, length=255)	
	private String country;
	
	@Column(name="phone", nullable=true, length=255)	
	private String phone;
	
	@Column(name="postalcode", nullable=true, length=255)	
	private String postalcode;
	
	@Column(name="suppliername", nullable=true, length=255)	
	private String suppliername;
	
	@OneToMany(mappedBy="supplier", targetEntity=com.irojas.demojwt.dominio.Products.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_products = new java.util.HashSet();
	
	private void setSupplierid(int value) {
		this.supplierid = value;
	}
	
	public int getSupplierid() {
		return supplierid;
	}
	
	public int getORMID() {
		return getSupplierid();
	}
	
	public void setAddress(String value) {
		this.address = value;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setCity(String value) {
		this.city = value;
	}
	
	public String getCity() {
		return city;
	}
	
	public void setContactname(String value) {
		this.contactname = value;
	}
	
	public String getContactname() {
		return contactname;
	}
	
	public void setCountry(String value) {
		this.country = value;
	}
	
	public String getCountry() {
		return country;
	}
	
	public void setPhone(String value) {
		this.phone = value;
	}
	
	public String getPhone() {
		return phone;
	}
	
	public void setPostalcode(String value) {
		this.postalcode = value;
	}
	
	public String getPostalcode() {
		return postalcode;
	}
	
	public void setSuppliername(String value) {
		this.suppliername = value;
	}
	
	public String getSuppliername() {
		return suppliername;
	}
	
	private void setORM_Products(java.util.Set value) {
		this.ORM_products = value;
	}
	
	private java.util.Set getORM_Products() {
		return ORM_products;
	}
	
	@Transient	
	public final com.irojas.demojwt.dominio.ProductsSetCollection products = new com.irojas.demojwt.dominio.ProductsSetCollection(this, _ormAdapter, ORMConstants.KEY_SUPPLIERS_PRODUCTS, ORMConstants.KEY_PRODUCTS_SUPPLIER, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getSupplierid());
	}
	
}
