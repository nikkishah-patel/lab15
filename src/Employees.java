
public class Employees {

	private String name;
	private String favoriteFood;
	private int age;
	public Employees(String name, String favoriteFood, int age) {
		
		this.name = name;
		this.favoriteFood = favoriteFood;
		this.age = age;		
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFavoriteFood() {
		return favoriteFood;
	}
	public void setFavoriteFood(String favoriteFood) {
		this.favoriteFood = favoriteFood;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public String toString() {
	return name + "," + age + "," + favoriteFood;
	
	}
}
