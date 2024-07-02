// CSV= Comma Separated Value 
class Test 
{
	public static void main(String ar[])
	{
	String name="Pollob,Snato,Rabbi";
	String names[]=name.split(",");
	for(String n:names)
	{
		System.out.println(n);
	}
	}
}