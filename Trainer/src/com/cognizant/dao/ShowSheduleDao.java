package com.cognizant.dao;

import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.cognizant.entity.TrainingShedule;

@Component
public class ShowSheduleDao {

	@PersistenceContext
	private EntityManager em;
	@Transactional
	public void retriveShedule(Date d) {
		// TODO Auto-generated method stub
		
		Query query = em.createQuery("  from TrainingShedule t where t.startDate= ? ");
		System.out.println(d);
		query.setParameter(1, d);
		List<TrainingShedule> results = query.getResultList();
		System.out.println(results);
		
	}

	
	

}
