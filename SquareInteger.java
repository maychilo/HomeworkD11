package datastructure;

public class SquareInteger {

	public static void main(String[] args) {
		System.out.println(squares(3, 9));
		System.out.println(squares(17, 24));

	}

	public static int squares(int a, int b) {
		int count = 0;
		for (int i = (int)Math.sqrt(a); i <= (int)Math.sqrt(b); ++i)
				if (Math.pow(i, 2)>=a && Math.pow(i, 2)<=b) {
					count++;
				}
		return count;
	}
}
