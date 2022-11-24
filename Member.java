package com.Test3;

public class Member {
String name;
int age;
String number;
String address;
int salary;

public void printSalary() {
	System.out.println(salary);
}

}
class Employee extends Member{
	String specialization;
}
class Manager extends Member{
	String department;
}
class ans{
	public static void main(String[]args) {
		Employee e=new Employee();
		e.name="Saina";
		e.age="23";
		e.number="1234567898";
		e.address="xyz";
		e.salary="2345";
				e.specialization="ern";
				Manager m= new Manager();
	}
}
