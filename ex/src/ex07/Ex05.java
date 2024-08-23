package ex07;
import java.util.*;

public class Ex05 {
	public static void main(String[] args) {
		HashMap<String, Integer> nations = new HashMap<String, Integer>();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("나라 이름과 인구를 5개 입력하세요.(예: Korea 5000)");
		for(int i=0; i<5; i++) {
			System.out.print("나라 이름, 인구 >> ");		
			String nation = scanner.next();
			int population = scanner.nextInt();
			nations.put(nation, population);
		}
		
		int max = 0; // 제일 많은 인구
		String max_country=""; // 제일 많은 인구의 나라
		Set<String> names = nations.keySet();
		Iterator<String> it = names.iterator();
		while(it.hasNext()) {
			String name = it.next(); // 키. 나라 이름
			int n = nations.get(name); // 인구
			if(max < n) {
				max = n;
				max_country = name;
			}
		}
		String str1 = max_country + "," + max;
		System.out.print("제일 인구가 많은 나라는 (" +str1 + ")");
		
		scanner.close();
	}

}
