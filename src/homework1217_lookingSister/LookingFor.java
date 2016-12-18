package homework1217_lookingSister;

import java.util.Scanner;

public class LookingFor {
	Scanner scan = new Scanner(System.in);
	int N;
	int K;
	public LookingFor(){
		this.N = scan.nextInt();
		this.K = scan.nextInt();
	}
	public void lookingWork(){
		if ( N > K) {
			System.out.println(N-K);
		}else{
			//본인이 서있는 위치 빼주고 초기화
			int sec = -1;
			
			sec = sec + (K%N);
			sec = sec + (K/N);
			System.out.println(sec);
		}
	}
}
