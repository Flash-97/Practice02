package com.javaex.practice02;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		
		int num1;  //숫자1
		int num2;  //숫자2
		int big;   // 큰 수 
		int small; //작은수
		
		//스캐너
		Scanner sc = new Scanner(System.in);
		
		//숫자1"출력"
		System.out.println("숫자2개를 입력해주세요");
		System.out.print("숫자1: ");
		//숫자1"입력"
		num1 = sc.nextInt();
		
		//숫자2""출력"
		System.out.print("숫자2: ");
		//숫자2"입력"
		num2 = sc.nextInt();
		
		//조건: 큰수와 작은수 분류
		if(num1<num2) {
			big = num2;
			small = num1;
		} else {
			big = num1;
			small = num2;
		}
		//입력받은 수
		System.out.println("큰수: " +big + "\t 작은수: " + small);
		
		
		
		
		
		//스캐너 닫기
		sc.close();
	}

}
