
public class ReferenceTypeArrayAccountMain {

	public static void main(String[] args) {
		System.out.println("---------{}를 이용한배열객체생성과초기화-----");
		Account acc1 = new Account(1111, "LEE", 56000, 2.8);

		Account[] accounts = { acc1, new Account(2222, "KIM", 99000, 3.5), new Account(3333, "PARK", 96500, 6.9),
				new Account(4444, "LEE", 34200, 2.9), new Account(5555, "CHOI", 78300, 4.8),
				new Account(6666, "SIM", 61200, 9.2), new Account(7777, "SOO", 56000, 5.8),
				new Account(8888, "MIN", 23400, 2.2), new Account(9999, "JANG", 12600, 8.9) };
		System.out.println("1.은행 총계좌수:" + accounts.length);
		System.out.println("2.은행계좌 전체출력");
		accounts[0].headerPrint();
		for (int i = 0; i < accounts.length; i++) {
			accounts[i].print();
		}
		System.out.println("3.은행계좌 총잔고");
		int totBalance = 0;
		/*
		totBalance+=accounts[0].getBalance();
		totBalance+=accounts[1].getBalance();
		totBalance+=accounts[2].getBalance();
		totBalance+=accounts[3].getBalance();
		totBalance+=accounts[4].getBalance();
		totBalance+=accounts[5].getBalance();
		totBalance+=accounts[6].getBalance();
		totBalance+=accounts[7].getBalance();
		totBalance+=accounts[8].getBalance();
		*/
		for (int i = 0; i < accounts.length; i++) {
			totBalance += accounts[i].getBalance();
		}
		System.out.println(">>" + totBalance);
		System.out.println("4.은행 계좌들중에서 계좌번호 3333번계좌 한개 찾아서 출력(계좌번호는 중복되지않는다)");
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i].getNo() == 3333) {
				accounts[i].print();
				break;
			}
		}
		System.out.println("5.은행 계좌들중에서 계좌잔고 50000원이상인 VIP계좌 여러개 찾아서 출력");
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i].getBalance() >= 50000) {
				accounts[i].print();
			}
		}
		System.out.println("6.은행 계좌들중에서 계좌이율 5.0 이상인 계좌 여러개 찾아서 출력");
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i].getIyul() >= 5.0) {
				accounts[i].print();
			}
		}
		System.out.println("6.은행 계좌들중에서 이름이 KIM인 계좌 여러개 찾아서 출력[String객체배우고난후에]");
		for (int i = 0; i < accounts.length; i++) {
			String tempOwner = accounts[i].getOwner();
			if (tempOwner.equals("KIM")) {
				accounts[i].print();
			}
		}
		System.out.println("7.6666번계좌 3000원입금");
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i].getNo() == 6666) {
				/**********************************
				 * System.out.println(accounts[i]); Account tempAccount = accounts[i];
				 * System.out.println(">>입금전"); tempAccount.print(); tempAccount.deposit(3000);
				 * System.out.println(">>입금후"); tempAccount.print();
				 ******************************/
				System.out.println(">>입금전");
				accounts[i].print();
				accounts[i].deposit(3000);
				System.out.println(">>입금후");
				accounts[i].print();
				break;
			}
		}
		System.out.println("8.9999번계좌 3000원출금[Quiz]");

		System.out.println("9.계좌잔고순으로 오름[내림]차순정렬");
		System.out.println(">>>정렬전");
		for (int i = 0; i < accounts.length; i++) {
			accounts[i].print();
		}
		// 1회정렬을 --> 8번실행(i=0,1,2,3,4,5,6,7)
		for (int i = 0; i < accounts.length - 1; i++) {
			// 1회정렬
			// boolean isSwap=false;
			for (int j = 0; j < accounts.length - 1 - i; j++) {

				if (accounts[j].getBalance() > accounts[j + 1].getBalance()) {
					// 주소값교환
					Account tempAccount = accounts[j];
					accounts[j] = accounts[j + 1];
					accounts[j + 1] = tempAccount;
					// isSwap=true;
				}
			}
			/*
			if(!isSwap) {
				System.out.println("isSwap:"+isSwap);
				break;
			}else{
			   System.out.println("isSwap:"+isSwap);
			}
			*/
		}
		System.out.println(">>>정렬후");
		for (int i = 0; i < accounts.length; i++) {
			accounts[i].print();
		}

		System.out.println("9.계좌번호순으로 오름(내림)차순정렬");
		System.out.println("10.5555계좌한개 이율을 9.9으로변경");
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i].getNo() == 5555) {
				accounts[i].setIyul(9.9);
				accounts[i].print();
				break;
			}
		}
		System.out.println("11.VIP계좌(잔고500000원이상)여러개 잔고 50원 증가");
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i].getBalance() >= 50000) {
				accounts[i].deposit(50);
				accounts[i].print();
			}
		}

	}

}