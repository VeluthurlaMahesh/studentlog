package com.log4jexample;

import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.log4j.pojo.Customer;
import com.log4j.pojo.CustomerService;

public class Test1 {


	public static void main(String[] args) {
		

		
		CustomerService customerService = new CustomerService();
		
		List<Customer>list=new ArrayList();
		Customer c=new Customer();
		c.setCid(101);
		c.setCname("brahma");
		c.setCaddress("darsi");
		
		Customer c1=new Customer();
		c1.setCid(102);
		c1.setCname("srinu");
		c1.setCaddress("pothavram");
		
		Customer c2=new Customer();
		c2.setCid(103);
		c2.setCname("mahesh");
		c2.setCaddress("devarapalem");
		
		Customer c3=new Customer();
		c3.setCid(104);
		c3.setCname("dinesh");
		c3.setCaddress("ongole");
		
		list.add(c);
		list.add(c1);
		list.add(c2);
		list.add(c3);
		
		List<String> test34	=customerService.getcustomeraddress(list);
		System.out.println(test34);
		
		
	}

	

	

}
