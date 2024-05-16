package Time_Completiy;
import java.lang.System.Logger;

public class Time_Compleity01 {

	/** @author Faust
	 *  @Date : 2024/05/16
	 * 	Time_compleity = �ð� ���⵵
	 *  
	 *  1. �ð� ���⵵��? �־��� ������ �ذ��ϱ� ���� ���� Ƚ��
	 *      = ����ð��� 1�� ���� ������ 1���� �ð����� �����Ͽ� ����
	 *  	�ð� ���⵵�� ���� ���� 3���� 
	 *  	1). ��-���ް�( ��(n) ) : Best Case ����Ƚ�� ǥ���
	 *      2). ��-��Ÿ( ��(n)) : Average Case ���� Ƚ�� ǥ��� [���� ����]
	 *      3). ��-�� ( O(n) ) : Worst Case ���� Ƚ�� ǥ�� 
	 * */
	public static void main(String[] args) {
		//ex1. 0~99 ������ ������ �� ��� �ڵ� 
		int targetNum = (int)(Math.random() * 100) ;
		System.out.println(targetNum);
		for(int i =0; i<100; i++) {
			if(i == targetNum) {
				System.out.println(i);
				break;
			}
		}
		/**
		 *  �ش� �ڵ��� �ð� ���⵵�� ���ǿ� ���� ǥ���ϸ� 
		 *  1. ��(n) = 1
		 *  2. ��(n) = N/2
		 *  3. O(n) = N ���̴�. 
		 *  
		 *  ��,, ������ �� ���� ������ �ʴ´�. ���������� �����غ��ڸ�
		 *  ��-���ް� = targetNum�� 0�� ��쿡�� 1���� ���ุ�� �ʿ��ϴ�
		 *  ��-��Ÿ = targetNum�� ������ 1~100�����̴�, �̸� Averageȭ �ϸ� 50�̴ϱ�,,,?
		 *  ��-�� = targetNum�� 100�̸�, �� 100���� ������ �ؾ��ϱ� �����̶�� �����Ѵ�.
		 * */
		
	}
	
}
