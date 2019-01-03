package com.cg.banking.client;
import com.cg.banking.beans.*;

public class MainClass {

	public static void main(String[] args) {
		Transactions[] transactions1=new Transactions[]
				{
						new Transactions("yrue","12.39","ongole","online","fail",4000),
						new Transactions("gdjhh","7.39","guntur","offline","succes",8000)
						
				};
		Transactions[] transactions2=new Transactions[]
				{
						new Transactions("gsghj","4.39","pune","online","fail",6000),
						new Transactions("gdjhh","7.39","guntur","offline","succes",5000)
						
				};
				Account[] account1=new Account[] 
						{
								new Account(1001,"Savings",25000,transactions1),
								new Account(1551,"Savings",28000,transactions2)
								};
				
				
		Customer customer=new Customer(account1, 63473, "Lakshmi", "Somineni");
		for(int i=0;i<account1.length-1;i++)
			for(int j=0;j<transactions2.length-1;j++)
				if(customer.getAccounts()[i].getTransactions()[j].getTransactionLocation()=="ongole")
					System.out.println("At"+""+customer.getAccounts()[i].getTransactions()[j].getTimeStamp());
						

	}

}
