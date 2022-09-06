package com.cucn.exam.user;

import java.util.ArrayList;

import java.util.List;

public class Test {
	public static void main(String[] args) {

			List<User> userList=new ArrayList<>();
			userList.add(UserFactory.getUser(1));
			userList.add(UserFactory.getUser(2));
			userList.add(UserFactory.getUser(3));
			
			for(User user:userList) {
				user.diffOperation();
			}
		}

}
