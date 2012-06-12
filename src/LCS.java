public class LCS {
	private String str1;
	private String str2;
	private int size1;
	private int size2;

	public LCS(String str1, String str2) {
		super();
		this.str1 = str1;
		this.str2 = str2;
		size1 = str1.length();
		size2 = str2.length();
	}

	public int BruteForce(int n, int m) {
		if (m == 0)
			return 0;
		else if (n == 0)
			return 0;
		else if (str1.charAt(n) == str2.charAt(m))
			return BruteForce(n - 1, m - 1) + 1;
		else
			return Math.max(BruteForce(n, m - 1), BruteForce(n - 1, m));
	}

	public void Memorized() {

	}

	public void BruteForce() {
		// TODO Auto-generated method stub
		System.out.println(BruteForce(str1.length() - 1, str2.length() - 1));
	}
}
