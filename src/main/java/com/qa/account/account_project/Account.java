package com.qa.account.account_project;

public class Account 
{
	String firstName;
	String lastName;
	int accNum;
	public Account(String fn, String ln, int acc)
	{
		firstName = fn;
		lastName = ln;
		accNum = acc;
	}
	
	public String getFirstName()
	{
		return firstName;
	}
	
	public String getLastName()
	{
		return lastName;
	}
	
	public int getAccNum()
	{
		return accNum;
	}
	
}
