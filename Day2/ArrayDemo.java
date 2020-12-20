public class ArrayDemo
{
	public static void main(String[] args) {
		
		int num[] = new int[4];
		num[0]=8;
		num[1]=16;
		num[2]=24;
		num[3]=32;

		//int nums[] = num;

		System.out.println(num[2]);
		//System.out.println(nums[5]); //Index 5 out of bounds for length 4
		

		int nums[] = {2,4,6,8,10}; //1D Array
		for(int i:nums)
		{
			System.out.println(i);
		}//ForeachAll Loop -> Enhanced For Loop


		for(int i=0;i<4;i++)
		{
			System.out.println(i);
		}



		int a[] = {1,2,3,4};
		int b[] = {5,6,7,8};
		int c[] = {9,10,11,12};

		int d[][] = {
						{1,2,3,4},
						{5,6,7,8},
						{9,10,11,12}
					};//2D Arrays

		for(int i=0;i<3;i++)
		{
			for(int j=0;j<4;j++)
			{
				System.out.print(" "+d[i][j]);
			}
			System.out.println();
		}	


		for(int[] k: d)
		{
			for(int l:k)
			{
				System.out.print(l+" ");
			}
			System.out.println();
			
		} //Enhanced For loop Iteration in 2D Arrays



		int e[][] = {
						{1,2,3,4},
						{5,6,7,},
						{9,10,11,12,13}
					}; //Jagged Arrays where rows and elements in each row are not fixed



		for(int i=0;i<e.length;i++)
		{
			for(int j=0;j<e[i].length;j++)
			{
				System.out.print(" "+e[i][j]);
			}
			System.out.println();
		}	


	}
}