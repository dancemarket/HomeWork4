package homework1217_commonNumber;

import java.util.Scanner;

public class CommonWork {
	Scanner scan = new Scanner(System.in);
	
	//배열의 숫자를 곱해서 넣을 위치
	int aNumber = 1;
	int bNumber = 1;
	
	public void commonFind(){
		arrayMake();
		arrayMake2();
		//aNumber가 bNumber보다 작다면 서로 바꿔주고
		if (aNumber < bNumber) {
			int tempNumber;
			tempNumber = bNumber;
			bNumber = aNumber;
			aNumber = tempNumber;
		}
		
		while(bNumber != 0){
			int remainder = aNumber%bNumber;
			aNumber = bNumber;
			bNumber = remainder;
		}
		System.out.println(aNumber);		
	}
	
	//순서대로 입력 받아야 해서 두개로 메소드 나누고
	public void arrayMake(){
		//배열 크기 입력 받고
		int[] nArray = new int[scan.nextInt()];
		//배열에 하나하나 숫자 넣고
		for (int i = 0; i < nArray.length; i++) {
			nArray[i] = scan.nextInt();
		}
		//그 숫자들 곱해서 저장
		for (int i = 0; i < nArray.length; i++) {
			aNumber = aNumber*nArray[i];
		}
	}
	public void arrayMake2(){
		int[] mArray = new int[scan.nextInt()];
		for (int i = 0; i < mArray.length; i++) {
			mArray[i] = scan.nextInt();
		}
		for (int i = 0; i < mArray.length; i++) {
			bNumber = bNumber*mArray[i];
		}
	}
}
