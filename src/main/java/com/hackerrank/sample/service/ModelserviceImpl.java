package com.hackerrank.sample.service;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.json.simple.JSONObject;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.hackerrank.sample.model.Employee;
import com.hackerrank.sample.model.Employees;


public interface ModelserviceImpl extends ModelService {
	
	public default void createModel(Employees employee) throws JsonParseException, JsonMappingException, IOException
	{
		final ObjectMapper mapper=new ObjectMapper();
		mapper.enable(SerializationFeature.INDENT_OUTPUT);
		
	
	try
	{
		List<Employees> ls=new ArrayList<>();
		ls.add(employee);
		mapper.writeValue(new File("/sample/employee.json"),ls);
	}
	catch(IOException e) {
		e.printStackTrace();
	}
	try
	{
		ObjectMapper mapper2=new ObjectMapper();
		List<Employees> data=Arrays.asList(mapper2.readValue(Paths.get("/sample/employee.json").toFile(),Employees[].class));
		
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	
		
 
       

	}
        
        

}
