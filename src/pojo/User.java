package pojo;

import java.util.Date;
import java.util.List;

public class User {
	
	public User(String firstName,String lastName,String birthPlace,
			List<String> hobbies, int age, Date birthDate){
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthPlace = birthPlace;
		this.hobbies = hobbies;
		this.age = age;
		this.birthDate = birthDate;
	}
	
	private String firstName;
	private String lastName;
	private String birthPlace;
	
	private List<String> hobbies;
	
	private int age;
	
	private Date birthDate;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getBirthPlace() {
		return birthPlace;
	}

	public void setBirthPlace(String birthPlace) {
		this.birthPlace = birthPlace;
	}

	public List<String> getHobbies() {
		return hobbies;
	}

	public void setHobbies(List<String> hobbies) {
		this.hobbies = hobbies;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
	
}