package p1;

public class A {
	
	final void isplay() {
		System.out.println("in A");
	}

}

class B extends A{

	
	final void isplay() {
		// TODO Auto-generated method stub
		System.out.println("in B");
	}
	
}

class Test{
	public static void main(String[] args) {
		A a= new A();
		A b= new B();
		a.isplay();
		b.isplay();
	}
}