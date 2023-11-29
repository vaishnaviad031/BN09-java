package com.tech.sorting;
import java.util.Comparator;
public class SalarySort implements Comparator
{
	@Override
	public int compare(Object obj1, Object obj2) 
	{
		Employe e1=(Employe)obj1;
		Employe e2=(Employe)obj2;
		
		
      return  (int) (e1.geteSalary()-e2.geteSalary());
	}
}