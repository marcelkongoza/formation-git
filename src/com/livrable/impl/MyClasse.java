package com.livrable.impl;

import com.livrable.inter.AutreInterface;
import com.livrable.inter.MyInterface;

public class MyClasse implements MyInterface, AutreInterface {

	@Override
	public int laSomme(int val1, int val2) {
		// TODO Auto-generated method stub
		return val1+val2;
	}
	@Override
	public String presentation() {
		// TODO Auto-generated method stub
		return "JE VIENS DE LA CLASSE : MyClass";
	}
	

}
