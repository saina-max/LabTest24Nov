package com.Test1;
//print student details in java
	import java.util.Scanner;

public class StudentInfo {
	
	
	    void getDetails(){
	        Scanner sc = new Scanner(System.in);
	        System.out.println("***Input the asked details***");
	        
	        
	        System.out.println("Enter Student ID:");
	        int studentid = sc.nextInt(); 
	        
	        System.out.println("Enter Name:");
	        String name = sc.next();
	        
	        System.out.println("Enter Age:");
	        int age = sc.nextInt();
	        
	        System.out.println("Enter City:");
	        String city = sc.next();
	        
	        System.out.println("Enter Course:");
	        String course = sc.next();
	        
	        System.out.println("***Inputed Student Details***");
	        System.out.println("Roll Number:"+studentid);
	        System.out.println("Name:"+name);
	        System.out.println("Age:"+age);
	        System.out.println("City:"+city);
	        System.out.println("Course:"+course);
	    }
	}

	
void getinfo(){
	        Scanner sc = new Scanner(System.in);	
  System.out.println("----------------------------");
  System.out.println("-----------Employee Details-----------------");
  System.out.println("Enter Employee ID:");
  int employeeid = sc.nextInt(); 
  
  System.out.println("Enter Name:");
  String name = sc.next();
  
  System.out.println("Enter Age:");
  int age = sc.nextInt();
  
  System.out.println("Enter department:");
  String department = sc.next();
  
  System.out.println("Enter salary:");
  int salary = sc.nextInt();
  
  System.out.println("Enter designation:");
  String designaion = sc.next();
  
  System.out.println("***Inputed Student Details***");
  System.out.println("Roll Number:"+employeeid);
  System.out.println("Name:"+name);
  System.out.println("Age:"+age);
  System.out.println("department:"+department);
  System.out.println("salary:"+salary);
  String designation = null;
System.out.println("designation:"+designation);
class Main{
    public static void main(String[] args) {
        StudentInfo st = new StudentInfo();
        st.getDetails();
        StudentInfo em=new StudentInfo();
        em.getinfo();
      
  
	    }
	}
