class Dmo 
{
	public static void main(String[] args) 
	{
		StringBuffer s1=new StringBuffer("Hello");
		StringBuffer s2=new StringBuffer("Hello");
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
	}
}
