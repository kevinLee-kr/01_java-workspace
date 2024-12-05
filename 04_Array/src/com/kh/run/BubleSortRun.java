package com.kh.run;

public class BubleSortRun {

	public static void main(String[] args) {//버블 배열
		int[] arr = {22,90,30,68,87,1,13};
		int temp = 0;
		
		for(int i = 0 ; i<=arr.length;i++) { //사이클 끝난거 arr.length만큼 반복.
			for(int j = 1; j<arr.length;j++) {//1사이클
				if(arr[j-1] > arr[j]) { //앞에 숫자가 뒤에 숫자보다 클 경우.
					temp = arr[j-1]; // 임시보관소에 앞에 있는 숫자(더큰숫자)보관
					arr[j-1] = arr[j]; // 작은숫자를 앞자리에 넣기
					arr[j] = temp; // 임시보관한 숫자를 뒷자리에 넣는 작업.
				}
			}
		}
		
		for(int i = 0; i<arr.length;i++) {
			System.out.print(arr[i] + " "); // 1 13 22 30 68 87 90 
		}
		
		
		
		
		
	}
}
