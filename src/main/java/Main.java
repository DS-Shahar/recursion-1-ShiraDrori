class Main {
	
	
	public static int a (int n) {
		if (n==1) {
			return 1;
		}
		return n+a(n-1);
	}
	
	public static int b (int n) {
		if (n<2) {
			return 1;
		}
		return n*b(n-1);
	}
	
	public static int c(int n) {
	    if (n <= 1) 
	    	return 1; 
	    if (n % 2 == 1)
	    	return n *c(n - 2); 
	    return c(n - 1);
	}
	
	public static int d (int n) {
		if (n<10)
			return 1;
		return d(n/10)+1; //מחלקים ב10 כדי להוריד את הספרה האחרונה ומוסיפים אחד כדי לספור את מה שהורדנו

	}
	
	public static int e (int a, int b) {
		if (a==b) {
			return 1;
		}
	    if (a == 0 || b == 0) {
	    	return 0;
	    }
		if (a>b) {
			return e(a-b, b)+1;
		}
		else {
			return 0;
		}	
	}
	
	public static int f (int a, int b) {
		if (b==0)
			return 0;
		if (a<b)
			return a;
		
		return f(a-b, b);
	}
	
	public static boolean g (int x, int y) {
		if (x==y)
			return true;
		if (x<y)
			return false;
		if (x==0) 
			return true;
		
		return g(x-y,y);
		
		
	}
	
	public static boolean h (int n) {
		int x = 2;
		if (n%x == 0)
			return true;
		if (x<10)
			return h(n/(x+1));
		return false;
	}
	


	public static void main(String[] args) {

		System.out.println(h(7));
	}

}
