package com.creativelokha.ourleaders.model;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import com.creativelokha.ourleaders.util.DBConnection;
import com.creativelokha.ourleaders.valueobjects.VoterDetails;

/**
 * Created by Guru on 10/11/2017.
 */
public class VoterDetailsModel {
	final static Logger LOGGER = Logger.getLogger(VoterDetailsModel.class);
	final String TABLE_NAME = "voterId";

	public List<VoterDetails> getAllVOterDetails(DBConnection con) {
		return null;
	}

	public VoterDetails getVoterDetails(long voterId, DBConnection con) {
		return null;
	}

	public void addVoterDetails(List<VoterDetails> voterDetailsList, DBConnection con) {
		String query = " insert into " + TABLE_NAME + " (voter_id) values (?)";
		try {
			PreparedStatement preparedStmt = con.getConnection().prepareStatement(query);
			int i = 0;
			int totalCountInserted = 0;
			for(VoterDetails each: voterDetailsList){				
				preparedStmt.setString(1, each.getVoter_id());
				preparedStmt.addBatch();
				
				i++;

	            if (i % 1000 == 0 || i == voterDetailsList.size()) {
	            	int[] response = preparedStmt.executeBatch(); 
	            	totalCountInserted = totalCountInserted + response.length;	            	
	            }	            
			}
			System.out.println("Total number of voter Id's inserted: "+ totalCountInserted);
		} catch (SQLException e) {			
			System.out.println("Error: "+ e.getStackTrace());
		}
	}

	public void updateVoterDetails(List<VoterDetails> voterDetailsList, DBConnection con) {

	}
}