public class Tester1 {
	static {
		System.out.println("I am Sattsic block");
	}
	
	{
		System.out.println("I am Init");
	}
	
             public static void main(String[] args) {
            	 Tester1 t=new Tester1();
            			 
                      System.out.println("Iam main");
             }
    
            public void display(int b, String... strings) {
                       System.out.print(strings[strings.length-1]+" ");
       }
}