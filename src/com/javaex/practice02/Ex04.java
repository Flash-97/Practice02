package com.javaex.practice02;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		
		//나이
		int age;
		
		//스캐너
		Scanner sc = new Scanner(System.in);
		
		//"출력"
		System.out.println("나이를 입력해주세요");
		System.out.print("나이: ");
		
		//""입력
		age = sc.nextInt();
		
		//조건 19세이상 65세미만
		if (age >= 19 && age < 65) {
			System.out.println("1번그룹 입니다.");
		} else {
			System.out.println("2번그룹 입니다.");
		}
		
		
		
		
		
		
		//스캐너닫기
		sc.close();
	}

}
