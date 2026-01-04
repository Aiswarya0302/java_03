package assingment03;

public class Static_intance {

	


	static int a=10;
	static final int b=20;
	
		String x="Object Oriented Programming Structure";
		
	
	

	public static void main(String[] args) 
	{
		Static_intance.a=30;
		System.out.println("Using Static Variable:  "+Static_intance.b);
		Static_intance si=new Static_intance();
		System.out.println("Using Instance Variable:  "+si.x);
		
		
		

	}




	}


