package DataStructure;

import java.util.Scanner;

public class ArrayAndList002 {
	/**Ex002 평균 구하기 
	 * 세준이는 기말 고사를 망쳐서 점수를 조작하기로 했다. 
	 * 일단 세준이는 자기 점수중 최댓값을 골랐다. ㄷ그런 다음 최댓값을 M이라고 할 때 모든 점수를 점수/M *100으로 고쳤다.
	 * 이때 새로운 평균을 구하는 프로그램을작성하시오
	 * 
	 * */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("과목 갯수입력");
		System.out.println("각 과목의 시험 성적 입력");
		int num = 1;
		String score = "1 100 100 100";
		double result = CustomAvg(score);
		System.out.println(result);
		
	}
	
	public static double CustomAvg(String target) {
		double result = 0;
		String[] score = target.split(" ");
		int Max = 0;
		for(int i = 0; i<score.length; i++) {
			int tar = Integer.parseInt(score[i]);
			if(Max < tar) {
				Max = tar;
			}
		}
		System.out.println(Max);
		double[] custom = new double[score.length];
		double sum = 0;
		for(int j = 0; j<score.length; j++) {
			custom[j] = (Double.parseDouble(score[j])/Max) * 100;
			System.out.println(custom[j]);
			sum += custom[j];
		}
		result = sum/custom.length;
		return result;
	}
}
