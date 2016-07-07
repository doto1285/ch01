package ch01;

import java.util.Scanner;

public class SumToInput {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int result = 0;
		System.out.print("입력>");
		int num = scanner.nextInt();
		for(int i=1; i<=num; i++) {
			result += i;
		}
		System.out.println(result);
	}
}
