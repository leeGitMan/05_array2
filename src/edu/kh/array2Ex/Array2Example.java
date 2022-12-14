package edu.kh.array2Ex;

import java.util.Arrays;

public class Array2Example {
	
	public void array2ex() {
		
		/* 2차원 배열
		 * 
		 * 
		 * - 자료형이 같은 1차원 배열을 묶음으로 다루는 것.
		 * - > 행, 열 개념이 추가됐음.
		 * 
		 */
		
		// 2차원 배열 선언
		
		// int[][] arr; == int arr[][] == int[] arr[]
		
		// int 2차원 배열을 참조하는 참조 변수 선언 해보기
		// note ! (참조형 == 참조 변수 == 래퍼런스 변수 == 래퍼런스)
		
		int[][] arr;
		
		// 2차원 배열 할당
		// -> new 자료형[행크기][열크기]
		
		arr = new int[2][3];
		// heap 영역에 int 2차원 배열 2(가로)행 3(세로)열 공간 할당
		
		// 2차원 배열 초기화 해보기
		// 1) 행, 열 인덱스 직접 접근 그리고 직접 초기화
		
		/*
		arr[0][0] = 10;
		arr[0][1] = 20;
		arr[0][2] = 30;
		
		arr[1][0] = 40;
		arr[1][1] = 50;
		arr[1][2] = 60;
		*/
		
		
		// 2) 2중 for문을 이용한 초기화
		
		// 배열 요소 초기화에 사용할 변수
		
		int num = 10;
		
		// * 배열 길이
		// -> 배열명.length는 변수가 **직접 참조**하고 있는 길이를 반환
		
		System.out.println(arr.length); // 2 (행 길이)
		// arr이 참조하고 있는 2차원 배열의 행의 길이
		System.out.println(arr[0].length); // 3 (열 길이) 0행이 참조하고 있는 1차원 배열의 열의 길이
		
		for(int row = 0; row < arr.length; row++) { // 행의 반복 (0, 1) 반복
			for(int col = 0; col < arr[row].length; col++) { // 열 반복 (0,1,2) 반복
				
				arr[row][col] = num;
				num += 10;
			}
		}
		// 2차원 배열은 Arrays.toSting()으로 값을 못 찾는다. --> 참조하고 있는 1차원 배열 값을 문자열로 반환
		// System.out.println(Arrays.toString(arr));
		// Arrays.deepToString(배열명)
		// - 참조하고 있는 배열의 데이터가 나오는 부분 까지 파고들어가기
		// 모든 값을 문자열로 반환
		
		System.out.println(Arrays.deepToString(arr));
		
	}
	
	
	public void array2ex2() {
		
		
		// 2차원 배열 선언과 동시에 초기화
		// 3행 3열 짜리 정수형 2차원 배열 선언과 동시에
		// 1~9까지 초기화
		
		int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
		System.out.println(Arrays.deepToString(arr));
		
		
		// 행 별로 합 출력 하기
		System.out.println("=============================");
		
		for(int row = 0; row < arr.length; row++) {
			int sum = 0;
			for(int col = 0; col < arr[row].length; col++) {
				// 현재 행의 모든 열의 값을 누적
				sum += arr[row][col];
						// 0    0,1,2
						// 1    0,1,2
						// 2 	0,1,2
			}
			System.out.printf("%d행의 합 : %d\n" , row, sum);
			
		}
		
		System.out.println("=============================");
		// 열 별로 합 출력 하기
		// -> 열 부터 지정 후 각 행의 값을 누적
		for(int col = 0; col < arr[0].length; col++) { // 열 반복
			
			int sum = 0;
			
			for(int row = 0; row < arr.length; row++) {
				sum+= arr[row][col];
			
			}
			System.out.printf("%d열의 합 : %d\n" , col, sum);
		}
		
		
		System.out.println("=============================");
		// 전체 합 출력
		
		int sum = 0;
		for(int row = 0; row < arr.length; row++) {
			for(int col = 0; col< arr[row].length; col++) {
				sum += arr[row][col];
			}
		}
		System.out.println("전체 합 : " + sum);
	}
	
	public void array2ex3() {
		
		// 가변 배열 
		// 2차원 배열 생성 시 마지막 배열 차수(얄)를 지정 하지 않고
		// 나중에 서로 크기가 다른 1차원 배열을 생성하며 참조하는 배열
		
		char[][] arr = new char[4][];
						// char 2차원 배열 생성 시, 행 부분만 작성
		
		arr[0] = new char[3]; // 0 행에 3열짜리 1차원 배열 생성하여 주소 값 저장
		arr[1] = new char[4]; // 1 행에 4열짜리 1차원 배열 생성하여 주소 값 저장
		arr[2] = new char[5]; // 2 행에 5열짜리 1차원 배열 생상하여 주소 값 저장
		arr[3] = new char[2]; // 3 행에 2열짜리 1차원 배열 생성하여 주소 값 저장
		
		char ch = 'a';
		for(int row = 0; row < arr.length; row++) { // 행
			for(int col = 0; col < arr[row].length; col++) { // 열
				arr[row][col] = ch++;
			}
		}
		System.out.println(Arrays.deepToString(arr));
	}
}
