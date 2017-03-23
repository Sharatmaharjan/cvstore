package com.cvstore.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="customer")
public class Customer extends User {

	String fathername;
	String mothername;
	String dob;
	String temporaryaddress;
	String permanentaddress;
	String sex;
	String religion;
	String nameofschool;
	String nameofplustwo;
	String nameofbachelor;
	public String getFathername() {
		return fathername;
	}
	public void setFathername(String fathername) {
		this.fathername = fathername;
	}
	public String getMothername() {
		return mothername;
	}
	public void setMothername(String mothername) {
		this.mothername = mothername;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getTemporaryaddress() {
		return temporaryaddress;
	}
	public void setTemporaryaddress(String temporaryaddress) {
		this.temporaryaddress = temporaryaddress;
	}
	public String getPermanentaddress() {
		return permanentaddress;
	}
	public void setPermanentaddress(String permanentaddress) {
		this.permanentaddress = permanentaddress;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getReligion() {
		return religion;
	}
	public void setReligion(String religion) {
		this.religion = religion;
	}
	public String getNameofschool() {
		return nameofschool;
	}
	public void setNameofschool(String nameofschool) {
		this.nameofschool = nameofschool;
	}
	public String getNameofplustwo() {
		return nameofplustwo;
	}
	public void setNameofplustwo(String nameofplustwo) {
		this.nameofplustwo = nameofplustwo;
	}
	public String getNameofbachelor() {
		return nameofbachelor;
	}
	public void setNameofbachelor(String nameofbachelor) {
		this.nameofbachelor = nameofbachelor;
	}
	
	
	
}
