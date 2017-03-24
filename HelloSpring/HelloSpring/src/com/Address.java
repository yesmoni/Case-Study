package com;

public class Address {
	private String cityy;  
	private String state;  
	private String country;  
	  
	public Address(String city, String state, String country) {  
	    super();  
	    this.city = city;  
	    this.state = state;  
	    this.country = country;  
	}  
	  
	public String toString(){  
	    return city+" "+state+" "+country;  
	}  
}
