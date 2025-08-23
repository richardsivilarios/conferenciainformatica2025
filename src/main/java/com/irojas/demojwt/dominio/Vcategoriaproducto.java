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
@Table(name="vcategoriaproducto", schema="public")
@org.hibernate.annotations.Entity(mutable=false)
public class Vcategoriaproducto implements Serializable {
	public Vcategoriaproducto() {
	}
	
	@Column(name="llaveprimaria", nullable=false)	
	@Id	
	@GeneratedValue(generator="COM_IROJAS_DEMOJWT_DOMINIO_VCATEGORIAPRODUCTO_LLAVEPRIMARIA_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="COM_IROJAS_DEMOJWT_DOMINIO_VCATEGORIAPRODUCTO_LLAVEPRIMARIA_GENERATOR", strategy="native", parameters={ @org.hibernate.annotations.Parameter(name="schema", value="public") })	
	private Long llaveprimaria;
	
	@Column(name="categoryname", nullable=true, length=255)	
	private String categoryname;
	
	@Column(name="productname", nullable=true, length=255)	
	private String productname;
	
	@Column(name="price", nullable=true, precision=38, scale=2)	
	private java.math.BigDecimal price;
	
	private void setLlaveprimaria(long value) {
		setLlaveprimaria(Long.valueOf(value));
	}
	
	private void setLlaveprimaria(Long value) {
		this.llaveprimaria = value;
	}
	
	public Long getLlaveprimaria() {
		return llaveprimaria;
	}
	
	public Long getORMID() {
		return getLlaveprimaria();
	}
	
	private void setCategoryname(String value) {
		this.categoryname = value;
	}
	
	public String getCategoryname() {
		return categoryname;
	}
	
	private void setProductname(String value) {
		this.productname = value;
	}
	
	public String getProductname() {
		return productname;
	}
	
	private void setPrice(java.math.BigDecimal value) {
		this.price = value;
	}
	
	public java.math.BigDecimal getPrice() {
		return price;
	}
	
	public String toString() {
		return String.valueOf(getLlaveprimaria());
	}
	
}
