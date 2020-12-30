package day05;

/*
문제1. Prob5내에 leftPad 메쏘드를 작성하십시오. 
       leftPad 메쏘드의 속성은 다음과 같습니다.

1.	메소드 시그니처 : 
        public static String leftPad(String str, int size, char padChar)

2.	입력 문자열(str)의 길이가 입력받은 수(size)가 될 때까지 
        문자열의 좌측을 지정된 문자(padChar)로 채운 후 리턴한다.

3.	단, 입력 문자열(str)의 길이가 입력받은 수(size) 보다 
             큰 경우에는 원본 문자열(str)을 그대로 리턴한다.
             
실행 예) 
leftPad(“SDS”, 6, ‘#’)    ###SDS 
leftPad(“SDS”, 5, ‘$’)    $$SDS
leftPad(“SDS”, 2, ‘&’)    SDS
*/
public class Prob5_김지훈_12_29 {
	public static void main(String args[]) {

		System.out.println(Prob5_김지훈_12_29.leftPad("SDS", 6, '#'));
		System.out.println(Prob5_김지훈_12_29.leftPad("SDS", 5, '$'));
		System.out.println(Prob5_김지훈_12_29.leftPad("SDS", 2, '&'));

		int[] intArray = new int[] { 2, 6, 5, 4, 1 };

		int[] sortedArray = selectionSort(intArray);
		for (int i = 0; i < intArray.length; i++) {
			System.out.printf("%d ", sortedArray[i]);
		}
	}

	public static String leftPad(String str, int size, char padChar) {
		if (size <= str.length()) {
			return str;
		}
		int count = size - str.length();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < count; i++) {
			sb.append(padChar);
		}
		sb.append(str);
		return sb.toString();

	}

	public static int[] selectionSort(int[] intArray) {

		int min;
		int temp;
		for (int i = 0; i < intArray.length - 1; i++) {
			min = i;
			for (int j = i + 1; j < intArray.length; j++) {
				if (intArray[i] > intArray[j])
					min = j;
			}
			temp = intArray[min];
			intArray[min] = intArray[i];
			intArray[i] = temp;
		}
		return intArray;
	}
}