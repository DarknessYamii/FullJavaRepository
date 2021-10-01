package jdbc_sql;

public class pqiese {

	public static void main(String[] args) {
		int n = 0;
		do {
			int r = (int) (Math.random()*(10-1));
			n += r;
			System.out.println(r);
			System.out.println(n);
		}while(n<100);

	}
	
}
