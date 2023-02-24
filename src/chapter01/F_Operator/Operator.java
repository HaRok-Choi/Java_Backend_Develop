package chapter01.F_Operator;

// 연산자
// 산술연산자, 대입연산자, 관계연산자, 논리연산자, 삼항연산자
public class Operator {

	public static void main(String[] args) {
//		산술연산자(All 좌항 기준)
		
//		덧셈연산자 : +
		int addResult = 8 + 3;
		System.out.println(addResult);
		
//		뺄셈 연산자 : -
		int minusResult = 8 - 3;
		System.out.println(minusResult);
		
//		곱셈 연산자 : *
		int multiResult = 8 * 3;
		System.out.println(multiResult);
		
//		니눗셈 연산자 : /
//		나눈 값을 반환
		int remainderResult = 8 / 3;
		float float1 = 2.6666F;
		int number1 = (int)float1;
		
		System.out.println(number1);
		System.out.println(remainderResult);
		
		double remainderResult2 = 8.0 / 3.0;
		System.out.println(remainderResult2);
		
//		나머지 연산자 : %
//		나눈 나머지를 반환
		int remainderResult3 = 8 % 3;
		System.out.println(remainderResult3);
		
//		정수와 정수를 연산하면 정수가 반환됨
//		실수와 정수를 연산하면 실수가 반환됨
//		실수와 실수를 연산하면 실수가 반환됨
		
//		증감연산자: '변수' 자신을 1 증가 혹은 감소
		
//		증가연산자: ++
//		연산자의 좌항 or 우항의 값을 1증가 시킴
		int integer1 = 10;
		++integer1;
		System.out.println(integer1);
		integer1++;
		System.out.println(integer1);
		
		integer1 = 0;
		System.out.println(integer1);
		System.out.println(++integer1);
		
		System.out.println(integer1);
		System.out.println(integer1++);
		
		System.out.println(integer1);
		
		
		
		
		
		
		
	}

}
