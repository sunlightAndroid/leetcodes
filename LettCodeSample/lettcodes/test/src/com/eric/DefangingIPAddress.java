package com.eric;

public class DefangingIPAddress {

	
	
	
	/**
	 * Given a valid (IPv4) IP address, return a defanged version of that IP address.
     *  A defanged IP address replaces every period "." with "[.]".
	 */
	public String defangIPaddr(String address) {
		
		
		return address.replace(".", "[.]");

	}

}
