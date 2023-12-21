
public class EncapsulationMain {

	public static void main(String[] args) {
		Encapsulation encapsulation = new Encapsulation();

		/*
		 * encapsulation객체멤버필드에 데이터대입
		 <<The field Encapsulation.memberField1 is not visible>>
		 */
		/*
		encapsulation.memberField1 = 123;
		encapsulation.memberField2 = true;
		encapsulation.memberField3 = '김';
		encapsulation.memberField4 = 1.3142;
		*/
		encapsulation.setMemberField1(123);
		encapsulation.setMemberField2(true);
		encapsulation.setMemberField3('김');
		encapsulation.setMemberField4(1.3142);

		/*
		 * encapsulation 객체멤버필드내용 출력
		 */
		System.out.println(encapsulation.getMemberField1());
		System.out.println(encapsulation.getMemberField2());
		System.out.println(encapsulation.getMemberField3());
		System.out.println(encapsulation.getMemberField4());
	}

}
