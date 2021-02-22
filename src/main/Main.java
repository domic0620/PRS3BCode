package main;

import app.Application;
import comm.EjemploSingleton;

public class Main {

	public static void main(String[] args) {
		Application app = new Application();
		app.init();
		
		
		
		
		EjemploSingleton ob1 = EjemploSingleton.getInstance();
		EjemploSingleton ob2 = EjemploSingleton.getInstance();
		
		System.out.println(ob1 == ob2);
		
		
		while(true){}

	}

}
