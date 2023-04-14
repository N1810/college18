package com.College.Dao;

import java.util.Iterator;
import java.util.List;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.College.Entity.College;

@Repository
public class CollegeDaoImpl implements CollegeDo {

	@Autowired
	EntityManager entityManager;

	@Override
	public College getcoll(String id) {

		System.out.println(id);

		College sc = new College();
		Session session = null;

		if (entityManager == null || (session = entityManager.unwrap(Session.class)) == null) {

			throw new NullPointerException();
		}
		System.out.println();
		try {

			Criteria criteria = session.createCriteria(College.class);
			Criterion criterion = Restrictions.eq("id", id);

			List cl = criteria.add(criterion).list();

			Iterator iter = cl.iterator();

			while (iter.hasNext()) {
				sc = (College) iter.next();

			}
		}

		catch (Exception e) {
			System.out.println(e);
		}

		return sc;

	}

	@Transactional
	public College addoneclg(College clg) {
		College sc = new College();

		Session session = null;

		if (entityManager == null || (session = entityManager.unwrap(Session.class)) == null) {

			throw new NullPointerException();
		}

		System.out.println("here");
		Criteria criteria = session.createCriteria(College.class);
		Criterion criterion = Restrictions.eq("clg_id", clg.getclg_id());

		List clgs = criteria.add(criterion).list();
		Iterator iter = clgs.iterator();

		while (iter.hasNext()) {
			sc = (College) iter.next();

		}
		System.out.println("neeraj kumar thakur");

		if (sc.getclg_id() == null) {
			session.save(clg);

			System.out.println("kumar..................................................");
		}

		else

		{

			return sc;

		}

		return clg;
	}

	@Transactional
	public String deleteoneclg(String clg_id) {
		Session session = null;
		College sc = new College();

		if (entityManager == null || (session = entityManager.unwrap(Session.class)) == null) {

			throw new NullPointerException();
		}

		Criteria criteria = session.createCriteria(College.class);
		Criterion criterion = Restrictions.eq("clg_id", clg_id);

		List clgs = criteria.add(criterion).list();
		Iterator iter = clgs.iterator();

		while (iter.hasNext()) {
			sc = (College) iter.next();

		}

		if (sc.getclg_id() == null) {
			System.out.println("user not found");

			return "user not found";
		}

		else {

			session.delete(sc);

		}

		return "Deleted Successfully";
	}

	@Transactional
	public String updateoneclg(College clg) {
		Session session = null;
		College sc = new College();
		if (entityManager == null || (session = entityManager.unwrap(Session.class)) == null) {

			throw new NullPointerException();
		}

		Criteria criteria = session.createCriteria(College.class);
		Criterion criterion = Restrictions.eq("clg_id", clg.getclg_id());

		List clgs = criteria.add(criterion).list();

		Iterator iter = clgs.iterator();

		while (iter.hasNext()) {
			sc = (College) iter.next();

		}

		if (sc.getCollegeName() == null) {
			System.out.println("user not found");

			return "User not found";
		}

		else {

			sc.setCollegeName(clg.getCollegeName());
			sc.setCourseName(clg.getCourseName());
			sc.setCourseFee(clg.getCourseFee());

			sc.setDuration(clg.getDuration());

			sc.setAccommodation(clg.getAccommodation());
			sc.setAccommodationFee(clg.getAccommodationFee());
			session.saveOrUpdate(sc);

			System.out.println(clg.toString());

			return "Updated Successfully";

		}

	}

	@Override
	public List<College> getallclg() {

		College sc = new College();

		Session session = null;

		if (entityManager == null || (session = entityManager.unwrap(Session.class)) == null) {

			throw new NullPointerException();
		}

		try {

			Criteria criteria = session.createCriteria(College.class);

			List clg = criteria.list();

			return clg;
		}

		catch (Exception e) {
			// TODO: handle exception
			return null;
		}

	}
}
