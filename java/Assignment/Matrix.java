package Assignment;

import com.example.day1.Read;

public class Matrix {
	
	int m1[][];
	
	public Matrix()
	{
		m1=new int[3][3];
	}
	
	public Matrix(int row,int column)
	{
		m1=new int[row][column];
	}

	public Matrix(Matrix a)
	{
		this.m1=a.m1;
	}
	
	
	public void readValues()
	
{
		System.out.println("Enter the values : ");
		for(int i=0;i<m1.length;i++)
		{
			for(int j=0;j<m1[0].length;j++)
			{
				m1[i][j]=Read.sc.nextInt();
			}
	}
}
	
	
		public void display()
		{
			for(int i=0;i<m1.length;i++)
			{
				for(int j=0;j<m1[0].length;j++)
				{
					System.out.print(m1[i][j]+" ");
					
				}
				System.out.println();
		}
		}
		
			public Matrix add(Matrix m)
			{
				Matrix temp=new Matrix(this.m1.length,this.m1[0].length);
				
				for(int i=0;i<m1.length;i++)
				{
					for(int j=0;j<m1[0].length;j++)
					{
						temp.m1[i][j]=this.m1[i][j]+m.m1[i][j];
						
					}
					
					
				
			}
				return temp;
}
}
