interface A
{
	int roll=101; // constant
	void Dispa();// abstract
}

interface B
{
	void Dispb();
}

class C implements A,B
{
	public void Dispa() // here public keyword is required & essensial
	{ 
	// Here Define class A Method

		System.out.println("roll number :"+roll);

	}

	public void Dispb()
	{
		System.out.println("Method from B interface");
	} 
}

class Test
{
	public static void main(String[] args) {
		
		C obj=new C();
		obj.Dispa();
		obj.Dispb();
	}
}