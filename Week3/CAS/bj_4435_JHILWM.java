package asd;

import java.util.Scanner;

public class bj_4435_JHILWM {
	int[] Gan = {1, 2, 3, 3, 4, 10}; // ��� ���� ������ ������ ����(�������, ȣ��, �ΰ�...���ϻ���)
	int[] Sa = {1, 2, 2, 2, 3, 5, 10}; // ��� ���� ������ ���� ����(�������, ��ũ, �ΰ�... ���ϻ���)
	int[] win; // �ο��� ����� �����ϴ� ������ �迭
	
	bj_4435_JHILWM(int i) { // ������
		this.setBattle(i);
	}
	
	void setBattle(int battle) { // �ο��� ����� �����ϴ� �迭�� ũ�⸦ �������ִ� �޼ҵ�
		this.win = new int[battle];
	}
	
	int ganPower(int[] i) { // ������ ������ ���� ������ �����ִ� �޼ҵ�
		int power = 0; // �������ֱ� ���� ���� ���� �� �ʱ�ȭ
		for(int j = 0; j < 6; j++) {
			power += i[j]*this.Gan[j]; // ���� �ڱ��ڽ��� ��ü�� ������ ���� ������ �Ű������� ���� �迭 i�� i��° �ε��� ���� ���Ͽ� ���Ѵ�.
		}
		return power;
	}
	
	// ���� ������ ���� ������ �����ִ� �޼ҵ�. ���� �����Ƿ� ���ϻ���
	int SaPower(int[] i) { 
		int power = 0; 
		for(int j = 0; j < 7; j++) {
			power += i[j]*this.Sa[j];
		}
		return power;
	}
	
	// ������ ������ ���� ������ ���Ͽ� ���� �̰����, win �迭�� ����. i�� ���° ������ ������� �����ϱ� ���� ������.
	void winner(int Gan, int Sa, int i) { 
		if(Gan > Sa) {
			win[i] = 0;
		} else if(Gan < Sa) {
			win[i] = 1;
		} else {
			win[i] = 2;
		}
	}
	
	// ���� �̰���� ����ϴ� �޼ҵ�. i�� ���° �������� �������� �Ű������� �޾ƿ�.
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
