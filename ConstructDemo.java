package Session3.Assignment2;
//To demonstrate the chain of constructor within the same class
public class ConstructDemo {
	
		String name;
		int empid;
		static String company="XYZ";//Class variable
        //default constructor is called.
		
		public ConstructDemo(){
			System.out.println("Calling default constructor");
				
		}
		//Constructor with single parameter
        public ConstructDemo(String empname){
        	this();
        	System.out.println("Calling single parameter constructor");
	          name = empname;
			
		}
		//constructor with two parameters is called
		public ConstructDemo(String empname,int empnum){
			this(empname);
			System.out.println("Calling two parameter constructor");
			empid = empnum;
			
		}
		
		
		public void display()
		{
			System.out.println("Empname : " +name);
			System.out.println("Companyname: " +company);
			System.out.println("Empid :" +empid);
		}

		
		public static void main(String[] args) {
			
			System.out.println("Calling chain of constructor");
			     
			ConstructDemo c2 = new ConstructDemo("Kamath",1233);
			      c2.display();
			ConstructDemo c3 = new ConstructDemo("Prabhav",1234);
			      c3.display();
			
			
		}
}
