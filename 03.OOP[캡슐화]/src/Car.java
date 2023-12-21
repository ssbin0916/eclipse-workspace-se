/**
 * 주차장에서 차객체를 생성할 클래스
 * 
 * @author KIM
 * @version 0.01
 */
public class Car {

	private String no; // 차량번호
	private int inTime; // 입차시간
	private int outTime; // 출차시간
	private int fee; // 주차요금

	/*
	 * 멤버메쏘드[기능]
	 */
	/*
	 * 입차데이터(번호, 시간)대입
	 */
	/**
	 * 입차시 데이터대입 메쏘드
	 * 
	 * @param no     차량번호
	 * @param inTime 입차시간
	 */
	public void setIpChaDate(String no, int inTime) {
		this.no = no;
		this.inTime = inTime;
		return;
	}

	/*
	 * 출차시간 멤버필드 outTime에 대입
	 */
	public void setOutTime(int outTime) {
		this.outTime = outTime;
	}

	/*
	 * 주차요금계산
	 */
	/**
	 * 주차요금계산
	 */
	public void calculateFee() {
		this.fee = (this.outTime - this.inTime) * 1000;
		return;
	}

	/*
	 * 차량정보헤더출력
	 */
	public void headerPrint() {
		System.out.printf("-----------------------------------------------------------------\n");
		System.out.printf("%s %s %s %s\n", "차량번호", "입차시간", "출차시간", "주차요금");
		System.out.printf("-----------------------------------------------------------------\n");
	}

	/*
	 * 차량정보출력
	 */
	public void print() {
		/*
		 * this
		 *   - self참조변수
		 *   - public void print()
		 *     메쏘드가 호출될 때 호출주체객채의 주소값을 가지는 변수
		 *   - this는 생략이 가능 
		 */

		System.out.printf("%7s %8d %8d    ￦%3d\n", this.no, this.inTime, this.outTime, this.fee);
		return;
	}

	public String getNo() {
		return no;
	}

	public void setNo(String no) {
		this.no = no;
	}

	public int getInTime() {
		return inTime;
	}

	public void setInTime(int inTime) {
		this.inTime = inTime;
	}

	/**
	 * 주차요금반환함수
	 * 
	 * @return 주차요금
	 */
	public int getFee() {
		return fee;
	}

	public void setFee(int fee) {
		this.fee = fee;
	}

	public int getOutTime() {
		return outTime;
	}

}
