
public class MemberFieldMain {

	public static void main(String[] args) {

		MemberField mf1;
		/*
		 MemberField 사용자정의 타입 객체의 주소값을 저장할 참조변수 선언
		 */

		mf1 = new MemberField();
		/*
		 * MemberField클래스(틀) 로 객체를 생성한 후에 객체의 주소값이 대입
		 * mf1참조변수에 대입(#100)
		 */

		
		mf1.memberField1 = 1234;
		mf1.memberField2 = 3.2;
		mf1.memberField3 = true;
		mf1.memberField4 = 'A';
		mf1.memberField5 = "문자열";
		/*
		 - 객체의 참조(주소)변수가 가지고 있는 객체의 주소값 #100를 사용해서 멤버필드에 데이터를 대입
		 - 객체의 멤버필드 접근방법
		    - 참조변수.멤버필드이름 = 값;
		    - mf1.memberField1 = 9090;
		 */
		/* 
		 * mf1(#100)주소에 있는 객체의 int     타입의 멤버필드 memberField1에 1234     값을 대입
		 * mf1(#100)주소에 있는 객체의 double  타입의 멤버필드 memberField1에 3.2      값을 대입
		 * mf1(#100)주소에 있는 객체의 boolean 타입의 멤버필드 memberField1에 true     값을 대입
		 * mf1(#100)주소에 있는 객체의 char    타입의 멤버필드 memberField1에 'A'      값을 대입
		 * mf1(#100)주소에 있는 객체의 String  타입의 멤버필드 memberField1에 "문자열" 값을 대입
		 */

		MemberField mf2 = new MemberField();

		mf2.memberField1 = 5678;
		mf2.memberField2 = 9.8;
		mf2.memberField3 = false;
		mf2.memberField4 = '가';
		mf2.memberField5 = "제임스딘";
		
	

		System.out.println("mf1의 주소값 : " + mf1);
		System.out.println(mf1.memberField1 + " " + 
		mf1.memberField2 + " " + 
		mf1.memberField3 + " " + 
		mf1.memberField4 + " " + 
		mf1.memberField5 + " ");
		
		/*
		 - 객체참조(주소)변수가 가지고 있는 주소값 #100를 사용해서 멤버필드값을 출력
		 - 객체의 멤버필드 접근방법
		    1. System.out.println(mf1.memberField1);
		    2. int tempMember1 = mf1.memberField1;
		       System.out.println(tempMember1);
		       
		    mf1객체의 int     타입 memberField1의 값을 출력
		    mf1객체의 double  타입 memberField2의 값을 출력
		    mf1객체의 boolean 타입 memberField3의 값을 출력
		    mf1객체의 char    타입 memberField4의 값을 출력
		    mf1객체의 String  타입 memberField5의 값을 출력
		 */

		System.out.println("m21의 주소값 : " + mf2);
		System.out.println(mf2.memberField1 + " " + 
		mf2.memberField2 + " " + 
	    mf2.memberField3 + " " + 
		mf2.memberField4 + " " + 
		mf2.memberField5 + " ");

	}

}
