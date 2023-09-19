package a100_java_getset_db;

import java.util.Scanner;

public class S21212_GetSetDb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
			System.out.println("============================");
			System.out.println("**********수행평가 조회 및 등록(수정)**********");
			System.out.println("============================");
			System.out.println("1.등록된 전체 학생의 점수를 조회합니다(등록순)");
			System.out.println("2.등록된 전체 학생의 점수를 조회합니다(석차순)");
			System.out.println("3.등록된 학생을 선택하여 조회합니다.");
			System.out.println("4.학생의 점수를 입력합니다");
			System.out.println("5.등록된 점수의 석차를 재 설정합니다");
			System.out.println("6.등록된 학생을 선택하여 삭제합니다.");
			System.out.println("0.작업을 종료합니다.");
			System.out.println("-----------------------------------------------");
			System.out.println("작업 번호를 선택하세요?");
			int df = sc.nextInt();
			while(true) {
			if(df ==1) {
				S21212_GetSetDb_inquiry.main(args);
				break;
			}else if(df ==2) {
				S21212_GetSetDb_inquiryRank.main(args);
				break;
			}else if(df ==3) {
				S21212_GetSetDb_inquiryChoice.main(args);
				break;
			}else if(df ==4) {
				S21212_GetSetDb_insert.main(args);
				break;
			}else if(df == 5) {
				S21212_GetSetDb_RankUpdate.main(args);
				break;
			}else if(df == 6) {
				S21212_GetSetDb_DeleteChoice.main(args);
				break;
			}else if(df == 0) {
				System.out.println("시스템을 종료합니다.");
				break;
			}
		}
	}

}
