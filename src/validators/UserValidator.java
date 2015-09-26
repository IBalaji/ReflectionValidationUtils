package validators;

import java.lang.reflect.Field;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserValidator {

	public static Map<String, String> checkForErrors(Object obj) throws IllegalArgumentException, IllegalAccessException, NoSuchFieldException, SecurityException {
		Map<String, String> errorMap = new HashMap<String, String>();
		
		if(null != obj){
			
			Field[] declaredFields = obj.getClass().getDeclaredFields();
			
			for (Field field : declaredFields) {
				field.setAccessible(true);
				
				if(field.getType() == String.class){
					if(null == field.get(obj) || (null != field.get(obj) && field.get(obj).toString().trim().length() == 0 ))
					{
						errorMap.put(field.getName(), "Empty or Null Values Aren't Allowed");
					}
					continue;
				}
				
				if(field.getType() == List.class){
					if(null == field.get(obj) || (null != field.get(obj) && ((List<String>)(field.get(obj))).size() == 0 ))
					{
						errorMap.put(field.getName(), "Collections cannot be null or empty");
					}
					continue;
				}
				
				if(field.getType() == int.class){
					if(null == field.get(obj) || (null != field.get(obj) && field.get(obj).toString().equals("0") ))
					{
						errorMap.put(field.getName(), "Integers cannot be null or empty");
					}
					continue;
				}
				
				if(field.getType() == Date.class){
					if(null == field.get(obj) || (null != field.get(obj) && field.get(obj).toString().trim().length() == 0 ))
					{
						errorMap.put(field.getName(), "Null Dates Aren't Allowed");
					}
				}
				continue;
			}
		}
		return errorMap.size() == 0 ? new HashMap<String,String>(){{put("Hahaha","No Errors Folks!!!");}} : errorMap;
	}
}