
public class CarFactoryMain {

	public static void main(String[] args) {
		/*
		 * 자동차공장
		 */
		/*
		Engine gv80Engine = new Engine();
		gv80Engine.type = "A";
		gv80Engine.cc = 3000;
		
		Car gv80Car = new Car();
		gv80Car.no = 1234;
		gv80Car.model = "GV80";
		gv80Car.engine = gv80Engine;
		
		System.out.println(gv80Car.no + "\t" + gv80Car.model + "\t" + gv80Car.engine.type + "\t" + gv80Car.engine.cc);
		*/

		Engine x6Emgine = new Engine("A", 5000);

		Car car1 = new Car();
		car1.setNo(1234);
		car1.setModel("X6");
		car1.setEngine(x6Emgine);
		car1.print();

		System.out.println("---------차량엔진검사---------");

		Car gumsaCar = car1;

		Engine returnEngine = gumsaCar.getEngine();
		returnEngine.print();

		Car car2 = new Car(5678, "XC90", new Engine("S", 4900));
		car2.print();

		System.out.println("---------차량엔진검사---------");
		car2.getEngine().print();
	}
}
