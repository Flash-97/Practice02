package com.javaex.practice02;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		char eng;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("알파벳 1글자(소문자)를 입력하세요");
		System.out.print("알파벳: ");
		
		eng = sc.next().charAt(0);
		switch (eng) {
		case 'a' :
		case 'e' :
		case 'u' :
			System.out.println("모음입니다.");
			break;
		case 'z' :
		case 'k' :
			System.out.println("자음입니다.");
			break;
		}
		
		
		
		
		
		
		sc.close();
	}

}
