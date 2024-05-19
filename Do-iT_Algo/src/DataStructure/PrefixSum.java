package DataStructure;

import java.util.Scanner;

public class PrefixSum {
	/** @Date 2024./05/19
	 *  @author Shinsungjin
	 *  
	 *  * 구간 합 ( Prefix Sum)
	 *   -시간 복잡도를 줄이기 위해 사용하는 특수한 목적의 알고리즘 
	 *   
	 *   핵심 이론 
	 *    - 배열 A를 합 배열로 만들기 
	 *    S[i] = A[0] + A[1] + A[2]+ ... +A[i]
	 *     
	 *     이처럼 합 배열은 기존의 배열을 전처리한 배열이라고 생각하면 된다. 이렇게 합 배열을 통해 얻을 수 있는 이점은 
	 *     o(n) -> o(1)의 시간 복잡도 
	 *     
	 *      합 배열 S 구하는 공식 
	 *      S[i] = S[i-1]+A[i] 
	 *      
	 *      구간합 구하는 공식 
	 *      i 에서 j 까지 
	 *      S[j] - S[i-1]
	 * */
	
	public static void main(String[] args) {
		/** Ex 003.구간합 구하기 
		 *  수 N개가 주어졋을 때 i 번째 수 에서 J 번째 수까지의 합을 구하는 프로그램 작성 
		 *   - 1번째 줄에 수의 개수, 합을 구해야하는 횟수, 2번째 줄에 n개의 수가 주어진다. 
		 *   3번째 줄부터 m개의 줄에 합을 구해야하는 구간 I와 J가 주어진다. 
		 * */
		Scanner sc = new Scanner(System.in);
		System.out.println("수의 갯수 및 반복 횟수");
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
	
	/** 여기 알고리즘 짜는데,, 배열의 인덱스 선언 방식 때문에 상당히 애먹음,.,
	 *  왜 index 0 번을 비워두지,.,? 그걸 해결 할만한 좋은 방향은 없을까 고민하느라 30분 정도 사용한 것 같다.
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
