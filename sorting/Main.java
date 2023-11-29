package com.tech.sorting;

import java.util.Scanner;
import java.util.TreeSet;



	public class Main {
		
		public static void main(String[] args) {
			 TreeSet<Employe> t=null;
			Scanner sc=new Scanner(System.in);
			
			while(true)
			{
			System.out.println("Enter Your Choise");
			System.out.println("1.Id Sort \n2. Name Sort. \n3.Salary Sort.");
			int  x= sc.nextInt();
			
			switch(x)
			{
			case 1:
				t=new TreeSet<Employe>(new IdSort());
				
				break;
				  
				
			case 2: 
				t=new TreeSet<Employe>(new NameSort());
				
				break;
				
			case 3:
				t=new TreeSet<Employe>(new SalarySort());
				
				break;
				
				default:
			
				System.out.println();
			}
			
			
			Employe e1=new Employe();
			  e1.seteId(101);
			  e1.seteName("Ram");
			  e1.seteSalary(25000);
			
			  Employe e2=new Employe();
			  e2.seteId(102);
			  e2.seteName("Sachin");
			  e2.seteSalary(20000);
			
			  Employe e3=new Employe();
			  e3.seteId(103);
			  e3.seteName("Ritesh");
			  e3.seteSalary(30000);
		
		

		    
			  t.add(e1);
			  t.add(e2);
			  t.add(e3);
		
			  for(Employe    emp:t)
			  {
				  System.out.println(emp.geteId());
				  System.out.println(emp.geteName());
				  System.out.println(emp.geteSalary());
			      System.out.println("****************");
			  }
			}
		}
	}



