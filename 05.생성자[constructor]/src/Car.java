
public class Car {
	/*
	 * 1.멤버필드
	 */
	private String no; // 차량번호
	private int inTime; // 입차시간
	private int outTime;// 출차시간
	private int fee; // 주차요금
	/*
	 * 2.생성자메쏘드
	 */

	public Car() {
	}

	public Car(String no, int inTime) {

		this.no = no;
		this.inTime = inTime;
	}

	public Car(String no, int inTime, int outTime, int fee) {
		this.no = no;
		this.inTime = inTime;
		this.outTime = outTime;
		this.fee = fee;
	}
	/*
	 * 3.멤버메쏘드
	 */

	/*
	 * 입차데이타(번호,시간)대입
	 */
	public void setIpChaData(String no, int inTime) {
		this.no = no;
		this.inTime = inTime;
		return;
	}

	/*
	 * 출차시간 멤버필드outTime에 대입
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
		System.out.printf("---------------------------------------\n");
		System.out.printf("%s %s %s %s\n", "차량번호", "입차시간", "출차시간", "주차요금");
		System.out.printf("---------------------------------------\n");
	}

	/*
	 * 차량정보출력
	 */
	public void print() {
		/*
		 * this
		 *   - self참조변수
		 *   - public void print() 
		 *     메쏘드가 호출될때 호출주체객체의 주소값을 가지는 변수
		 *   - this는 생략이가능  
		 */

		System.out.printf("%7s %8d %8d   ￦%4d\n", this.no, this.inTime, this.outTime, this.fee);
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

	public int getFee() {
		return fee;
	}

	public void setFee(int fee) {
		this.fee = fee;
	}

	public int getOutTime() {
		return outTime;
	}

	/*
	 * alt+shift+s --> r
	 */

}
