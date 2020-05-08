package com.javaex.practice02;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		
		char mark;
		double num1;
		double num2;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("출력되는 내용을 입력하세요.");
		System.out.print("기호: ");
		mark = sc.next().charAt(0);
		System.out.print("숫자1: ");
		num1 = sc.nextInt();
		System.out.print("숫자2: ");
		num2 = sc.nextInt();
		
		switch (mark) {
		case '+':
			System.out.println("결과는 "+ (num1+num2));
			break;
			
		case '-':
			System.out.println("결과는 "+ (num1-num2));
			break;
			
		case '*':
			System.out.println("결과는 "+ (num1*num2));
			break;
			
		case '/':
			if (num2==0) {
				System.out.println("계산할 수 없습니다.");
				break;
			}
			System.out.println("결과는 "+ (num1/num2));
			break;
			
		default :
			System.out.println("계산할 수 없는 기호입니다.");
			break;
		}
		
		
		
		
		
		sc.close();
	}

}
