package tr.tutorial.JSF_Tutorial;

import javax.faces.model.ArrayDataModel;
import javax.faces.model.DataModel;

public class PersonBean {
	private static final Person[] personList = new Person[]{
		 
		new Person("Person", "A", 10),
		new Person("Person", "B", 20),
		new Person("Person", "C", 30),
		new Person("Person", "D", 40),
		new Person("Person", "E", 50)
 
	};
 
	/* To get the row numbers, use dataModel instead
	public Person[] getPersonList() {
 
		return personList;
 
	}
	*/
 
	private DataModel<Person> person = new ArrayDataModel<Person>(personList);
 
	public DataModel<Person> getPersonList() {
 
		return person;
 
	}
 
	public static class Person{
 
		String firstName;
		String lastName;
		int age;
 
		public Person(String firstName, String lastName, int age) {
			super();
			this.firstName = firstName;
			this.lastName = lastName;
			this.age = age;
		}

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

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}
 
		//getter and setter methods 
	}
}
