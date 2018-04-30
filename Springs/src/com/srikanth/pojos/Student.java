package com.srikanth.pojos;


public class Student {

	public int StudentID;
	public String FirstName;
	public String LastName;
	public String Email;
	public String Branch;
	public String Phone;
 
    
    
    public int getStudentID() {
		return StudentID;
	}
	public void setStudentID(int studentID) {
		StudentID = studentID;
	}
	
    
    public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
 
    public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	
    public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	
	public String getBranch() {
		return Branch;
	}
	public void setBranch(String branch) {
		Branch = branch;
	}
	
	public String getPhone() {
		return Phone;
	}
	public void setPhone(String phone) {
		Phone = phone;
	}

}
