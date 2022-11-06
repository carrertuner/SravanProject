package com.ct.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ct.demo.dao.EmpDetailsDao;
import com.ct.demo.entity.EmpDetails;
@Service
public class EmpDetailsServiceimpl implements EmpDetailsService{
@Autowired
EmpDetailsDao dao;
	@Override
	public String addEmpDetails(EmpDetails empDetails) {
		// TODO Auto-generated method stub
		return dao.addEmpDetails(empDetails);
	}
	@Override
	public String updateEmpDetails(EmpDetails empDetails) {
		// TODO Auto-generated method stub
		return dao.updateEmpDetails(empDetails);
	}
	@Override
	public String deleteEmpDetails(String firstName) {
		// TODO Auto-generated method stub
		return dao.deleteEmpDetails(firstName);
	}
	@Override
	public EmpDetails getEmpDetails(String firstName) {
		// TODO Auto-generated method stub
		return dao.getEmpDetails(firstName);
	}

}
