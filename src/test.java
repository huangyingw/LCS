public class test {
	public static void main(String[] args) {
		LCS lcs = new LCS("GAATTCAGTTA".toString(), "GGATCGA".toString());
		lcs.BruteForce();
	}
}
