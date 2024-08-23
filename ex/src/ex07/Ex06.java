package ex07;
import java.util.*;

public class Ex06 {

	
	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		System.out.println("** 포인트 관리 프로그램입니다 **");
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.print("이름과 포인트 입력>>");
			String name = scanner.next();
			if(name.equals("exit")) //프로그램 종료
				break;
			int point = scanner.nextInt();
			Integer n = map.get(name);
			if(n != null) {
				point += n; // 포인트 점수 누적
			}
			map.put(name, point);
			
			Set<String> keys = map.keySet();
			Iterator<String> it = keys.iterator();
			while(it.hasNext()) {
				name = it.next();
				point = map.get(name);
				System.out.print("("+name+","+point+")");			
			}
			System.out.println();
			
		}
		System.out.println("프로그램을 종료합니다...");		
		scanner.close();
	}
}

