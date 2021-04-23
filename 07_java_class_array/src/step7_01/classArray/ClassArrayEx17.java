package step7_01.classArray;

/*
 * 
 * 접근 제어자 : public , private + getter/setter
 * 
 * */
class ModifierTest {
	
	private int a;
	public int b;
	
	
	// private변수를 클래스 외부로 꺼내주는 메서드 getter
	int getA() {
		return this.a;
	}
	
	//private변수를 클래스 외부에서 수정하는 메서드 setter
	void setA(int a) {
		this.a = a;
	}
	
	
	
}

public class ClassArrayEx17 {

	public static void main(String[] args) {

ModifierTest obj =  new ModifierTest();
		
		// private 변수는 클래스 외부에서 접근 불가
		//obj.a = 1000;
		//System.out.println(obj.a);
		
		obj.b = 2000;
		System.out.println(obj.b);
		
		obj.setA(777);					//setter를 이용하여 private 변수에 값 대입
		System.out.println(obj.getA());	//setter를 이용하여 private 변수에 값을 꺼내오
	}

}
