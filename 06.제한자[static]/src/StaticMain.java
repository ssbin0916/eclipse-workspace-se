class Static {
	/*
	 * 인스턴스     멤버필드(멤버변수)
	 */
	public int instance_field;
	/*
	 * 정적(static) 멤버필드(멤버변수)
	 */
	public static int static_field;

	public void instance_method() {
		System.out.println("인스턴스(객체) 메쏘드");
	}
	/*
	 * 인스턴스      멤버메쏘드
	 */

	public static void static_method() {
		System.out.println("정적(static) 메쏘드(this를 사용할 수 없다):this(X)");
	}
	/*
	 * 정적(static)  멤버메쏘드
	 */

}

public class StaticMain {

	public static void main(String[] args) {
		System.out.println("----------static member access----------");
		/*
		 * 정적멤버 접근 - 클래스이름, 정적멤버이름
		 */
		System.out.println(Static.static_field);
		Static.static_field = 8888;
		System.out.println(Static.static_field);
		Static.static_field = 9999;
		System.out.println(Static.static_field);
		Static.static_method();

		System.out.println("----------instance member access----------");
		Static static1 = new Static();
		System.out.println(">> static1 객체주소" + static1);
		static1.instance_field = 1111;
		static1.instance_method();
		Static static2 = new Static();
		System.out.println(">> static1 객체주소" + static2);
		static2.instance_field = 1111;
		static2.instance_method();

	}

}
