public class LCS {
	private String str1;
	private String str2;
	private int size1;
	private int size2;
	private int[][] L;

	public LCS(String str1, String str2) {
		super();
		this.str1 = str1;
		this.str2 = str2;
		size1 = str1.length();
		size2 = str2.length();
		L = new int[size1][size2];
		for (int i = 0; i < size1; i++) {
			for (int j = 0; j < size2; j++) {
				L[i][j] = 0;
			}
		}
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

	public int Memorized(int m, int n) {
		if (L[m][n] > 0)
			return L[m][n];
		if (n == 0) {
			L[m][0] = 0;
			return L[m][0];
		} else if (m == 0) {
			L[0][n] = 0;
			return L[0][n];
		}
		if (str1.charAt(m) == str2.charAt(n))
			L[m][n] = Memorized(m - 1, n - 1) + 1;
		else
			L[m][n] = Math.max(Memorized(m, n - 1), Memorized(m - 1, n));
		return L[m][n];
	}

	public void BruteForce() {
		// TODO Auto-generated method stub
		System.out.println(BruteForce(str1.length() - 1, str2.length() - 1));
	}

	public void Memorized() {
		// TODO Auto-generated method stub
		System.out.println(Memorized(str1.length() - 1, str2.length() - 1));
	}
}
