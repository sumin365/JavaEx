package com.javaex.practice01;

public class problem03 {

	public static void main(String[] args) {
		//구구단입력
		for (int num =1; num <=9; num ++) {
			for (int dan=2; dan <= 9 ; dan ++) {
				System.out.printf("%d*%d=%d\t", dan, num, dan*num);
				
			}
			System.out.println();
		}

	}

}
