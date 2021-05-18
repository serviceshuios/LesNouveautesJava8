package metier;

public class Fibonacci {

	static int[] suite = {1,2,3,5,8,13,21,34,55};
	static int i= 0;
	public static int suivante() {
		return suite[i++];
	}
}
