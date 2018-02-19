package com.qa.account.account_project;

import java.util.HashMap;
import java.util.ServiceConfigurationError;
import org.json.simple.JSONObject;


public class AccountMain 
{
	
	private static Service service = new Service();
	public static void main(String [] args)
	{
		
		service.addToMap(new Account("Tony", "Shannon",1));
		service.addToMap(new Account("Decland", "Horlick",2));
		
		int accNum =1;
		PrintAccount(accNum);
		service.ConvertToJSON();
		
	}
	
	private static void PrintAccount(int accNum) 
	{
		// TODO Auto-generated method stub
		System.out.println(service.getFromMap(accNum));
	}
	
	
}
