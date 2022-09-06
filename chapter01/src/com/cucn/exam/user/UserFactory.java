package com.cucn.exam.user;

public class UserFactory {
	public static User getUser(int permission){
		
		if(1==permission) {
			return new Employee();
		}else if(2==permission) {
			return new Manager();
		}else if(3==permission) {
			return new Administrator();
		}else {
			return null;
		}
	}
}