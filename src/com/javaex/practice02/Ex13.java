package com.javaex.practice02;

import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		int num1=0;
		double xy=0;
		Scanner  sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력해주세요");
		System.out.print("숫자: ");
		
		num1 = sc.nextInt();
		
		if (num1<=0) {
			xy = (num1*num1*num1)-9*num1+2;
			System.out.println("계산결과는 " + xy + " 입니다.");
		} else if (num1>0) {
			xy = (num1*7)+2;
			System.out.println("계산결과는 " + xy + " 입니다.");
		}
		
		
		
		
		
		
		
		sc.close();
	}

}
