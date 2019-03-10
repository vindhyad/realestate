package com.cg.fro.service;

import java.util.ArrayList;

import com.cg.fro.dao.FlatRegistrationDAOImpl;
import com.cg.fro.dao.IFlatRegistrationDAO;
import com.cg.frs.dto.FlatRegistrationDTO;

public class FlatRegistratonServiceImpl implements IFlatRegistrationService{
	IFlatRegistrationDAO iflatregistrationdao=new   FlatRegistrationDAOImpl ();
	public FlatRegistrationDTO registerFlat(FlatRegistrationDTO flatRegistrationDto) {
		FlatRegistrationDTO frd=iflatregistrationdao.registerFlat(flatRegistrationDto);
		return frd;
	}

	public ArrayList<Integer> getAllOwnerIds() {
		ArrayList<Integer> al=iflatregistrationdao.getAllOwnerIds();
		return al;
	}

}
