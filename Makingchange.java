class Makingchange
	{
  static final int INF = 100000;

  public static int min(int x,int y) {
    if(x < y)
      return x;
    return y;
  }
  public static int coinChange(int d[], int n, int k) {
    int[] M = new int[n+1];
    M[0] = 0;
    for(int j=1; j<=n; j++) {
      int minimum = INF;

      for(int i=1; i<=k; i++) {
        if(j >= d[i]) {
          minimum = min(minimum, 1+M[j-d[i]]);
        }
      }
      M[j] = minimum;
    }
    return M[n];
  }

  public static void main(String[] args) {
  int d[] = {0, 1, 2, 3};
  System.out.println(coinChange(d, 5, 3)); 
  }
}