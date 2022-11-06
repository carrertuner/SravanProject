package com.ct.demo.service;

import com.ct.demo.entity.EmpDetails;

public interface EmpDetailsService {
	public abstract String addEmpDetails(EmpDetails empDetails);
	public abstract String updateEmpDetails(EmpDetails empDetails);
	public abstract String deleteEmpDetails(String firstName);
	public abstract EmpDetails getEmpDetails(String firstName);

}
