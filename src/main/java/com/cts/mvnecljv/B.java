package com.cts.mvnecljv;

public class B {
A a;

B(A a){
	 this.a =a;
}

/*
 * public A getA() { return a; }
 * 
 * 
 * public void setA(A a) { this.a = a; }
 */


	public String useMessage(String inputMessage) {
		//A a= new A();
		return a.sendMessage(inputMessage);
	}
}
