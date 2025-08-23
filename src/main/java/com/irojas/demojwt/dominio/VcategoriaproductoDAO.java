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

public class VcategoriaproductoDAO {
	public static Vcategoriaproducto loadVcategoriaproductoByORMID(Long llaveprimaria) {
		try {
			PersistentSession session = ConferenciaPersistentManager.instance().getSession();
			return loadVcategoriaproductoByORMID(session, llaveprimaria);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Vcategoriaproducto getVcategoriaproductoByORMID(Long llaveprimaria) {
		try {
			PersistentSession session = ConferenciaPersistentManager.instance().getSession();
			return getVcategoriaproductoByORMID(session, llaveprimaria);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Vcategoriaproducto loadVcategoriaproductoByORMID(Long llaveprimaria, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = ConferenciaPersistentManager.instance().getSession();
			return loadVcategoriaproductoByORMID(session, llaveprimaria, lockMode);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Vcategoriaproducto getVcategoriaproductoByORMID(Long llaveprimaria, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = ConferenciaPersistentManager.instance().getSession();
			return getVcategoriaproductoByORMID(session, llaveprimaria, lockMode);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Vcategoriaproducto loadVcategoriaproductoByORMID(PersistentSession session, Long llaveprimaria) {
		try {
			return (Vcategoriaproducto) session.load(com.irojas.demojwt.dominio.Vcategoriaproducto.class, llaveprimaria);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Vcategoriaproducto getVcategoriaproductoByORMID(PersistentSession session, Long llaveprimaria) {
		try {
			return (Vcategoriaproducto) session.get(com.irojas.demojwt.dominio.Vcategoriaproducto.class, llaveprimaria);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Vcategoriaproducto loadVcategoriaproductoByORMID(PersistentSession session, Long llaveprimaria, org.hibernate.LockMode lockMode) {
		try {
			return (Vcategoriaproducto) session.load(com.irojas.demojwt.dominio.Vcategoriaproducto.class, llaveprimaria, lockMode);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Vcategoriaproducto getVcategoriaproductoByORMID(PersistentSession session, Long llaveprimaria, org.hibernate.LockMode lockMode) {
		try {
			return (Vcategoriaproducto) session.get(com.irojas.demojwt.dominio.Vcategoriaproducto.class, llaveprimaria, lockMode);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static List queryVcategoriaproducto(String condition, String orderBy) {
		try {
			PersistentSession session = ConferenciaPersistentManager.instance().getSession();
			return queryVcategoriaproducto(session, condition, orderBy);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static List queryVcategoriaproducto(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = ConferenciaPersistentManager.instance().getSession();
			return queryVcategoriaproducto(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Vcategoriaproducto[] listVcategoriaproductoByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = ConferenciaPersistentManager.instance().getSession();
			return listVcategoriaproductoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Vcategoriaproducto[] listVcategoriaproductoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = ConferenciaPersistentManager.instance().getSession();
			return listVcategoriaproductoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static List queryVcategoriaproducto(PersistentSession session, String condition, String orderBy) {
		StringBuffer sb = new StringBuffer("From com.irojas.demojwt.dominio.Vcategoriaproducto as Vcategoriaproducto");
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
	
	public static List queryVcategoriaproducto(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		StringBuffer sb = new StringBuffer("From com.irojas.demojwt.dominio.Vcategoriaproducto as Vcategoriaproducto");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Vcategoriaproducto", lockMode);
			return query.list();
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Vcategoriaproducto[] listVcategoriaproductoByQuery(PersistentSession session, String condition, String orderBy) {
		try {
			List list = queryVcategoriaproducto(session, condition, orderBy);
			return (Vcategoriaproducto[]) list.toArray(new Vcategoriaproducto[list.size()]);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Vcategoriaproducto[] listVcategoriaproductoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			List list = queryVcategoriaproducto(session, condition, orderBy, lockMode);
			return (Vcategoriaproducto[]) list.toArray(new Vcategoriaproducto[list.size()]);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Vcategoriaproducto loadVcategoriaproductoByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = ConferenciaPersistentManager.instance().getSession();
			return loadVcategoriaproductoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Vcategoriaproducto loadVcategoriaproductoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = ConferenciaPersistentManager.instance().getSession();
			return loadVcategoriaproductoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Vcategoriaproducto loadVcategoriaproductoByQuery(PersistentSession session, String condition, String orderBy) {
		Vcategoriaproducto[] vcategoriaproductos = listVcategoriaproductoByQuery(session, condition, orderBy);
		if (vcategoriaproductos != null && vcategoriaproductos.length > 0)
			return vcategoriaproductos[0];
		else
			return null;
	}
	
	public static Vcategoriaproducto loadVcategoriaproductoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		Vcategoriaproducto[] vcategoriaproductos = listVcategoriaproductoByQuery(session, condition, orderBy, lockMode);
		if (vcategoriaproductos != null && vcategoriaproductos.length > 0)
			return vcategoriaproductos[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateVcategoriaproductoByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = ConferenciaPersistentManager.instance().getSession();
			return iterateVcategoriaproductoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static java.util.Iterator iterateVcategoriaproductoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = ConferenciaPersistentManager.instance().getSession();
			return iterateVcategoriaproductoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static java.util.Iterator iterateVcategoriaproductoByQuery(PersistentSession session, String condition, String orderBy) {
		StringBuffer sb = new StringBuffer("From com.irojas.demojwt.dominio.Vcategoriaproducto as Vcategoriaproducto");
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
	
	public static java.util.Iterator iterateVcategoriaproductoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		StringBuffer sb = new StringBuffer("From com.irojas.demojwt.dominio.Vcategoriaproducto as Vcategoriaproducto");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Vcategoriaproducto", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static boolean refresh(com.irojas.demojwt.dominio.Vcategoriaproducto vcategoriaproducto) {
		try {
			ConferenciaPersistentManager.instance().getSession().refresh(vcategoriaproducto);
			return true;
		}
		catch (Exception e) {
			return false;
		}
	}
	
	public static boolean evict(com.irojas.demojwt.dominio.Vcategoriaproducto vcategoriaproducto) {
		try {
			ConferenciaPersistentManager.instance().getSession().evict(vcategoriaproducto);
			return true;
		}
		catch (Exception e) {
			return false;
		}
	}
	
}
