
public class MemberMethod {
	public int member1;

	public void method1() {
		System.out.println("\t----void method1()실행시작");
		System.out.println("\t method1 stmt1");
		System.out.println("\t method1 stmt2");
		System.out.println("\t----void method1()실행 끝");

		return;
	}

	/*** 매개변수(parameter)가 있는 메쏘드 정의 ***/
	public void method2(int count) {
		System.out.println("\t----void method2(int count)----실행");
		int localVar = 111;
		System.out.println("\t method2 메쏘드 블록안에서 선언된 로컬변수 : " + localVar);
		for (int i = 0; i < count; i++) {
			System.out.println("\t method2(int count) 실행 : 파라메타(매개변수) count의 값 -> " + count);
		}
		System.out.println("\t----void method(int count)----실행종료후 반환");
		return;
	}

	public void method3(String msg, int count) {
		System.out.println("\t----void method3(int count)----실행");
		for (int i = 0; i < count; i++) {
			System.out.println("\t\t" + msg);
		}
		System.out.println("\t----void method3(int count)----종료후 실행흐름 반환");
		return;
	}

	public void method4(String name, String msg, int count) {
		System.out.println("\t----void method4(int count)----실행");
		for (int i = 0; i < count; i++) {
			System.out.printf("\t\t%s님 %s\n", name, msg);
		}
		System.out.println("\t----void method4(int count)----종료후 실행흐름 반환");
		return;
	}
}
