package com.dxc.pojos;
import org.springframework.data.annotation.Id;


import org.springframework.data.mongodb.core.mapping.Document;


@Document
public class Admin 
{
@Id
private String adminid;
private String password;

public Admin(){
	
}

public Admin(String adminid, String password) {
	super();
	this.adminid = adminid;
	this.password = password;
}

public String getAdminid() {
	return adminid;
}

public void setAdminid(String adminid) {
	this.adminid = adminid;
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}

@Override
public String toString() {
	return "Admin [adminid=" + adminid + ", password=" + password + "]";
}

}
































