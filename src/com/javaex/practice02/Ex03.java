package com.javaex.practice02;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		
		//나이
		int age;
		
		//스캐너
		Scanner sc = new Scanner(System.in);
		
		//"출력"
		System.out.println("나이를 입력해주세요");
		System.out.print("나이: ");
		
		//"입력"
		age = sc.nextInt();
		
		//조건
		if(age > 20) {
			System.out.println("\"1번그룹\""); // 21, 100
		} else {
			System.out.println("\"2번그룹\""); // 15, 19, 20
		}
		System.out.println("입니다.");
		
		
		
		
		
		
		//스캐너닫기
		sc.close();
	}

}
