package com.cucn.exam.telivision;

import java.util.ArrayList;
import java.util.List;

import com.cucn.exam.TV;
import com.cucn.exam.user.User;
import com.cucn.exam.user.UserFactory;

public class Test {
	public static void main(String[] args) {
		List<TV> tvList=new ArrayList<>();
		tvList.add(TVFactory.productTV("com.cucn.exam.telivision.HaierTV"));
		tvList.add(TVFactory.productTV("com.cucn.exam.telivision.HisenseTV"));
		
		for(TV tv:tvList) {
			tv.play();
		}
	}
}
