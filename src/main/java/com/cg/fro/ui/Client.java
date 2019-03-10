package com.cg.fro.ui;

import java.util.ArrayList;
import java.util.Scanner;

import com.cg.fro.service.FlatRegistratonServiceImpl;
import com.cg.fro.service.IFlatRegistrationService;
import com.cg.frs.dto.FlatRegistrationDTO;

public class Client {

	public static void main(String[] args) {
		IFlatRegistrationService iflatregistrationservice=new FlatRegistratonServiceImpl();
		FlatRegistrationDTO flatRegistrationDto =new FlatRegistrationDTO();
		Scanner sc=new Scanner(System.in);
		System.out.println("menu ");
		System.out.println("1.Register Flat /n 2.Exit ");
		int option=sc.nextInt();
		if(option==1) {
			ArrayList<Integer> al=iflatregistrationservice.getAllOwnerIds();
			System.out.println("Existing Owner IDS are" + al);
			System.out.println("please enter your owner id from the above list");
			flatRegistrationDto.setOwnerId(sc.nextInt());
			System.out.println("select flat type");
			flatRegistrationDto.setFlatType(sc.nextInt());
			System.out.println("enter flat area in sq.ft:");
			flatRegistrationDto.setFlatarea(sc.nextInt());
			System.out.println("enter desired rent amount Rs:");
			flatRegistrationDto.setRentAmount(sc.nextInt());
			System.out.println("Enter desired deposit amount Rs:");
			flatRegistrationDto.setDepositAmount(sc.nextInt());
			
				if( flatRegistrationDto.getRentAmount()< flatRegistrationDto.getDepositAmount() ) {
					flatRegistrationDto=iflatregistrationservice.registerFlat(flatRegistrationDto);
			System.out.println("Successfully registered. Registration id is "+flatRegistrationDto.getFlatRegNo());
		}
		}
		else if(option==2) {
			System.out.println("Exit");
		}
		
		
	
			

	}

}
