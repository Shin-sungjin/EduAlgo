package DataStructure;

import java.util.Iterator;
import java.util.Scanner;

public class ArrayAndList {
 /** 배열과 리스트 
  *  * 배열
  *    -메모리의 연속 공간에 값이 채워져 있는 형태의 자료 구조 
  *    - 배열의 값은 인덱스를 통해 참조가 가능하며, 선언한 자료형의 값만 저장 가능
  *    
  *  * 배열의 특징 
  *   1. 인덱스를 사용하여 값에 바로 접근이 가능하다 
  *   2. 새로운 값을 삽입하거나 특정 인ㄷ게스에 있는 값을 삭제 하기 어려움, 
  *      -> 값을 삽입 or 삭제 하려면 해당 인덱스 주변에 있는 값을 이동시키는 과정이 필요 
  *   3.배열의 크기는 선언할 때 지정 가능, => 선언된 크기는 변경 불가. 
  *   4. 간단한 구조로 코테에서 많이 활용 됨 
  *   
  *  *리스트 
  *    =>값과 포인터를 묶은 노드라는 것을 포인터로 연결한 자료구조    
  *  *리스트 특징 
  *   1. 인덱스가 없으므로 값에 접근하려면 Head 포인터로부터 순서대로 접근해야 함, => 값에 접근하는 속도 느림 
  *   2. 포인터로 연결되어 있어 데이터를 삽입하거나 삭제하는 연산 속도가 빠름 
  *   3. ㅅ너언할 때 크기를 별도로 지정하지 않아도 된다. - > 리스트의 크기는 가변적 
  *   4. 포인터를 저장할 공간이 필요하므로 배열보다 구조가 복잡하다. 
  * 
  * */
	
	/** EX01. 숫자의 합 구하기 
	 *  시간제한 1초
	 *  
	 * N개의 숫자가 공백없이 써져있고, 이 숫자를 모두 합해 출력하는 프로그램 작성 
	 * 1번째 줄에 숫자의 개수  N, 2번ㅉ 줄에 숫자 N개가 공백없이 주어진다. 
	 * 
	 * */
	
	public static void main(String[] args) {
		System.out.println("숫자의 개수");
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		System.out.println("숫자 입력");
		String target = sc.next();
		
		int result =numsum(N, target);
		System.out.println(result);
	}
	
	private static int numsum(int N, String target) { 
		int result = 0;
		String[] sc = target.split("");
		for(int i = 0; i < N  ; i++) {
			result += Integer.parseInt(sc[i]);
		}
		
		return result;
	}
	
}
