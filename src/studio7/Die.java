package studio7;

public class Die {
	
	private int n;
	
	public Die(int n) {
		this.n = n; 
	}
	
	public int roll() {
		return (int) Math.random()*n + 1;
	}
	
	public static void main(String[] args) {
		Die Die1 = new Die(6);
		System.out.print(Die1.roll());
	}

}
