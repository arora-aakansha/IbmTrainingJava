package com.ibm.stock;

public class AlfaBetaTest {
		public static void main(String[] args) {
			Alfa a=new Alfa();
			a.demo();
			//Beta bt = (Beta) a;  - error
			Beta b = new Beta();
			b.test();
			b.demo();
			Alfa ab = b; //upcasting
			ab.demo();
			//ab.test();  error parent class refrence can not access child class
			Beta ba = (Beta) ab; //Down casting explicit
			ba.demo();
			ba.test();
			
			
		}
}
