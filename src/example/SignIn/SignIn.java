package example.SignIn;

import java.util.Scanner;

// 로그인 프로세스 구현
public class SignIn {
	
//	입력
//	아이디, 비밀번호
	public static void main(String[] args) {
		final String ID = "qwer1234";
		final String PASSWORD = "qwer1234";
		
//		1. 사용자로부터 아이디와 패스워드 입력받음
		Scanner sc = new Scanner(System.in);
		System.out.println("아이디와 비밀번호를 입력하세요.");
		String userId = sc.nextLine();
		String userPassword = sc.nextLine();
		
//		2. 사용자가 모두 (아이디와 비밀번호) 입력했는지 검증
//		userId, userPassword 변수가 비었는지 확인
//		문자열에서 값이 비었는지 확인하는 기능 (메서드)
//		string.isEmpty(): 비었으면 true, 아니면 false, 공백도 입력 했다고 생각함.
		if (userId.isEmpty() || userPassword.isEmpty()) {
			System.out.println("모두 입력하세요.");
			return;	// 그냥 스레드 자체를 종료시킬려면 return 치면 됨
		}
		
//		3. 사용자 입력값과 저장된 값이 같은지 검증 -> 검증한다고 하면 if 걸어야 됨
//		string.equals(비교대상): 같으면 true, 아니면 false
		if (!(userId.equals(ID) && userPassword.equals(PASSWORD))) {
			System.out.println("로그인 정보가 일치하지 않습니다.");
			return;
		}
		System.out.println("성공");	// '성공'을 밖으로 빼는 것이 프로세스상 맞다.
		
		
	}
	
//	결과
//	성공, 실패 (모두 입력하지 않았을 때, 정보가 일치하지 않을 때)
	
	
	
}
