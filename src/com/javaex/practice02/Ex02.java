package com.javaex.practice02;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		
		int x = 0;
		
		Scanner sc = new Scanner(System.in);
		
		//x가 0과 같으면
		
		System.out.println("x는 0인가요?");
		x = sc.nextInt();
		
		if(x == 0) { //같으면 (==)표시
			System.out.println("x는 0이다.");
		}
		
		
		
		
		sc.close();
	}

}
