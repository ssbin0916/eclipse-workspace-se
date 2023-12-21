
public class IfScorePrint {

	public static void main(String[] args) {

		int kor = -90;

		/*
		 * 1. 입력되는 점수의 유효성 체크
		 */
		if (kor >= 0 && kor <= 100) {

			/*
			 * 2-1. 유효한 점수를 대상으로 학점계산
			 */

			char hakjum = 'F';
			if (kor >= 90) {
				hakjum = 'A';
			} else if (kor >= 80) {
				hakjum = 'B';
			} else if (kor >= 70) {
				hakjum = 'C';
			} else if (kor >= 60) {
				hakjum = 'D';
			} else {
				hakjum = 'F';
			}
			System.out.println("학점은 " + hakjum + " 입니다.");
		
		} else {
			/*
			 * 2-2. 유효하지 않은 점수에 대한 메세지 출력
			 */
			System.out.println(kor + " 은 유효한 점수가 아닙니다.");
		}

	}

}
