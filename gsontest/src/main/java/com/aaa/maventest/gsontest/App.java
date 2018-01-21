package com.aaa.maventest.gsontest;

import com.google.gson.Gson;
//a comment
/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		Gson gson = new Gson();
		// String s = gson.toJson("hello", String.class);
		// System.out.println(s);
		// AppTest appTest = new AppTest("maven_tset");
		Emp emp = new Emp();
		emp.setId(15);
		emp.setName("尼根 rick hey");

		String EmpGson = gson.toJson(emp,Emp.class);
		System.out.println(EmpGson);

	}
}
