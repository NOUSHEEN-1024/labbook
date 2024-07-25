package labbookjava;

import java.util.*;
 
public class J3_1 {

		private String firstname;

		private String lastname;

		private char gender;

		public J3_1() {

		}

		public J3_1(String firstname,String lastname,char gender) { //constructor

		this.firstname=firstname;

        this.lastname=lastname;

        this.gender=gender;

		}

		public void setFirstName(String firstname) {

			this.firstname=firstname;

		}

		public String getFirstName() {

			return firstname;

		}

		public void setLasttName(String lastname) {

			this.lastname=lastname;

		}

		public String getLastName() {

			return lastname;

		}

		public void setGender(char gender) {

			this.gender=gender;

		}

		public char getGender() {

			return gender;

		}

		public void display() {

			  System.out.println( "First name:"+getFirstName()+ "   "+ "\nLast name:"+getLastName()+"  "+ "\nGender: "+getGender());
 
		}


	public static void main(String[] args) {

		J3_1 ob=new J3_1("Nousheen","Abdul",'F');

			ob.display();	
			
			System.out.println("Checking in Git");
			
			System.out.println("Adding one more line");

 
		

	}

}
 



