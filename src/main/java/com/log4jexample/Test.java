 package com.log4jexample;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

import java.util.stream.Collectors;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.log4j.pojo.Student;

public class Test {
	
	public static Logger logger =LogManager.getLogger(Test.class);

	public static void main(String[] args) {
		
		logger.debug(" starting :main :Test");
		
		List<Student>li=new ArrayList();
		
		Student st=new Student();
		st.setSid(1);
		st.setSname("mahesh");
		st.setMarks(70);
		st.setAddress("devarapalem");
		
		Student st1=new Student();
		st1.setSid(2);
		st1.setSname("deepu");
		st1.setMarks(40);
		st1.setAddress("darsi");
		
		Student st2=new Student();
		st2.setSid(3);
		st2.setSname("ramu");
		st2.setMarks(90);
		st2.setAddress("ongole");
		
		Student st3=new Student();
		st3.setSid(4);
		st3.setSname("venky");
		st3.setMarks(30);
		st3.setAddress("hyderabad");
		
		Student st4=new Student();
		st4.setSid(5);
		st4.setSname("sanjeev");
		st4.setMarks(60);
		st4.setAddress("chimakurthy");
		
		li.add(st);
		li.add(st1);
		li.add(st2);
		li.add(st3);
		li.add(st4);
		
	Test ts=new Test();
	
	
	logger.debug("Before call save method"+li);
	List<String> list=ts.save(li);
	logger.debug("after  save method End Test:Main"+list);
	
	}
	List<String> save(List<Student> stdlist) {
		logger.debug(" starting :save :Test");
		List<String> nameslist=stdlist.stream().map(x->x.getSname()).collect(Collectors.toList());
		logger.debug(" End :save :Test");
		return nameslist;
		
	}

}
