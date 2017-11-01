package com.creativelokha.ourleaders.parser;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.log4j.Logger;

import com.creativelokha.ourleaders.model.VoterDetailsModel;
import com.creativelokha.ourleaders.util.DBConnection;
import com.creativelokha.ourleaders.util.FileUtils;
import com.creativelokha.ourleaders.valueobjects.VoterDetails;

/**
 * Created by Guru on 10/11/2017.
 */
public class ParseVoterIDFromFile {
	final static Logger LOGGER = Logger.getLogger(ParseVoterIDFromFile.class);
	
	final String MATCH_PATTERN = "[A-Z]{3}[0-9]{7}";
	private DBConnection dbConnection = null;
	private VoterDetailsModel voterDetailsModel = null;

	public ParseVoterIDFromFile() {
		dbConnection = new DBConnection();
		voterDetailsModel = new VoterDetailsModel();
	}
	
	public void readFileAndParseData(String filePath) throws IOException{
		System.out.println("Starting!!!!");
		
		FileUtils fUtils = new FileUtils();
		Pattern pt = Pattern.compile(MATCH_PATTERN);

		List<String> outputList = fUtils.readDirecroty(new File(filePath));
		List<VoterDetails> voterIdList = new ArrayList<VoterDetails>();

		if (outputList.size() > 0) {
			for (String s : outputList) {
				Matcher match = pt.matcher(s);
				while (match.find()) {
					VoterDetails detail = new VoterDetails();
					detail.setVoter_id(match.group());
					voterIdList.add(detail);
				}
			}
			System.out.println("Number of Voter ID's getting inserted: " + voterIdList.size());
		}

		voterDetailsModel.addVoterDetails(voterIdList, dbConnection);
		dbConnection.closeConnection(dbConnection.getConnection());
		System.out.println("Done!!!!");
	}
	
	public static void main(String[] args) throws IOException {
		if (args.length == 1) {
			ParseVoterIDFromFile pv = new ParseVoterIDFromFile();
			pv.readFileAndParseData(args[0]);
		} else {
			System.out.println("Please pass directory path to be parsed as an input");
		}
	}
}
