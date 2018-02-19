package com.qa.account.account_project;
import java.util.HashMap;

import org.json.simple.JSONObject;

public class Service 
{
	private int count =0;
	private HashMap<Integer, Account> map;
	
	public Service()
	{
		map = new HashMap<Integer, Account>();
	}
	
	public void addToMap (Account account)
	{
		count++;
		map.put(count, account);
	}
	
	public Account getFromMap(int accNum)
	{
		return map.get(accNum);
	}
	
	public void ConvertToJSON()
	{
		JSONObject obj = new JSONObject(map);
		String jsonConvert = obj.toJSONString();
		System.out.println(jsonConvert);
		System.out.println(obj);
	}
}
