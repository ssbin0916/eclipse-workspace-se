package lang;

public class ObjectMain {

	public static void main(String[] args) {
		Object o1 = new Object();
		Object o2 = new Object();
		Object o3 = o1;
		System.out.println("--------------------toString----------------------");

		String str1 = o1.toString();
		System.out.println(str1);
		String str2 = o2.toString();
		System.out.println(str2);
		System.out.println("--------------------equals----------------------");

		if (o1.equals(o2)) {
			System.out.println("o1과 o2의 주소가 동일하다.[equals]");
		} else {
			System.out.println("o1과 o2의 주소가 동일하지 않다.[equals]");
		}
		if (o1.equals(o3)) {
			System.out.println("o1과 o3의 주소가 동일하다.[equals]");
		} else {
			System.out.println("o1과 o3의 주소가 동일하지 않다.[equals]");
		}

		if (o1 == o2) {
			System.out.println("o1과 o2의 주소가 동일하다.[==]");
		} else {
			System.out.println("o1과 o2의 주소가 동일하지 않다.[!=]");
		}
		if (o1 == o3) {
			System.out.println("o1과 o3의 주소가 동일하다.[==]");
		} else {
			System.out.println("o1과 o3의 주소가 동일하지 않다.[!=]");
		}

	}

}
