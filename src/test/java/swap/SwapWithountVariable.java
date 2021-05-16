package swap;

public class SwapWithountVariable {

	public static void main(String[] args) {
		String s ="KusumaShreetvuhuhunjhb";
		String s1 ="Nveenniughuygu";
		
		s= s.concat(s1);
		
		s1=s.substring(0, s.length()-s1.length());
		s=s.substring(s1.length());
		System.out.println(s);
		System.out.println(s1);

	}

}
