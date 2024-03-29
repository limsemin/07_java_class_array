package step7_01.classArray;

import java.io.ObjectOutputStream.PutField;
import java.util.HashMap;

/*

# HashMap

- HashMap은 K(Key)에 V(Value)를 할당하는 방식으로 데이터가 저장된다.

*/

public class ClassArrayEx20 {

	public static void main(String[] args) {

		HashMap<String, Integer>hmap = new HashMap<String, Integer>();
		//HashMap<String, Integer>hmap2 = new HashMap<String, Integer>();//new 뒤쪽의 generic은 생략가능하다.
		
		//put(key, value) : HashMap의key에 value를 할당한다.
		hmap.put("data1" , 1000);
		hmap.put("data2" , 2000);
		hmap.put("data3" , 3000);
		System.out.println(hmap);
		System.out.println("/////////////////////////");

		// get(key) : HashMap의 key에 할당된 value룰 얻어온다.
		System.out.println(hmap.get("data1"));
		System.out.println(hmap.get("data2"));
		System.out.println(hmap.get("data3"));
		System.out.println("/////////////////////////");
		
		// put()메서드는 존재하지 않는 key의 데이터를 넣어주면
		// 데이터가 입력되고 존재하지 않는 key에 넣어주면 
		// 기존의 데이터가 수정된다.
		hmap.put("data1" , 1111);
		hmap.put("data2" , 2222);
		hmap.put("data3" , 3333);
		hmap.put("data4" , 4444);
		hmap.put("data5" , 5555);
		System.out.println(hmap);
		System.out.println("/////////////////////////");
		
		// remove(key) : HashMap의 Key에 해당되는 값을 제거한다.
		hmap.remove("data2");
		hmap.remove("data3");
		System.out.println(hmap);
		System.out.println("/////////////////////////");
	
		//keySet() : HashMap의 key만 얻어온다
		System.out.println(hmap.keySet());
		
		for(String key : hmap.keySet()) {
			System.out.println(hmap.get(key));
			
		// clear() : HashMap의 모든 값을 제거한다
		hmap.clear();
		System.out.println(hmap);
			
			
		}
	
	
	}

}
