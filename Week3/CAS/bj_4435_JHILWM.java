package asd;

import java.util.Scanner;

public class bj_4435_JHILWM {
	int[] Gan = {1, 2, 3, 3, 4, 10}; // 멤버 변수 간달프 군대의 점수(순서대로, 호빗, 인간...이하생략)
	int[] Sa = {1, 2, 2, 2, 3, 5, 10}; // 멤버 변수 사우론의 군대 점수(순서대로, 오크, 인간... 이하생략)
	int[] win; // 싸움의 결과를 저장하는 정수형 배열
	
	bj_4435_JHILWM(int i) { // 생성자
		this.setBattle(i);
	}
	
	void setBattle(int battle) { // 싸움의 결과를 저장하는 배열의 크기를 세팅해주는 메소드
		this.win = new int[battle];
	}
	
	int ganPower(int[] i) { // 간달프 군대의 힘의 총합을 구해주는 메소드
		int power = 0; // 리턴해주기 위한 변수 선언 및 초기화
		for(int j = 0; j < 6; j++) {
			power += i[j]*this.Gan[j]; // 현재 자기자신의 객체의 간달프 군대 점수와 매개변수로 받은 배열 i의 i번째 인덱스 값을 곱하여 더한다.
		}
		return power;
	}
	
	// 사우론 군대의 힘의 총합을 구해주는 메소드. 위와 같으므로 이하생략
	int SaPower(int[] i) { 
		int power = 0; 
		for(int j = 0; j < 7; j++) {
			power += i[j]*this.Sa[j];
		}
		return power;
	}
	
	// 간달프 점수와 사우론 점수를 비교하여 누가 이겼는지, win 배열에 저장. i는 몇번째 전투의 결과인지 저장하기 위해 가져옴.
	void winner(int Gan, int Sa, int i) { 
		if(Gan > Sa) {
			win[i] = 0;
		} else if(Gan < Sa) {
			win[i] = 1;
		} else {
			win[i] = 2;
		}
	}
	
	// 누가 이겼는지 출력하는 메소드. i는 몇번째 전투인지 묻기위해 매개변수로 받아옴.
	void whoWin() {
		for(int i = 0; i < this.win.length; i++) {
			System.out.print("Battle " + (i+1) + ": ");
			if(this.win[i] == 0) {
				System.out.println("Good triumphs over Evil");
			} else if(this.win[i] == 1) {
				System.out.println("Evil eradicates all trace of Good");
			} else {
				System.out.println("No victor on this battle field");
			}	
		}
	}

	public static void main(String[] args) {
		//BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		//String[] battlecount = bf.readLine().split(" ");
		Scanner s = new Scanner(System.in);
		int count = s.nextInt();
		int[] Gan = new int[6];
		int[] Sa = new int[7];
		
		bj_4435_JHILWM m = new bj_4435_JHILWM(count);
		
		for(int i = 0; i < count; i++) {
			for(int j = 0; j < 6; j++) {
				Gan[j] = s.nextInt();
			}
			for(int j = 0; j < 7; j++) {
				Sa[j] = s.nextInt();
			}
			m.winner(m.ganPower(Gan), m.SaPower(Sa), i);
		}
		m.whoWin();
	}
}
