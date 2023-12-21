
public class MemberMethodMain {

	public static void main(String[] args) {
		System.out.println("main stmt1");
		MemberMethod mm1 = new MemberMethod();
		mm1.member1 = 213212;
		mm1.method1();
		System.out.println("main stmt2");
		mm1.method2(2);
		System.out.println("main stmt3");
		mm1.method2(5);
		System.out.println("main stmt4");
		mm1.method3("안녕하세요!", 3);
		System.out.println("main stmt5");
		mm1.method3("어서오세요!", 3);
		System.out.println("main stmt6");
		/*
		 * 김경호 님 어서오세요
		 * 김경호 님 어서오세요
		 */
		String name = "김경호";
		String msg = "어서오세요!";
		int count = 2;
		mm1.method4(name, msg, count);
		System.out.println("main stmt7");
		mm1.method4("이효리", "광고받아요!!", 3);
		System.out.println("main bloc end jvm return");
		return;
	}

}
