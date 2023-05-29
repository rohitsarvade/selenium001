package rohitsarvade;

public class Corejava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int d= 6;
		String l="fsfd";
		char letter='r';
		double po=9.34;
		boolean ho=true;
		float ui=67;
		System.out.println(d);
		System.out.println(l+" "+"rohit");
		System.out.println(letter);
		System.out.println(po);
		System.out.println(ho);
		System.out.println(ui);
		
		//arrays
		int[] array1= new int[5];
		array1[0]=1;
		array1[1]=3;
		array1[2]=5;
		array1[3]=7;
		array1[4]=9;
		
		//another way
		
		int[] array2= {0,4,6,8,22};
		
		System.out.println(array1[3]);
		
		System.out.println(array2[4]);
		
		//for loop
		
		for(int i=0; i<array1.length; i++)
		{
			System.out.println(array1[i]+" ");
			
		}
		for(int j=0; j<array2.length;j++)
		{
			
			System.out.println(array2[j]);
			
		}
		
		//array of name
		
		String[] sname = {"ajay", "vijay","karan","rohit"};
		
		for (int t=0; t<sname.length; t++)
		{
			System.out.println(sname[t]);
			
		}
		
		
		
	}

}
