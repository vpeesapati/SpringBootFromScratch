package com.example.springboot.hello;

public class TestJackson {

	private String name;
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	private String age;
	private String company;
	
	public TestJackson(String name, String age, String company){
		this.name=name;
		this.age=age;
		this.company=company;
	}
	
	
}
