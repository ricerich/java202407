package ex04;

public class Phone 
{
	//1.멤버변수
	private String tel;
	private String name;
	
	//2.생성자
	public Phone(String tel, String name) {
		this.tel = tel;
		this.name = name;
	}
	
	//3.메소드//필요하면 만드는데, 웬만하면 있어야 한다.
	public String getName(){
		return name;
	}
	
	public String getTel() {
		return tel;
	}
	
	
	

}
