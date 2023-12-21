
public class ConstructorMain {

	public static void main(String[] args) {
		System.out.println("------------c1-----------");
		/*
		<< new Constructor(); >>
		   1. Constructor클래스로 객체생성
		   2. 생성자메쏘드(블록)호출
		   3. 생성된객체의 주소값반환
		 */

		Constructor c1 = new Constructor();
		System.out.println("c1:" + c1);
		c1.print();
		System.out.println("------------c2-----------");
		Constructor c2 = new Constructor(100);
		c2.print();
		System.out.println("------------c3-----------");
		Constructor c3 = new Constructor(100, 200, "KIM");
		c3.print();

	}

}