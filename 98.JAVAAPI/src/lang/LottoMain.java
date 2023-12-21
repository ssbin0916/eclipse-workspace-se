package lang;

public class LottoMain {

	public static void main(String[] args) {
		System.out.println("--------------로또번호 6개 생성[중복번호 허용안됨]--------------");
		int[] lottonumber = { 0, 0, 0, 0, 0, 0 };
		/*
		 * 번호생성
		 *   - Quiz : 중복체크
		 */

		for (int i = 0; i < lottonumber.length; i++) {
			lottonumber[i] = (int) (Math.random() * 45) + 1;
			if (lottonumber[i] == lottonumber[i]) {
				int temp = lottonumber[i];
				temp -= temp;
				continue;
			}
		}
		/*
		 * 번호출력
		 */
		for (int no : lottonumber) {
			System.out.print(no + " ");
		}
	}
}
