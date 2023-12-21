package lang;

public class MathMain {

	public static void main(String[] args) {
		/*
		 * Math 클래스
		 *   - 
		 */
		// Math math = new Math();
		double r = Math.abs(-127.90);
		System.out.println(r);
		System.out.println(Math.max(999, 888));
		System.out.println(Math.min(999, 888));
		System.out.println(Math.round(33.55555 * 100) / 100.0);
		System.out.println(Math.sqrt(2));
		System.out.println(Math.sqrt(3));
		System.out.println(Math.sqrt(4));
		System.out.println(Math.pow(2, 12));
		System.out.println("-------------------Math.random()----------------");

		System.out.println(Math.random());
		System.out.println(Math.random());
		System.out.println(Math.random());
		System.out.println("1~10사이의 정수 5개 랜덤 생성");
		System.out.println((int) (Math.random() * 10) + 1);
		System.out.println((int) (Math.random() * 10) + 1);
		System.out.println((int) (Math.random() * 10) + 1);
		System.out.println((int) (Math.random() * 10) + 1);
		System.out.println((int) (Math.random() * 10) + 1);
		System.out.println("1~45사이의 정수 6개 랜덤 생성");
		System.out.println((int) (Math.random() * 45) + 1);
		System.out.println((int) (Math.random() * 45) + 1);
		System.out.println((int) (Math.random() * 45) + 1);
		System.out.println((int) (Math.random() * 45) + 1);
		System.out.println((int) (Math.random() * 45) + 1);
		System.out.println((int) (Math.random() * 45) + 1);

	}

}
