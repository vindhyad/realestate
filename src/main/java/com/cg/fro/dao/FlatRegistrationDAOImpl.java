package com.cg.fro.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

import com.cg.frs.dto.FlatRegistrationDTO;

public class FlatRegistrationDAOImpl implements IFlatRegistrationDAO {

	

	public ArrayList<Integer> getAllOwnerIds() {
		ArrayList<Integer> arraylist=new ArrayList<Integer>();
		Scanner sc=new Scanner(System.in);
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			try {
				Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/realestates","root","root");
				PreparedStatement preparedstatement=connection.prepareStatement("select * from flat_owners ");
				ResultSet rs=preparedstatement.executeQuery();
				while(rs.next()) {
					arraylist.add(rs.getInt(1));
				}
			}
				catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		return arraylist;
	}

	public FlatRegistrationDTO registerFlat(FlatRegistrationDTO flatRegistrationDto) {
Scanner sc=new Scanner(System.in);
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			try {
				Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/realestates","root","root");
				PreparedStatement preparedstatement=connection.prepareStatement("insert into flat_registration(Owner_ID,flat_type,flat_area,rent_amount,deposit_amount)  values(?,?,?,?,?)");
				preparedstatement.setInt(1,flatRegistrationDto.getOwnerId());
				preparedstatement.setInt(2,flatRegistrationDto.getFlatType());
				preparedstatement.setInt(3,flatRegistrationDto.getFlatarea() );
				
				preparedstatement.setDouble(4,flatRegistrationDto.getRentAmount());
				preparedstatement.setDouble(5, flatRegistrationDto.getDepositAmount());
				
				int i=preparedstatement.executeUpdate();
				if(i==1) {
					preparedstatement=connection.prepareStatement("select * from flat_registration where Owner_ID=?");
					preparedstatement.setInt(1,flatRegistrationDto.getOwnerId() );
					ResultSet rs=preparedstatement.executeQuery();
					while(rs.next()) {
						flatRegistrationDto.setFlatRegNo(rs.getInt(1));
					}
				}
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
				
		return flatRegistrationDto;
	}
}

	


