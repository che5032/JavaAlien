package com.alien;
import java.awt.List;
import java.util.ArrayList;
import java.util.Iterator;

class Student{
	void print() {
		System.out.println("Student");
	}
}

class EnggStudent extends Student{
	void print() {
		System.out.println("Engg Student");
	}
}

class ManageStudent extends Student{
	void print() {
		System.out.println("Management student");
	}
}

public class Demo {

	static void printStudents(ArrayList<? extends Student> al) {
		for (Student student : al) {
			student.print();
		}
	}
	
	public static void main(String[] args) {
	
		ArrayList<EnggStudent> list1=new ArrayList<>();
		list1.add(new EnggStudent());
		list1.add(new EnggStudent());
		
		ArrayList<ManageStudent> list2=new ArrayList<>();
		list2.add(new ManageStudent());
		
		printStudents(list1);
		printStudents(list2);
		
	}
}







