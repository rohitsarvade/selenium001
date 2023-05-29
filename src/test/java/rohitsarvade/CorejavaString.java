package rohitsarvade;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class CorejavaString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//you can create string in 2 ways
		//1st = at literal level
		
		String s1= "string1";
		String s2= "string1";
		
		//here both objects i.e. 's1' & 's2' will point at same memory alloted 'string1'
		
		
		String s3= new String("String2");
		String s4= new String("String2");
		
		//here as we have used the 'new' keyword, it will create two separate memories
		
		String s5= "Rohit Sameer Sarvade";
		
		String[] splittedString = s5.split("Sameer");
		System.out.println(splittedString[0]);
		System.out.println(splittedString[1]);
//		System.out.println(splittedString[2]);
		
		//to trim the spaces use this method
		System.out.println(splittedString[1].trim());
		
		//to operate each character use this method
		for(int i=0;i<s5.length();i++)
		{
			System.out.println(s5.charAt(i));
			
		}
		
		//to print the characters in reverse manner use following
		for(int h=s5.length()-1;h>=0;h--)
		{
			System.out.println(s5.charAt(h));
			
		}
		
		
		

	}

}
