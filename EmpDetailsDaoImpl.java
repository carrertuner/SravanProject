package com.ct.demo.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.ct.demo.entity.EmpDetails;
@Repository
@Transactional
public class EmpDetailsDaoImpl implements EmpDetailsDao{
@PersistenceContext
EntityManager em;
	@Override
	public String addEmpDetails(EmpDetails empDetails) {
		em.persist(empDetails);
		return "Details added Sucessfully";
	}
	@Override
	public String updateEmpDetails(EmpDetails empDetails) {
		em.merge(empDetails);
		return "Details updated Sucessfully";
	}
	@Override
	public String deleteEmpDetails(String firstName) {
		EmpDetails empDetails=em.find(EmpDetails.class, firstName);
		em.remove(empDetails);
		return "empdetails deleted sucessfully";
	}
	@Override
	public EmpDetails getEmpDetails(String firstName) {
		return em.find(EmpDetails.class, firstName);
	}
	

}
