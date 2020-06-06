package p2;
 
public final class B 
{ 

  public B() {
	  System.out.println("B Constructor");
  }
} 

class C{
	public C() {
//		super();
		System.out.println("C Constructor");
	}
}

class Tester{
	public static void main(String[] args) {
		C c=new C();
	}
}