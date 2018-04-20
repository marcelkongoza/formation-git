package com.livrable.ui;

import com.livrable.impl.MyClasse;
import com.livrable.impl.MySecondClass;

public class Lanceur {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyClasse myClass = new MyClasse();
		myClass.autrMethode();
		int reslut1 = myClass.laSomme(55, 78);
		System.out.println(reslut1);
		System.out.println(myClass.presentation());
		
		
		MySecondClass mySecondClass = new MySecondClass();
		mySecondClass.autrMethode();
		int result2 = mySecondClass.laSomme(89, 87);
		System.out.println(result2);
		System.out.println(mySecondClass.presentation());
		
	}

}

