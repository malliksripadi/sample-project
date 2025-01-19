package sampleproject;

public class Addition {

	public static void main(String[] args) {
		Addition a = new Addition();
		a.subb();
        a.add(2,3);
        a.mult();
        a.div();
	
	
	
	


	}
	public static void add(int a, int b) {
		
	     double c=a+b;
	     
		
		
		System.out.println(a+"+" +b +"=" + c);
		
		
	}
	public static void subb() {
		int  a = 6;
		int  b = 9;
		int  c = a-b;
		System.out.println(a+ "-" +b + "=" +c);
	}
	public static void mult() {
		int a = 6;
		int b= 9;		
		int c =a*b;
		System.out.println(a+ "*" +b + "=" +c);
	}
	public static void div() {
		int a = 8;
				int b =2;
				double d = a/b;
				System.out.println (a+ "/" +b + "=" +d);
	}
				
		
	}
	

