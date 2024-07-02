
// QR Generator 
// first you have to import QRGenerator jar in projects
class Test 
{
	public static void main(String ar[])
	{
		String fb="www.facebook.com/Pollob.c.roy";
		
		ByteArrayOutputStream out=QRCode.from(fb).to(ImageType.JPG).stream();
		
		File f=new File("e:\\fb\\myfb");
		FileOutputStream fos=new FileOutputStream(f);
		
		fos.write(out.toByteArray());
		fos.flush();
	}
}
