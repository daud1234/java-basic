package basics;

class ABC {
	public void myMethod() {
		int a=10;
		System.out.println("Overridden Method: "+a);
	}
}

public class v_polymorphism_dynamic extends ABC {

	public void myMethod() {
		int b=20;
		System.out.println("Overriding Method: "+b);
	}

	public static void main(String args[]) {
		ABC obj = new v_polymorphism_dynamic();
		obj.myMethod();
		//ABC.myMethod()
		//System.out.println(ABC.myMethod());

	}
}

