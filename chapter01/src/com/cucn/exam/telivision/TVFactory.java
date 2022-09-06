package com.cucn.exam.telivision;

import com.cucn.exam.TV;

public class TVFactory {
	public static TV productTV(String brand) {
		
		try {
			return (TV)Class.forName(brand).newInstance();
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;	
	}

}