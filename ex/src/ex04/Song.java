package ex04;

public class Song {
	private String title;
	private String artist;
	private int year;
	private String country;
	
	public Song(){ }

	public Song(String title, String artist, int year, String country) {
		this.title = title;
		this.artist = artist;
		this.year = year;
		this.country = country;
	}
	
	public void show() {
		System.out.print(year+"년 ");
		System.out.print(country+" 국적의 ");
		System.out.print(title+"가 부른 ");
		System.out.println(title);
	}
	
	
	

}
