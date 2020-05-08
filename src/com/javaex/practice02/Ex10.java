package com.javaex.practice02;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		
		int num;
		int br;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("사번(정수)를 입력해주세요");
		System.out.print("사번: ");
		num = sc.nextInt();
		
		br = num%3;
		
		/*switch (br) {
		case 0:
			System.out.println("A팀입니다.");
			break;
		case 1:
			System.out.println("B팀입니다.");
			break;
		case 2:
			System.out.println("C팀입니다.");
			break;
		default :
			System.out.println("잘못입력하셨습니다.");
			break;
		}
		*/
		
		if (br==0) {
			System.out.println("A");
		}
		else if(br==1){
			System.out.println("B");
		}
		else if(br==2) {
			System.out.println("C");
		}
		else {
			System.out.println("잘못");
		}
		
		
		
		
		
		
		sc.close();
	}

}
