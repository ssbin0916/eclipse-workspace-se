class Parent {
	public void method1() {
		System.out.println("Parent.method1()");
	}

	public void method2() {
		System.out.println("Parent.method2()");
	}

	public void method3() {
		System.out.println("Parent.method3()");
	}

	public void method4() {
		System.out.println("Parent.method4()");
	}
}

class Child extends Parent {
	@Override
	public void method4() {
		System.out.println("Child.method4() --> Parent.method4()를 재정의[오버라이딩]");
	}

	public void method5() {
		System.out.println();
	}
}

public class ParentChildCastingMain {

	public static void main(String[] args) {
		System.out.println("------------(( Child --> Parent ))-----------");
		Child c1 = new Child();
		c1.method1();
		c1.method2();
		c1.method3();
		c1.method4(); // 재정의된 메쏘드
		c1.method5();
		Parent p1 = c1;
		if (p1 == c1) {
			System.out.println(p1 + " == " + c1 + " [p1과 c1의 주소가 동일하다.] ");
		}
		p1.method1();
		p1.method2();
		p1.method3();
		p1.method4();
		/*
		p1.method5();
		*/
		System.out.println("------------(( Parent --> Child ))-----------");

		Parent p2 = new Parent();
		// Child c2 = p2;
		Parent p3 = new Child();
		p3.method1();
		p3.method2();
		p3.method3();
		p3.method4();
		// p3.method5();

		Child c3 = (Child) p3;
		c3.method1();
		c3.method2();
		c3.method3();
		c3.method4();
		c3.method5();
	}

}
