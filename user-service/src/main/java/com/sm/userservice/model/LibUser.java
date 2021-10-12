package com.sm.userservice.model;

import org.springframework.data.annotation.Id;

import com.azure.spring.data.cosmos.core.mapping.Container;
import com.azure.spring.data.cosmos.core.mapping.GeneratedValue;
import com.azure.spring.data.cosmos.core.mapping.PartitionKey;

@Container(containerName = "smcosmocollection")
public class LibUser {
	@Id
	@GeneratedValue
	private String id;
	private String fname;
	@PartitionKey
	private String lname;
	private String age;
	
	public LibUser() {
	}
	
	public LibUser(String fname, String lname, String age){
		this.fname = fname;
		this.lname = lname;
		this.age = age;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getId() {
		return id;
	}
	public void setFname(String name) {
		this.fname = name;
	}
	public String getFname() {
		return fname;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getAge() {
		return age;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getLname() {
		return lname;
	}
	@Override
	public String toString() {
		String str = new StringBuilder("[").append(fname).append(", ").append(lname).append(", ")
				.append(age).append("]").toString();
		return str;
	}
}
