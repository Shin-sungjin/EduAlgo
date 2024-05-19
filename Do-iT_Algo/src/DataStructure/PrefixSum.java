package DataStructure;

import java.util.Scanner;

public class PrefixSum {
	/** @Date 2024./05/19
	 *  @author Shinsungjin
	 *  
	 *  * ���� �� ( Prefix Sum)
	 *   -�ð� ���⵵�� ���̱� ���� ����ϴ� Ư���� ������ �˰��� 
	 *   
	 *   �ٽ� �̷� 
	 *    - �迭 A�� �� �迭�� ����� 
	 *    S[i] = A[0] + A[1] + A[2]+ ... +A[i]
	 *     
	 *     ��ó�� �� �迭�� ������ �迭�� ��ó���� �迭�̶�� �����ϸ� �ȴ�. �̷��� �� �迭�� ���� ���� �� �ִ� ������ 
	 *     o(n) -> o(1)�� �ð� ���⵵ 
	 *     
	 *      �� �迭 S ���ϴ� ���� 
	 *      S[i] = S[i-1]+A[i] 
	 *      
	 *      ������ ���ϴ� ���� 
	 *      i ���� j ���� 
	 *      S[j] - S[i-1]
	 * */
	
	public static void main(String[] args) {
		/** Ex 003.������ ���ϱ� 
		 *  �� N���� �־�� �� i ��° �� ���� J ��° �������� ���� ���ϴ� ���α׷� �ۼ� 
		 *   - 1��° �ٿ� ���� ����, ���� ���ؾ��ϴ� Ƚ��, 2��° �ٿ� n���� ���� �־�����. 
		 *   3��° �ٺ��� m���� �ٿ� ���� ���ؾ��ϴ� ���� I�� J�� �־�����. 
		 * */
		Scanner sc = new Scanner(System.in);
		System.out.println("���� ���� �� �ݺ� Ƚ��");
		String[] first = sc.nextLine().split(" ");
		String[] arr = sc.nextLine().split(" ");
		int idx = Integer.parseInt(first[0]);
		int cnt = Integer.parseInt(first[1]);
		int startIdx = 0;
		int lastIdx = 0;
		int[] target = parse(arr);
		
		for(int i =0; i<cnt; i++) {
			System.out.println("StartIndex  laseIndex");
			String[] idxs = sc.nextLine().split(" ");
			startIdx = Integer.parseInt(idxs[0]);
			lastIdx = Integer.parseInt(idxs[1]);
			System.out.println(perfix(startIdx, lastIdx, target));
			
		}
	}
	
	/** ���� �˰��� ¥�µ�,, �迭�� �ε��� ���� ��� ������ ����� �ָ���,.,
	 *  �� index 0 ���� �������,.,? �װ� �ذ� �Ҹ��� ���� ������ ������ ����ϴ��� 30�� ���� ����� �� ����.
	 * */
	
	public static int[] parse(String[] arr) {
		int len = arr.length;
		System.out.println(len);
		int[] result = new int[len + 1];
		result[0] = 0;
		for(int i =1; i <=len; i++) {
			result[i] = result[i-1] + Integer.parseInt(arr[i-1]);
		}
		return result;
	}
	
	public static int perfix(int startidx, int lastidx, int[] target) {
		int result = target[lastidx] - target[startidx -1];	
		return result;
	}
	
}
