
public class IfUse {

	public static void main(String[] args) {

		/*
		 * 짝수, 홀수 판별
		 */
		int no1 = 34;
		if (no1 % 2 == 0) {
			System.out.printf("%d 은 짝수입니다.\n", no1);
		} else {
			System.out.printf("%d 은 홀수입니다.\n", no1);
		}

		/*
		 * 4의 배수 판별
		 */
		int no2 = 4000;
		if (no2 % 4 == 0) {
			System.out.printf("%d 는 4의 배수\n", no2);
		} else {
			System.out.printf("%d 는 4의 배수아님\n", no2);
		}

		/*
		 * 점수의 유효성 체크
		 */
		int kor = 90;

		if (kor >= 0 && kor <= 100) {
			System.out.printf("%d 는 유효한 점수\n", kor);
		} else {
			System.out.printf("%d 는 유효하지 않은 점수\n", kor);
		}

		/*
		 * 윤년 여부 출력
		 */
		int year = 2000;
		String msg = "";
		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
			msg = "윤년";
		} else {
			msg = "평년";
		}
		System.out.printf("%d 년은 %s 입니다.\n", year, msg);

		/*
		 * 문자 판별
		 */
		char c = '9';

		if (c >= 'A' && c <= 'Z') {
			System.out.printf("%c 는 알파뱃 대문자입니다.\n", c);
		}
		if (c >= 'a' && c <= 'z') {
			System.out.printf("%c 는 알파뱃 소문자입니다.\n", c);
		}
		if (c >= '0' && c <= '9') {
			System.out.printf("%c 는 숫자문자입니다.\n", c);
		}

		char idFirstLetter = '&';

		if ((idFirstLetter >= 'A' && idFirstLetter <= 'Z') || (idFirstLetter >= 'a' && idFirstLetter <= 'z')) {
			System.out.printf("%c 유효한 아이디 첫문자입니다.\n", idFirstLetter);
		} else {
			System.out.printf("%c 유효하지 않은 아이디 첫문자입니다.\n", idFirstLetter);
		}

	}

}
