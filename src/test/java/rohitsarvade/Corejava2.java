package rohitsarvade;

import java.util.ArrayList;

public class Corejava2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] array3= {1,2,3,4,5,6,7,8,9,10,11};
		
		for(int o=0; o< array3.length;o++)
		{
			if(array3[o] % 2==0)
			{
				System.out.println(array3[o] + " "+"is multiple 0f 2");
				break;
				
			}
			else {
				System.out.println("no. is not divisal by 2");
			}
			
		}
		
		//array List
		
		ArrayList<String> a=new ArrayList<String>();
		a.add("rohit");
		a.add("sarvade");
		a.add("is");
		a.add("best");
		System.out.println(a.get(0));
		
		//if we want to check if arrayList contains any value then use 'contains' method
		System.out.println(a.contains("rohit"));
		

	}

}
