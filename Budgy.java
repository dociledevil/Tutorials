package Chapter4;
class Budgie
{
	public static void main(String[] args) {
		
		Budgie b1=new Budgie();
		Budgie b2=new Budgie();
		Budgie b3=b1;

		if(b1.equals(b3))
			System.out.print("b1 is equal to b3");
		String s1="Bob";
		String s2="Bob";
		String s3="bob";

		if(s1==s3)
			System.out.println("s1==s3");
		if(s1.equals(s2))
			System.out.println("s1.equals(s2)");
		if(s1==s2)
			System.out.println("s1==s2");


	}
}