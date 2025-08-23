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

import org.orm.*;
import org.hibernate.Query;
import org.hibernate.LockMode;
import java.util.List;

public class ProductsDAO {
	public static Products loadProductsByORMID(int productid) {
		try {
			PersistentSession session = ConferenciaPersistentManager.instance().getSession();
			return loadProductsByORMID(session, productid);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Products getProductsByORMID(int productid) {
		try {
			PersistentSession session = ConferenciaPersistentManager.instance().getSession();
			return getProductsByORMID(session, productid);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Products loadProductsByORMID(int productid, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = ConferenciaPersistentManager.instance().getSession();
			return loadProductsByORMID(session, productid, lockMode);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Products getProductsByORMID(int productid, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = ConferenciaPersistentManager.instance().getSession();
			return getProductsByORMID(session, productid, lockMode);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Products loadProductsByORMID(PersistentSession session, int productid) {
		try {
			return (Products) session.load(com.irojas.demojwt.dominio.Products.class, Integer.valueOf(productid));
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Products getProductsByORMID(PersistentSession session, int productid) {
		try {
			return (Products) session.get(com.irojas.demojwt.dominio.Products.class, Integer.valueOf(productid));
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Products loadProductsByORMID(PersistentSession session, int productid, org.hibernate.LockMode lockMode) {
		try {
			return (Products) session.load(com.irojas.demojwt.dominio.Products.class, Integer.valueOf(productid), lockMode);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Products getProductsByORMID(PersistentSession session, int productid, org.hibernate.LockMode lockMode) {
		try {
			return (Products) session.get(com.irojas.demojwt.dominio.Products.class, Integer.valueOf(productid), lockMode);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static List queryProducts(String condition, String orderBy) {
		try {
			PersistentSession session = ConferenciaPersistentManager.instance().getSession();
			return queryProducts(session, condition, orderBy);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static List queryProducts(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = ConferenciaPersistentManager.instance().getSession();
			return queryProducts(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Products[] listProductsByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = ConferenciaPersistentManager.instance().getSession();
			return listProductsByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Products[] listProductsByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = ConferenciaPersistentManager.instance().getSession();
			return listProductsByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static List queryProducts(PersistentSession session, String condition, String orderBy) {
		StringBuffer sb = new StringBuffer("From com.irojas.demojwt.dominio.Products as Products");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.list();
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static List queryProducts(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		StringBuffer sb = new StringBuffer("From com.irojas.demojwt.dominio.Products as Products");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Products", lockMode);
			return query.list();
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Products[] listProductsByQuery(PersistentSession session, String condition, String orderBy) {
		try {
			List list = queryProducts(session, condition, orderBy);
			return (Products[]) list.toArray(new Products[list.size()]);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Products[] listProductsByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			List list = queryProducts(session, condition, orderBy, lockMode);
			return (Products[]) list.toArray(new Products[list.size()]);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Products loadProductsByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = ConferenciaPersistentManager.instance().getSession();
			return loadProductsByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Products loadProductsByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = ConferenciaPersistentManager.instance().getSession();
			return loadProductsByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Products loadProductsByQuery(PersistentSession session, String condition, String orderBy) {
		Products[] productses = listProductsByQuery(session, condition, orderBy);
		if (productses != null && productses.length > 0)
			return productses[0];
		else
			return null;
	}
	
	public static Products loadProductsByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		Products[] productses = listProductsByQuery(session, condition, orderBy, lockMode);
		if (productses != null && productses.length > 0)
			return productses[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateProductsByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = ConferenciaPersistentManager.instance().getSession();
			return iterateProductsByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static java.util.Iterator iterateProductsByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = ConferenciaPersistentManager.instance().getSession();
			return iterateProductsByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static java.util.Iterator iterateProductsByQuery(PersistentSession session, String condition, String orderBy) {
		StringBuffer sb = new StringBuffer("From com.irojas.demojwt.dominio.Products as Products");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.iterate();
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static java.util.Iterator iterateProductsByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		StringBuffer sb = new StringBuffer("From com.irojas.demojwt.dominio.Products as Products");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Products", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Products createProducts() {
		return new com.irojas.demojwt.dominio.Products();
	}
	
	public static boolean save(com.irojas.demojwt.dominio.Products products) {
		try {
			ConferenciaPersistentManager.instance().saveObject(products);
			return true;
		}
		catch (Exception e) {
			return false;
		}
	}
	
	public static boolean delete(com.irojas.demojwt.dominio.Products products) {
		try {
			ConferenciaPersistentManager.instance().deleteObject(products);
			return true;
		}
		catch (Exception e) {
			return false;
		}
	}
	
	public static boolean deleteAndDissociate(com.irojas.demojwt.dominio.Products products) {
		try {
			if (products.getCategory() != null) {
				products.getCategory().products.remove(products);
			}
			
			if (products.getSupplier() != null) {
				products.getSupplier().products.remove(products);
			}
			
			return delete(products);
		}
		catch(Exception e) {
			return false;
		}
	}
	
	public static boolean deleteAndDissociate(com.irojas.demojwt.dominio.Products products, org.orm.PersistentSession session) {
		try {
			if (products.getCategory() != null) {
				products.getCategory().products.remove(products);
			}
			
			if (products.getSupplier() != null) {
				products.getSupplier().products.remove(products);
			}
			
			try {
				session.delete(products);
				return true;
			} catch (Exception e) {
				return false;
			}
		}
		catch(Exception e) {
			return false;
		}
	}
	
	public static boolean refresh(com.irojas.demojwt.dominio.Products products) {
		try {
			ConferenciaPersistentManager.instance().getSession().refresh(products);
			return true;
		}
		catch (Exception e) {
			return false;
		}
	}
	
	public static boolean evict(com.irojas.demojwt.dominio.Products products) {
		try {
			ConferenciaPersistentManager.instance().getSession().evict(products);
			return true;
		}
		catch (Exception e) {
			return false;
		}
	}
	
}
