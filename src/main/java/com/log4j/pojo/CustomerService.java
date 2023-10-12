package com.log4j.pojo;

import java.util.List;
import java.util.stream.Collectors;

import com.log4jexample.Test1;


public class CustomerService {

	public List<String> getcustomeraddress(List<Customer>cstlist) {
		List<String>lic=cstlist.stream().map(m->m.getCaddress()).collect(Collectors.toList());
		return lic;
	}

}
