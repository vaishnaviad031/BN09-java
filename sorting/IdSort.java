package com.tech.sorting;

import java.util.Comparator;

public class IdSort implements Comparator{

	@Override
	public int compare(Object obj1, Object obj2) {
		      Employe e1=(Employe)obj1;
		      Employe e2=(Employe)obj2;
		      
		      
			
		
		return e1.geteId()-e2.geteId();
	}

}



