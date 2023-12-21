
public class CarConstructorMain {

	public static void main(String[] args) {
		System.out.println("-------------------car1------------------");
		Car car1 = new Car();
		car1.setIpChaData("1234", 12);
		car1.setOutTime(14);
		car1.calculateFee();
		car1.print();
		System.out.println("-------------------car2------------------");
		Car car2 = new Car("4567", 13);
		car2.setOutTime(15);
		car2.calculateFee();
		car2.print();

		System.out.println("*************오늘주차장이용차량출력*****************");
		Car cara = new Car("1234", 1, 2, 1000);
		Car carb = new Car("8976", 12, 17, 5000);
		Car carc = new Car("3478", 6, 9, 3000);
		Car card = new Car("2398", 3, 7, 4000);
		cara.headerPrint();
		cara.print();
		carb.print();
		carc.print();
		card.print();

	}

}