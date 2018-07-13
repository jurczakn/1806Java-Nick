package com.revature.dao;

import static org.hibernate.criterion.Restrictions.and;
import static org.hibernate.criterion.Restrictions.eq;
import static org.hibernate.criterion.Restrictions.eqOrIsNull;
import static org.hibernate.criterion.Restrictions.ilike;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.revature.pojos.Bear;
import com.revature.util.ConnectionUtil;

public class BearDaoHibernate implements BearDao {
	
	public Bear getBear(int id) {
		
		return (Bear) ConnectionUtil.getSession().get(Bear.class, id);
	}

	public List<Bear> getAllBears() {
		Session sess = ConnectionUtil.getSession();
		Criteria criteria = sess.createCriteria(Bear.class);
		criteria.add(and(
				eqOrIsNull("height", 6.0), 
				ilike("bearColor", "blue"),
				eq("weight", 10.0)));
		return criteria.list();
	}

	public Bear putBear(Bear bear) {
		
		Session sess = ConnectionUtil.getSession();
		
		Transaction tx = sess.beginTransaction();
		
		sess.save(bear);
		
		tx.commit();
		
		return bear;
		
	}

	public void updateBear(Bear bear) {
		// TODO Auto-generated method stub
		return;
	}

	public void removeBear(Bear bear) {
		// TODO Auto-generated method stub

	}

	public void feedBear(int bearId, double fat) {
		
		Session sess = ConnectionUtil.getSession();
		
		String hql = "UPDATE Bear SET weight = weight + :fat WHERE bearId = :bearId";
		
		Query query = sess.createQuery(hql);
		
		Transaction tx = sess.beginTransaction();
		
		query.setParameter("fat", fat);
		query.setParameter("bearId", bearId);
		
		query.executeUpdate();
		
		tx.commit();
		
		hql = "FROM Bear As b WHERE b.breed = :type";
		
		query = sess.createQuery(hql);
		
		query.setParameter("type", "Grizzly Bear");
		
		List<Bear> bears = query.list();
		
		
	}

}
