package com.creativelokha.ourleaders.util;

import org.apache.log4j.Logger;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Guru on 10/11/2017.
 */
public class FileUtils {
    final static Logger LOGGER = Logger.getLogger(FileUtils.class);

    public String readFile(File file) throws IOException{
    	BufferedReader bReader = new BufferedReader(new FileReader(file));
    	try{
        	StringBuilder sb = new StringBuilder();
        	String line = bReader.readLine();
        	while(line != null){
        		sb.append(line);
        		sb.append("\n");
        		line = bReader.readLine();
        	}
        	return sb.toString();
    	}finally{
    		bReader.close();
    	} 
    }
    
    public List<String> readDirecroty(File directory) throws IOException{
    	List<String> list = new ArrayList();
    	
    	System.out.println("Reading directory: "+ directory.getPath());
    	
        for (final File fileEntry : directory.listFiles()) {
            if (fileEntry.isDirectory()) {
            	readDirecroty(fileEntry);
            } else {
            	System.out.println("Reading file: "+ fileEntry.getName());
            	list.add(readFile(fileEntry));
            }
        }
        return list;
    }
}
