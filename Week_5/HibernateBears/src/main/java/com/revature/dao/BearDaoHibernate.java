package com.revature.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import static org.hibernate.criterion.Restrictions.*;

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

}
