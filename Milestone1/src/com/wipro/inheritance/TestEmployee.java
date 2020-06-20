package com.wipro.inheritance;

class Person{
	private String name;
	public Person(String s) {
		name=s;
	}
	public void setName(String s) {
		name=s;
	}
	public String getName() {
		return name;
	}
	public String toString() {
		return name;
	}
}
class Employee extends Person{
	private double ansalary;
	private int empyr;
	private String ins_no;
	public Employee(String s,double a,int y,String ins) {
		super(s);
		ansalary=a;
		empyr=y;
		ins_no=ins;
	}
	public void setSalary(double a)
	{
		ansalary=a;
	}
	public void setYear(int y) {
		empyr=y;
	}
	public void setIns_no(String i) {
		ins_no=i;
	}
	public int getyr()
	{
		return empyr;
	}
	public double getSalary() {
		return ansalary;
	}
	public String getInsno() {
		return ins_no;
	}
	public String toString() {
		return super.toString()+" "+ansalary+" "+empyr+" "+ins_no;
	}
}
public class TestEmployee
{
	public static void main(String args[]){
		Person p=new Person("Koushik");
		Employee e=new Employee("Amar",15000,2017,"aabb");
		System.out.println(p);
		System.out.println(e);
	}
}



