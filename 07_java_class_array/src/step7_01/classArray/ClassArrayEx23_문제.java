package step7_01.classArray;

import java.util.ArrayList;
import java.util.Scanner;

/*
class StudentVO {
	String id;
	String pw;
}

class StudentManager {
	ArrayList<StudentVO> studentList = new ArrayList<StudentVO>();
}
*/
class studentVO{
	String id = "";
	String pw = "";
	
	void set_data(String id , String pw) {
		this.id = id ;
		this.pw = pw ;
		
	}
	void print_data() {
		System.out.println("이름: " + id + "비밀번호: " + pw);
	}
}


	class StudentManager{
		ArrayList<StudentVO1> studentList = new ArrayList<StudentVO1>();
	void add_student(StudentVO1 st) {
		studentList.add(st);
	}
	StudentVO1 remove_student(int index) {
		StudentVO1 del_st = studentList.get(index);
		studentList.remove(index);
		return del_st;
	}
}	

public class ClassArrayEx23_문제 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		//StudentManager manager = new StudentManager();
		
		while (true) {
			
			System.out.println("1.가입 2.탈퇴 3.정렬 4.출력 5.저장 6.로드 7.종료");
			int sel = scan.nextInt();
			
			if 		(sel == 1) {} 
			else if (sel == 2) {}
			else if (sel == 3) {}
			else if (sel == 4) {}
			else if (sel == 5) {}
			else if (sel == 6) {}
			else if (sel == 7) {}
			
		}

	}

}
