
public class MemberMethodReturn {
	/*
	 * 멤버필드
	 *   -멤버필드 선언시 값을 대입할수있다.
	 */
	int memberField1 = 10;
	int memberField2 = 20;
	int memberField3 = 30;

	/***** setter method *****/
	/*
	 * 멤버필드에 데이터를 대입(set)하는 메쏘드
	 */
	public void setMemberField1(int memberField1) {
		this.memberField1 = memberField1;
	}

	public void setMemberField2(int memberField2) {
		this.memberField2 = memberField2;
	}

	public void setMemberField3(int memberField3) {
		this.memberField3 = memberField3;
	}

	/***** getter method *****/
	/*
	 * 멤버필드의 데이터를 반환(get)하는 메쏘드
	 */
	public int getMemberField1() {
		return this.memberField1;
	}

	public int getMemberField2() {
		return this.memberField2;
	}

	public int getMemberField3() {
		return this.memberField3;
	}

	public int method1() {
		System.out.println("\t---int method1()실행");
		int result = 234 + 324234;
		System.out.println("\t---int method1()실행종료후 int데이터 반환");
		/*
		 return <<호출한 클래스(객체)에게 반환할값(변수,리터럴,연산의결과)>>;
		    - 호출한곳으로 실행흐름반환
		    - 호출한곳으로 데이타반환
		    - 반환할 데이타가 없는경우에는(void)    return문생략이 가능하다.
		    - 반환할 데이타가 있는경우에는(int,...) return문 반드시 기술하여야한다.
		 	 */
		return result;
	}

	public boolean method2() {
		System.out.println("\t---boolean method2()실행");
		boolean isMarried = false;
		System.out.println("\t---boolean method2()실행종료후 boolean데이터 반환");
		return isMarried;
	}

	public int add(int a, int b) {
		System.out.println("\t---int add(int a, int b)실행");
		System.out.println("\t---int add(int a, int b)실행종료후 int데이터 반환");
		return a + b;
	}

	public String hello(String name) {
		String msg = name + " 님 안녕하세요!";
		return msg;
	}

}