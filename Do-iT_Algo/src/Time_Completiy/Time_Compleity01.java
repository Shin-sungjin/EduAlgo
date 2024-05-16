package Time_Completiy;
import java.lang.System.Logger;

public class Time_Compleity01 {

	/** @author Faust
	 *  @Date : 2024/05/16
	 * 	Time_compleity = 시간 복잡도
	 *  
	 *  1. 시간 복잡도란? 주어진 문제를 해결하기 위한 연산 횟수
	 *      = 수행시간은 1억 번의 연산을 1초의 시간으로 간주하여 예측
	 *  	시간 복잡도에 대한 정의 3가지 
	 *  	1). 빅-오메가( Ω(n) ) : Best Case 연산횟수 표기법
	 *      2). 빅-세타( Θ(n)) : Average Case 연산 횟수 표기법 [보통 정도]
	 *      3). 빅-오 ( O(n) ) : Worst Case 연산 횟수 표기 
	 * */
	public static void main(String[] args) {
		//ex1. 0~99 사이의 무작위 값 출력 코드 
		int targetNum = (int)(Math.random() * 100) ;
		System.out.println(targetNum);
		for(int i =0; i<100; i++) {
			if(i == targetNum) {
				System.out.println(i);
				break;
			}
		}
		/**
		 *  해당 코드의 시간 복잡도를 정의에 따라 표기하면 
		 *  1. Ω(n) = 1
		 *  2. Θ(n) = N/2
		 *  3. O(n) = N 번이다. 
		 *  
		 *  음,, 아직은 잘 감이 잡히지 않는다. 직관적으로 생각해보자면
		 *  빅-오메가 = targetNum이 0일 경우에는 1번의 수행만이 필요하다
		 *  빅-세타 = targetNum의 범위가 1~100까지이니, 이를 Average화 하면 50이니까,,,?
		 *  빅-오 = targetNum이 100이면, 총 100번의 연산을 해야하기 때문이라고 생각한다.
		 * */
		
	}
	
}
