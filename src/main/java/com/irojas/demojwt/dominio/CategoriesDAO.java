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

public class CategoriesDAO {
	public static Categories loadCategoriesByORMID(int categoryid) {
		try {
			PersistentSession session = ConferenciaPersistentManager.instance().getSession();
			return loadCategoriesByORMID(session, categoryid);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Categories getCategoriesByORMID(int categoryid) {
		try {
			PersistentSession session = ConferenciaPersistentManager.instance().getSession();
			return getCategoriesByORMID(session, categoryid);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Categories loadCategoriesByORMID(int categoryid, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = ConferenciaPersistentManager.instance().getSession();
			return loadCategoriesByORMID(session, categoryid, lockMode);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Categories getCategoriesByORMID(int categoryid, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = ConferenciaPersistentManager.instance().getSession();
			return getCategoriesByORMID(session, categoryid, lockMode);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Categories loadCategoriesByORMID(PersistentSession session, int categoryid) {
		try {
			return (Categories) session.load(com.irojas.demojwt.dominio.Categories.class, Integer.valueOf(categoryid));
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Categories getCategoriesByORMID(PersistentSession session, int categoryid) {
		try {
			return (Categories) session.get(com.irojas.demojwt.dominio.Categories.class, Integer.valueOf(categoryid));
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Categories loadCategoriesByORMID(PersistentSession session, int categoryid, org.hibernate.LockMode lockMode) {
		try {
			return (Categories) session.load(com.irojas.demojwt.dominio.Categories.class, Integer.valueOf(categoryid), lockMode);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Categories getCategoriesByORMID(PersistentSession session, int categoryid, org.hibernate.LockMode lockMode) {
		try {
			return (Categories) session.get(com.irojas.demojwt.dominio.Categories.class, Integer.valueOf(categoryid), lockMode);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static List queryCategories(String condition, String orderBy) {
		try {
			PersistentSession session = ConferenciaPersistentManager.instance().getSession();
			return queryCategories(session, condition, orderBy);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static List queryCategories(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = ConferenciaPersistentManager.instance().getSession();
			return queryCategories(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Categories[] listCategoriesByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = ConferenciaPersistentManager.instance().getSession();
			return listCategoriesByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Categories[] listCategoriesByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = ConferenciaPersistentManager.instance().getSession();
			return listCategoriesByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static List queryCategories(PersistentSession session, String condition, String orderBy) {
		StringBuffer sb = new StringBuffer("From com.irojas.demojwt.dominio.Categories as Categories");
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
	
	public static List queryCategories(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		StringBuffer sb = new StringBuffer("From com.irojas.demojwt.dominio.Categories as Categories");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Categories", lockMode);
			return query.list();
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Categories[] listCategoriesByQuery(PersistentSession session, String condition, String orderBy) {
		try {
			List list = queryCategories(session, condition, orderBy);
			return (Categories[]) list.toArray(new Categories[list.size()]);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Categories[] listCategoriesByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			List list = queryCategories(session, condition, orderBy, lockMode);
			return (Categories[]) list.toArray(new Categories[list.size()]);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Categories loadCategoriesByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = ConferenciaPersistentManager.instance().getSession();
			return loadCategoriesByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Categories loadCategoriesByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = ConferenciaPersistentManager.instance().getSession();
			return loadCategoriesByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Categories loadCategoriesByQuery(PersistentSession session, String condition, String orderBy) {
		Categories[] categorieses = listCategoriesByQuery(session, condition, orderBy);
		if (categorieses != null && categorieses.length > 0)
			return categorieses[0];
		else
			return null;
	}
	
	public static Categories loadCategoriesByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		Categories[] categorieses = listCategoriesByQuery(session, condition, orderBy, lockMode);
		if (categorieses != null && categorieses.length > 0)
			return categorieses[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateCategoriesByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = ConferenciaPersistentManager.instance().getSession();
			return iterateCategoriesByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static java.util.Iterator iterateCategoriesByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = ConferenciaPersistentManager.instance().getSession();
			return iterateCategoriesByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static java.util.Iterator iterateCategoriesByQuery(PersistentSession session, String condition, String orderBy) {
		StringBuffer sb = new StringBuffer("From com.irojas.demojwt.dominio.Categories as Categories");
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
	
	public static java.util.Iterator iterateCategoriesByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		StringBuffer sb = new StringBuffer("From com.irojas.demojwt.dominio.Categories as Categories");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Categories", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Categories createCategories() {
		return new com.irojas.demojwt.dominio.Categories();
	}
	
	public static boolean save(com.irojas.demojwt.dominio.Categories categories) {
		try {
			ConferenciaPersistentManager.instance().saveObject(categories);
			return true;
		}
		catch (Exception e) {
			return false;
		}
	}
	
	public static boolean delete(com.irojas.demojwt.dominio.Categories categories) {
		try {
			ConferenciaPersistentManager.instance().deleteObject(categories);
			return true;
		}
		catch (Exception e) {
			return false;
		}
	}
	
	public static boolean deleteAndDissociate(com.irojas.demojwt.dominio.Categories categories) {
		try {
			com.irojas.demojwt.dominio.Products[] lProductss = categories.products.toArray();
			for(int i = 0; i < lProductss.length; i++) {
				lProductss[i].setCategory(null);
			}
			return delete(categories);
		}
		catch(Exception e) {
			return false;
		}
	}
	
	public static boolean deleteAndDissociate(com.irojas.demojwt.dominio.Categories categories, org.orm.PersistentSession session) {
		try {
			com.irojas.demojwt.dominio.Products[] lProductss = categories.products.toArray();
			for(int i = 0; i < lProductss.length; i++) {
				lProductss[i].setCategory(null);
			}
			try {
				session.delete(categories);
				return true;
			} catch (Exception e) {
				return false;
			}
		}
		catch(Exception e) {
			return false;
		}
	}
	
	public static boolean refresh(com.irojas.demojwt.dominio.Categories categories) {
		try {
			ConferenciaPersistentManager.instance().getSession().refresh(categories);
			return true;
		}
		catch (Exception e) {
			return false;
		}
	}
	
	public static boolean evict(com.irojas.demojwt.dominio.Categories categories) {
		try {
			ConferenciaPersistentManager.instance().getSession().evict(categories);
			return true;
		}
		catch (Exception e) {
			return false;
		}
	}
	
}
