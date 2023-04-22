package basicsJava;

public class Static_Method

	{ void main(String[] args) 
	           {            // main method body                                                             
		
		                   //Static Regular Method Calling From Same Class
		
		                      System.out.println("main method started");
		                   //static method calling from different class
		                      
		        
	         
	                          //Direct Calling
		                      // Syntax : method name();
		                      
		                      Demo1(); 
		                      Demo2();
		                                                                                   
		                      //Calling By Class Name
		                      //Syntax: Class name.Method name();
		                     
		                      Static_Method.Demo1();
		                      Static_Method.Demo2();
		                      
		
		
		
		
		
		                      System.out.println("main method ended");
	          }                                                                
	               public static void Demo1()
	               {
		                      System.out.println("Static regular method calling from same class Demo1");
		  	       }
	               public static void Demo2() 
	               {
		                      System.out.println("Static Regular Method Calling From Same Class Demo2");
	               }
	
	}
	 
                        //Class Body

