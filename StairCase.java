
public class StairCase {
	private int numWays(int n)
	{
		int[] ways = new int[n+1];
		ways[0] = ways[1] = 1;
		
		for(int i = 2; i <= n; i++) {
			ways[i] = ways[i-1] + ways[i-2];
		}
		
		return ways[n];
	}
	
	public static void main(String[] args) {
		StairCase stc = new StairCase();
		int ans = stc.numWays(6);
		System.out.println("No. if ways to reach: " + ans);
	}
}
