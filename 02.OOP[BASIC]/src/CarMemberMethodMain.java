 
public class CarMemberMethodMain {

	public static void main(String[] args) {
		/*
		 *  1. 차량번호 1234번 차량 12시 입차
		 */
		Car car1 = new Car();
		Car car2 = new Car();
		/*
		 * 입차시 데이터(번호, 입차시간)대입 메쏘드 호출
		 */
		car1.setIpChaDate("1234", 12);
		car2.setIpChaDate("5678", 12);
		
		/*
		 *  2. car1 차량 16시 출차
		 */
		/*
		 *  2-1. 출차시간 대입
		 */
		
		car1.setOutTime(16);
		car2.setOutTime(16);

		/*
		 *  2-2. 주차요금계산 메쏘드 호출
		 */
		car1.calculateFee();
		car2.calculateFee();
		/*
		 *  2-3. 주차요금영수증 출력메쏘드 호출
		 */

		car1.headerPrint();
		car1.print();
		car2.print();

	}

}
