
public class MemberFieldInitializationMain {

	public static void main(String[] args) {
		System.out.println("1-1. 인스턴스 멤버필드는 객체생성시 기본값으로 자동초기화");
		MemberFieldInitialization memberFieldInitialization1 = new MemberFieldInitialization();
		System.out.println(memberFieldInitialization1.member1);
		System.out.println(memberFieldInitialization1.member2);
		System.out.println(memberFieldInitialization1.member3);
		System.out.println(memberFieldInitialization1.member4);
		System.out.println(memberFieldInitialization1.member5);
		System.out.println(memberFieldInitialization1.member6);
		System.out.println("1-2. 인스턴스 멤버필드선언시 초기값으로 초기화할 수 있다.");
		System.out.println(memberFieldInitialization1.member11);
		System.out.println(memberFieldInitialization1.member22);
		System.out.println(memberFieldInitialization1.member33);
		System.out.println(memberFieldInitialization1.member44);
		System.out.println(memberFieldInitialization1.member55);
		System.out.println(memberFieldInitialization1.member66);
		System.out.println("1-3. 생성자 초기화");

		MemberFieldInitialization memberFieldInitialization2 = new MemberFieldInitialization(1, 0.3, '하', true, "문자1",
				null, 2, 0.8, '헤', false, "문자2", null);
	}

}
