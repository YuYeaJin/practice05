package frist;

import java.util.Scanner;

public class SwitchEx {

	public static void main(String[] args) {
//		ifEx();
		ifEx2();
		
	}
	
	private static void ifEx() {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("점수를 입력하세요.");
		
		int num = scanner.nextInt();
		
		if(num %3 == 0) {
			System.out.println("3의 배수입니다.");
			} else {System.out.println("3의 배수가 아닙니다.");
		
		}
		
		scanner.close();
	}
	
	private static void ifEx2() {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("점수를 입력하세요.");
		
		int num2 = scanner.nextInt();
		
		if(num2 >= 90) {
			System.out.println("A등급");
		} else if (num2 >= 80) {
			System.out.println("B등급");
		} else if (num2 >= 70) {
			System.out.println("C등급");
		} else if (num2 >= 60) {
			System.out.println("D등급");
		} else {
			System.out.println("F등급");
		}
	}
}
