package DataStructure;

import java.util.Scanner;

public class ArrayAndList002 {
	/**Ex002 ��� ���ϱ� 
	 * �����̴� �⸻ ��縦 ���ļ� ������ �����ϱ�� �ߴ�. 
	 * �ϴ� �����̴� �ڱ� ������ �ִ��� �����. ���׷� ���� �ִ��� M�̶�� �� �� ��� ������ ����/M *100���� ���ƴ�.
	 * �̶� ���ο� ����� ���ϴ� ���α׷����ۼ��Ͻÿ�
	 * 
	 * */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("���� �����Է�");
		System.out.println("�� ������ ���� ���� �Է�");
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
