package studio7;

public class Die {

	private double sides;
	
	public Die(double initSides) {
		sides = initSides;
	}
	
	public int Random() {
		return (int) (Math.random()*sides) + 1;
	}
	
	public static void main(String[] args) {
		Die d1 = new Die(6);
		System.out.println(d1.Random());
	}

}
