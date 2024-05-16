package Time_Completiy;
import java.util.Iterator;

public class Time_Compleity02 {
	/** @Date 24/05/16
	 *  시간 복잡도 활용하기.
	 * */
	public static void main(String[] args) {
		/** @Intro : 수 정렬하기 
		 *  Bubble Sort = O(n **2)
		 *  병합 정렬 = O(nlog n) 
		 * Ex 0. 수 정렬하기 
		 N개의 수가 주어졌을 때 이를 오름 차순 하는 정렬 프로그램 작성 
		 버블 정렬은 할 수 있겠지만,, 일단,, 천천히 개념부터 알아보자
		 
		 1. 시간 제한 2초 = 2억번 이하의 연산 횟수로 문제 해결해야 한다. 
		    =시간 복잡도의 경우, 항상 최악일 경우를 산정 => 데이터가 가장 클 때를 기준으로 작성 
		 @Tip = 연산 횟수 계산법 [ 연산횟수 = 알고리즘 시간 복잡도 * 데이터 크기]   
		 
		 2. 알고리즘 적합성 평가 
		   버블 정렬 = (1,000,000) **2 = 1,000,000,000,0000 > 2억 => 부적합 알고리즘 
		   병합 정렬 = 1,000,000 log (1,000,000) = 약 2천 < 2억 => 적합 알고리즘 
		   
		   즉 이 문제는 병합 정렬로 해결해야 한다.
		 @TIp = 데이터의 최대크기(N)를 단서로 사용하여, 사용할 알고리즘 유추  
		 * */
		/** 시간 복잡도 도출 기준 
		 *  1.상수는 시간 복잡도 계산에서 제외 
		 *  2.가장 많이 중첩된 반목문의 수행 횟수가 시간 복잡도의 기준 
		 * */
		//연산 횟수가 N인 경우
		N();
		//연산 횟수가 3N인 경우 
		ThreeN();
		
		/** 두 예제 코드의 연산 횟수는 3배가 차이남, 
		 *  But, 일반적인 코테의 경우 상수 무시 => 두 코드의 시간 복잡도는 O(n)으로 동일
		 * */

		//연산횟수 n **2 
		Npow2();
		/** 시간 복잡도는 가장 많이 중첩된 반복문을 기준으로 도출 
		 * Npow2 에서는 이중 for문이 전체 코드의 시간 복잡도 기준 (해당 메소드에 더 많은 일반 포문이 있어도 시간 복잡도는 N **2로 동일)
		 *  
		 *  =>작성한 코드의 시간 복잡도 도출로 실제 코테에서 시간 초과 발생시 원인 발견 가능  
		 * */
	
	
	}
	public static void N() {
		int N = 100000;
		int cnt = 0;
		for (int i =0; i<N; i++) {
			System.out.println("연산횟수 :" + cnt++);
		}
	}
	public static void ThreeN() {
		int N = 100000;
		int cnt = 0;
		for (int i =0; i<N; i++) {
			System.out.println("연산횟수 :" + cnt++);
		}
		for (int i =0; i<N; i++) {
			System.out.println("연산횟수 :" + cnt++);
		}
		for (int i =0; i<N; i++) {
			System.out.println("연산횟수 :" + cnt++);
		}
	}
	
	public static void Npow2() {
		int N = 100000;
		int cnt = 0;
		for (int i =0; i<N; i++) {
			for (int j=0; j<N; j++) {
				System.out.println("연산횟수 :" + cnt++);
			}
		}
	}
	

}
