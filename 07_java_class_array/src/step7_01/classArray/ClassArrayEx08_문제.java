package step7_01.classArray;
import java.util.Scanner;

//class Subject{ 복습 반복
//	String name;
//	int score;
//}
//
//class Student{
//	Subject[] subjects;
//	String name;
//}
//
class subject5{
	String name;
	int score;
}

class Student5{
	Subject8[] subjects;
	String name;
}

public class ClassArrayEx08_문제 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		// # 학생 추가 삭제 컨트롤러
		//   => 컨트롤러를 완성해 아래 3개의 정보를 추가하시오.
		//   김철수 : 과목3개 수학 50 국어50 영어 60 
		//   이만수 : 과목2개 수학 20 국어 30 
		//   이영희 : 과목1개 수학 100
		
		Student8 [] stdList = new Student8[3];
		int stdCnt = 0;	// 학생 수
		
		while (true) {
				for (int i = 0; i < stdCnt; i++) {
					System.out.println("["+(i+1)+"]"+stdList[i].name+"학생>>>");
					if(stdList[i].subjects != null) {
						for (int j = 0; j< stdList[i].subjects.length; j++) {
							System.out.println("["+(j+1)+"]" + stdList[i].subjects[j].name + "과목= "+stdList[i].subjects[j].score+"점");
						}
					}
			
				}
			System.out.println("[1]학생 추가하기");		// 이름 입력받아 추가
			System.out.println("[2]과목 추가하기");		// 이름과 과목 입력받아 추가
			System.out.println("[3]성적 추가하기");		// 이름과 과목 그리고 성적 입력받아 추가
			System.out.println("[4]종료하기");
			int choice = scan.nextInt();			//검색
			
			if		(choice == 1) {
				System.out.print("학생추가: "); //1번을 선택했을때 학생을 추가할건지 ?
				String name = scan.next();
				System.out.println();
				
				stdList[stdCnt] = new Student8(); //리스트중 내가 기입한 이름을 추가 , 저장
				stdList[stdCnt].name = name;
				stdCnt++;
						
			}
			else if (choice == 2) {			//2번을 선택했을경우 과목추가
				for(int i = 0 ; i< stdCnt; i++) {
					System.out.println("[" + (i+1)+"]"+stdList[i].name);
				}							//과목 추가하기 전 어떤 이름을 불러올지 
				System.out.print("학생선택: ");	//이름을 선택
				int select = scan.nextInt();	
				select--;
				
				System.out.print("과목입력: ");	//과목 입력
				String subject = scan.next();
			
			if(stdList[select].subjects == null) {// 서브젝트라는 변수에 배열이 없다면 , 
				stdList[select].subjects = new Subject8[1]; // new subject8[1]이라는 이름의 배열을 만든다.
				stdList[select].subjects[0] = new Subject8(); //new subject8이라는 배열안에 new subject8()이라는 객체를 생성.
				stdList[select].subjects[0].name = subject;//배열안의 객체 생성 , 객체의 이름은 최종 = subject.
				}
			else {
				int size = stdList[select].subjects.length;  //subject의 배열의 길이를 size라는 변수에 지정한다.
				Subject8[]temp = stdList[select].subjects; // size라고 지정된 subject배열을 temp에 일시적으로 보낸다.
				stdList[select].subjects = new Subject8[size +1]; //subject배열에 temp로 지정한 배열size를 한개씩 추가해준다.
				
			for(int i = 0; i<size; i++) {
				stdList[select].subjects[i]= temp[i];
			}
			stdList[select].subjects[0] = new Subject8();
			stdList[select].subjects[0].name = subject;
			temp =null;
			}
			
			}
			else if (choice == 3) {
				for (int i = 0; i < stdCnt; i++) {
					System.out.println("["+(i+1)+"]" + stdList[i].name);
				}
				System.out.print("학생선택: ");
				int select = scan.nextInt();
				select--;
				if(stdList[select].subjects != null) {
					for (int i = 0; i < stdList[select].subjects.length; i++) {
						System.out.println("["+(i+1)+"]"+stdList[select].subjects[i].name);
					}
				}
				System.out.print("과목 선택: ");
				int num = scan.nextInt();
				num--;
				System.out.print("성적 입력: ");
				int score = scan.nextInt();
				
				stdList[select].subjects[num].score = score;
			}
			else if(choice ==4) {
				System.out.print("종료");
				break;
			}
			
		}


	}

}
