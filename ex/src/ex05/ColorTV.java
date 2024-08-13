package ex05;

public class ColorTV extends TV {

	private int color;
	
	public ColorTV(int size, int color) {
		super(size); // TV(int size) 생성자를 호출하겠다는 의미
		this.color = color;
	}

	public void printProperty() {
		System.out.println(getSize()+"인치 "+color+" 컬러");
		
	}

}
