interface student
{
	void stresullt();

}
interface sports
{       
	void spresult();
}
class result implements student,sports{
	public void spresult()
        {
	String hundred="First";
	String twohundred="Second";
	String fivehundred="First";
	String relay="Second";
	System.out.println("Sports Result");
        System.out.println("Hundred Meter:"+hundred);
	System.out.println("Two Hundred Meter:"+twohundred);
        System.out.println("Five Hundred Meter:"+fivehundred);
        System.out.println("Relay:"+relay);
	}
	public void stresullt()
	{
	int physics=30;
	int chemistry=40;
	int maths=45;
	int english=50;
	int computer=50;
        System.out.println("Marks");
        System.out.println("Physics:"+physics);
        System.out.println("Chemistry:"+chemistry);
        System.out.println("Mathematics:"+maths);
        System.out.println("English:"+english);
        System.out.println("Computer:"+computer);
	}
	public static void main(String[] args)
	{
		result r = new result();
		r.stresullt();
		r.spresult();
	
	}

}