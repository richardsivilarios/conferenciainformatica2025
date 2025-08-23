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

public class SuppliersDAO {
	public static Suppliers loadSuppliersByORMID(int supplierid) {
		try {
			PersistentSession session = ConferenciaPersistentManager.instance().getSession();
			return loadSuppliersByORMID(session, supplierid);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Suppliers getSuppliersByORMID(int supplierid) {
		try {
			PersistentSession session = ConferenciaPersistentManager.instance().getSession();
			return getSuppliersByORMID(session, supplierid);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Suppliers loadSuppliersByORMID(int supplierid, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = ConferenciaPersistentManager.instance().getSession();
			return loadSuppliersByORMID(session, supplierid, lockMode);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Suppliers getSuppliersByORMID(int supplierid, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = ConferenciaPersistentManager.instance().getSession();
			return getSuppliersByORMID(session, supplierid, lockMode);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Suppliers loadSuppliersByORMID(PersistentSession session, int supplierid) {
		try {
			return (Suppliers) session.load(com.irojas.demojwt.dominio.Suppliers.class, Integer.valueOf(supplierid));
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Suppliers getSuppliersByORMID(PersistentSession session, int supplierid) {
		try {
			return (Suppliers) session.get(com.irojas.demojwt.dominio.Suppliers.class, Integer.valueOf(supplierid));
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Suppliers loadSuppliersByORMID(PersistentSession session, int supplierid, org.hibernate.LockMode lockMode) {
		try {
			return (Suppliers) session.load(com.irojas.demojwt.dominio.Suppliers.class, Integer.valueOf(supplierid), lockMode);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Suppliers getSuppliersByORMID(PersistentSession session, int supplierid, org.hibernate.LockMode lockMode) {
		try {
			return (Suppliers) session.get(com.irojas.demojwt.dominio.Suppliers.class, Integer.valueOf(supplierid), lockMode);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static List querySuppliers(String condition, String orderBy) {
		try {
			PersistentSession session = ConferenciaPersistentManager.instance().getSession();
			return querySuppliers(session, condition, orderBy);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static List querySuppliers(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = ConferenciaPersistentManager.instance().getSession();
			return querySuppliers(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Suppliers[] listSuppliersByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = ConferenciaPersistentManager.instance().getSession();
			return listSuppliersByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Suppliers[] listSuppliersByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = ConferenciaPersistentManager.instance().getSession();
			return listSuppliersByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static List querySuppliers(PersistentSession session, String condition, String orderBy) {
		StringBuffer sb = new StringBuffer("From com.irojas.demojwt.dominio.Suppliers as Suppliers");
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
	
	public static List querySuppliers(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		StringBuffer sb = new StringBuffer("From com.irojas.demojwt.dominio.Suppliers as Suppliers");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Suppliers", lockMode);
			return query.list();
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Suppliers[] listSuppliersByQuery(PersistentSession session, String condition, String orderBy) {
		try {
			List list = querySuppliers(session, condition, orderBy);
			return (Suppliers[]) list.toArray(new Suppliers[list.size()]);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Suppliers[] listSuppliersByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			List list = querySuppliers(session, condition, orderBy, lockMode);
			return (Suppliers[]) list.toArray(new Suppliers[list.size()]);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Suppliers loadSuppliersByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = ConferenciaPersistentManager.instance().getSession();
			return loadSuppliersByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Suppliers loadSuppliersByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = ConferenciaPersistentManager.instance().getSession();
			return loadSuppliersByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Suppliers loadSuppliersByQuery(PersistentSession session, String condition, String orderBy) {
		Suppliers[] supplierses = listSuppliersByQuery(session, condition, orderBy);
		if (supplierses != null && supplierses.length > 0)
			return supplierses[0];
		else
			return null;
	}
	
	public static Suppliers loadSuppliersByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		Suppliers[] supplierses = listSuppliersByQuery(session, condition, orderBy, lockMode);
		if (supplierses != null && supplierses.length > 0)
			return supplierses[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateSuppliersByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = ConferenciaPersistentManager.instance().getSession();
			return iterateSuppliersByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static java.util.Iterator iterateSuppliersByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = ConferenciaPersistentManager.instance().getSession();
			return iterateSuppliersByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static java.util.Iterator iterateSuppliersByQuery(PersistentSession session, String condition, String orderBy) {
		StringBuffer sb = new StringBuffer("From com.irojas.demojwt.dominio.Suppliers as Suppliers");
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
	
	public static java.util.Iterator iterateSuppliersByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		StringBuffer sb = new StringBuffer("From com.irojas.demojwt.dominio.Suppliers as Suppliers");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Suppliers", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Suppliers createSuppliers() {
		return new com.irojas.demojwt.dominio.Suppliers();
	}
	
	public static boolean save(com.irojas.demojwt.dominio.Suppliers suppliers) {
		try {
			ConferenciaPersistentManager.instance().saveObject(suppliers);
			return true;
		}
		catch (Exception e) {
			return false;
		}
	}
	
	public static boolean delete(com.irojas.demojwt.dominio.Suppliers suppliers) {
		try {
			ConferenciaPersistentManager.instance().deleteObject(suppliers);
			return true;
		}
		catch (Exception e) {
			return false;
		}
	}
	
	public static boolean deleteAndDissociate(com.irojas.demojwt.dominio.Suppliers suppliers) {
		try {
			com.irojas.demojwt.dominio.Products[] lProductss = suppliers.products.toArray();
			for(int i = 0; i < lProductss.length; i++) {
				lProductss[i].setSupplier(null);
			}
			return delete(suppliers);
		}
		catch(Exception e) {
			return false;
		}
	}
	
	public static boolean deleteAndDissociate(com.irojas.demojwt.dominio.Suppliers suppliers, org.orm.PersistentSession session) {
		try {
			com.irojas.demojwt.dominio.Products[] lProductss = suppliers.products.toArray();
			for(int i = 0; i < lProductss.length; i++) {
				lProductss[i].setSupplier(null);
			}
			try {
				session.delete(suppliers);
				return true;
			} catch (Exception e) {
				return false;
			}
		}
		catch(Exception e) {
			return false;
		}
	}
	
	public static boolean refresh(com.irojas.demojwt.dominio.Suppliers suppliers) {
		try {
			ConferenciaPersistentManager.instance().getSession().refresh(suppliers);
			return true;
		}
		catch (Exception e) {
			return false;
		}
	}
	
	public static boolean evict(com.irojas.demojwt.dominio.Suppliers suppliers) {
		try {
			ConferenciaPersistentManager.instance().getSession().evict(suppliers);
			return true;
		}
		catch (Exception e) {
			return false;
		}
	}
	
}
