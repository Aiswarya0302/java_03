package assingment03;

public class LocInsStatic {

	


	void local()
	
	{
		
	//Local Variable
	//String l;---> local variable must be initialized
	String l="Hello, im local variable";
	
	System.out.println("Local Variable:  "+l);
	}
	
	//Instance Variable
	float in;
	
	//Static Variable
	static long s=302596631479621552L;
	
	
	public static void main(String[] args) {
		
		//Accessing Local Variable
		LocInsStatic lsi=new LocInsStatic();
		
		lsi.local();
		
		//Accessing Instance Variable
		
		System.out.println("Instance Variable:  "+lsi.in);
		
		//Accessing Static Variable using classname.fieldname=value;
		
		System.out.println("Static  Variable:  "+s);
		
		LocInsStatic.s=865229974;
		
		

	}



	}


