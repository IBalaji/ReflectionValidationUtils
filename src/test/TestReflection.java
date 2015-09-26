package test;

import java.util.ArrayList;
import java.util.Date;
import java.util.Map;

import pojo.User;
import validators.UserValidator;

public class TestReflection {

	public static void main(String[] args) throws IllegalArgumentException, IllegalAccessException, NoSuchFieldException, SecurityException {
		User user = new User("Balaji", "Iyengar", "Mumbai", 
				new ArrayList<String>(){{add("asd");add("asdasd");}}, 24 , new Date());
	
		Map<String,String> fieldWithErrorDescMap = UserValidator.checkForErrors(user);
		
		System.err.println(fieldWithErrorDescMap);
	}
	
}
