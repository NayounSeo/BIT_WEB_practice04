package prob1;

import java.util.Scanner;

public class Prob1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner( System.in );
		int count =  0;

		while (count < 3) {
			System.out.print( "숫자를 입력하세요: " );
			
			int inputNumber = scanner.nextInt();
			int sum = 0;
			
			/* 여기에 구현 코드를 작성 합니다. */
			//왜 static 아니면 에러나는지도 이따 정리하기
			summation(inputNumber);
			count++;
			System.out.println();
		}
		scanner.close();
	}
	
	public  static void summation(int to) {
		int sum = 0;
		int evenOrOdd = 0;
		if (to%2 == 1) {
			evenOrOdd = 1;
		}
		for (int i = evenOrOdd; i<=to; i+=2) {
			sum += i;
		}
		System.out.println("결과 값 : "+sum);
	}
}
