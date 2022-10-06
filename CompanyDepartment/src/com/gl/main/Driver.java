package com.gl.main;

import com.gl.department.Admin_Department;
import com.gl.department.HR_Department;
import com.gl.department.Tech_Department;

public class Driver {

	public static void main(String[] args) {

		Admin_Department admin = new Admin_Department();
		HR_Department hr = new HR_Department();
		Tech_Department tech = new Tech_Department();
		
		System.out.println("Welcome to " + admin.departmentName());
		System.out.println(admin.getTodaysWork());
		System.out.println(admin.getWorkDeadline());
		System.out.println(admin.isTodayAHoliday());
		System.out.println();
		
		System.out.println("Welcome to " + hr.departmentName());
		System.out.println(hr.doActivity());
		System.out.println(hr.getTodaysWork());
		System.out.println(hr.getWorkDeadline());
		System.out.println(hr.isTodayAHoliday());
		System.out.println();
		
		System.out.println("Welcome to " + tech.departmentName());
		System.out.println(tech.getTodaysWork());
		System.out.println(tech.getWorkDeadline());
		System.out.println(tech.getTechStackInformation());
		System.out.println(tech.isTodayAHoliday());

	}

}
