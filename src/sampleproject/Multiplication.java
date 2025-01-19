package sampleproject;

public class Multiplication {
public static void main (String[]args) {
	Multiplication a = new Multiplication ();
a.mult();
a.add();
}

public static void mult () {
	int a = 456;
			int b = 789;
			int c = a*b;
			System.out.println(a+ "*"+b + "="+c);
			
}
public static void add() {
	int a = 23;
	int b = 43;
	 int c = a +b;
	 System.out.println(a+ "+"+b + "="+c);
	
	 
}
}

