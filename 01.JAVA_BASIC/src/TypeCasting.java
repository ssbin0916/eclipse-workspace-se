
public class TypeCasting {

	public static void main(String[] args) {
		/*
		 * 자동형변환: promotion
		 */
		int i1 = 56;
		long l1 = i1;
		double d1 = i1;
		System.out.println(l1);
		System.out.println(d1);
		/*
		 * 자동형변환안됨
		 *   - 큰데이터 --> 작은데이터타입 변수
		 *   - casting
		 */
		double avgd = 85.23;
		int avgi = (int) avgd;
		System.out.println(avgd);
		System.out.println(avgi);
		/*
		 * 자동형변환안됨
		 *   - 큰데이터 --> 작은데이터타입 변수 (컴파일 에러)
		 *   - 강제 type casting
		 */

		/*
		 * 정수형 리터럴(10, 34, 999)이 대입되는 변수범위 안에 포함될 경우에는 자동형변환해줌(짤림)
		 * 정수형 변수의 값이           대입되는 변수범위 안에 포함될 경우에도 형변환 안해줌(컴파일에러)
		 */
		char c1 = 'A';
		char c2 = 65;
		int i2 = 65;
		// char c3 = i2;
		System.out.println(c1);
		System.out.println(c2);

		/*
		 * 연산시의 자동형변환
		 *   - 연산항들중에 가장 큰 타입으로 모든항이 자동형변환된다.(promotion) 
		 */

		int ii = 100;
		char cc = 'A';
		long ll = 45;
		double dd = 0.1;

		double dr = ii + cc + ll + dd;
		System.out.println(dr);
		dr = 34 + 9.3 + 'S' + 56L;
		System.out.println(dr);

	}

}
