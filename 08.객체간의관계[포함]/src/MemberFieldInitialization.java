
public class MemberFieldInitialization {
	/*
	 * 1-1. 인스턴스 멤버필드는 객체생성시 기본값으로 자동초기화
	 */
	public int member1; // 0
	public double member2; // 0.0
	public char member3; // 0
	public boolean member4; // false
	public String member5; // null
	public Order member6; // null
	/*
	 * 1-2. 인스턴스 멤버필드선언시 초기값으로 초기화할 수 있다.
	 */
	public int member11 = 999; // 0
	public double member22 = 3.1; // 0.0
	public char member33 = '힣'; // 0
	public boolean member44 = true; // false
	public String member55 = "화요일"; // null
	public Order member66 = new Order(1111, "자바잘하는법", "2023-12-10", 20000); // null
	/*
	 * 1-3. 생성자 초기화
	 */

	public MemberFieldInitialization() {

	}

	public MemberFieldInitialization(int member1, double member2, char member3, boolean member4, String member5,
			Order member6, int member11, double member22, char member33, boolean member44, String member55,
			Order member66) {
		this.member1 = member1;
		this.member2 = member2;
		this.member3 = member3;
		this.member4 = member4;
		this.member5 = member5;
		this.member6 = member6;
		this.member11 = member11;
		this.member22 = member22;
		this.member33 = member33;
		this.member44 = member44;
		this.member55 = member55;
		this.member66 = member66;
	}

}
