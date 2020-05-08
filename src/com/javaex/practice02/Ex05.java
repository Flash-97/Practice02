package com.javaex.practice02;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {

		int height;
		int weight;
		double body;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("키와 몸무게를 입력해주세요.");
		System.out.print("키: ");
		height = sc.nextInt();
		System.out.print("몸무게: ");
		weight = sc.nextInt();
		
		body = (height-100)*0.9;
		
		if (body<(weight-2)) {
			System.out.println("과체중 입니다.");
		}else if(body>(weight+2)) {
			System.out.println("저체중 입니다.");
		} else {
			System.out.println("표준 입니다.");
		}
		
		System.out.println("표준체중: "+ body);
		
		
		
		
		
		
		
		
		
		sc.close();
	}

}
