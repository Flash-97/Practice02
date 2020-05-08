package com.javaex.practice02;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		
		int num1=0;   //첫번째 숫자
		int num2=0;   //두번째 숫자
		int share=0;  // 몫
		int rest=0;   // 나머지
		
		//스캐너
		Scanner sc = new Scanner(System.in);
		 
		//첫번째 숫자"출력"
		System.out.print("첫번째 숫자: ");
		//첫번째 숫자"입력"
		num1 = sc.nextInt();
		
		//두번째 숫자"출력"
		System.out.print("두번째 숫자: ");
		//두번째 숫자"입력"
		num2 = sc.nextInt();
		
		//조건:몫과 나머지
		if (num1>num2) {
			share = (num1/num2); // 몫
			rest = (num1%num2);  // 나머지
		} else {
			share = (num2/num1); // 몫
			rest = (num2%num1);  // 나머지
		}
		System.out.println("몫: "+share);
		System.out.println("나머지: "+rest);
		
		//스캐너닫기
		sc.close();
	}

}
