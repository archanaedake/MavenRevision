package String;

public class Reverse {
	public static void main(String[] args) {
		String a ="Archana";
		String rev = "";
		for(int i=a.length()-1; i>=0; i--)
		{
			rev=rev+a.charAt(i);
		}
		System.out.println(a);
		System.out.println(rev);
	}
}
	


