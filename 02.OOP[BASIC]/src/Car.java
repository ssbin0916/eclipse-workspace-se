public class Car {

	/*	
	 * 
	 */
	String no; // 차량번호
	int inTime; // 입차시간
	int outTime; // 출차시간
	int fee; // 주차요금

	/*
	 * 멤버메쏘드[기능]
	 */
	/*
	 * 입차데이터(번호, 시간)대입
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

}
