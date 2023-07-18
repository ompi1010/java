import java.util.*;
public class matrix
{
	public static void main(String[] args)
	{
		
		int row1, row2, col1, col2;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number of rows in first matrix");
		row1 = scan.nextInt();
		System.out.println("Enter the number of columns in first matrix");
		col1 = scan.nextInt();
		System.out.println("Enter the number of rows in second matrix");
		row2 = scan.nextInt();
		System.out.println("Enter the number of columns in second matrix");
		col2 = scan.nextInt();
		if(col1!=row2)
		{
		   System.out.println("matrix multiplication is not possible");
		   return;
		}
		else
		{
		int a[][] = new int[row1][col1];
		int b[][] = new int[row2][col2];
		int c[][]=new int[row1][col2];
		System.out.println("Enter the elements of first matrix:");
        for (int i=0;i<row1;i++) 
		{
        	for (int j=0;j<col1;j++) 
        	{
            	a[i][j] = scan.nextInt();
        	}
    	}
     	
        System.out.println("Enter the elements of second matrix:");
    	for (int i=0;i<row2;i++) 
    	{
            for (int j=0;j<col2;j++) 
        	{
        		b[i][j] = scan.nextInt();
        	}
    	}
    	System.out.println("matrix multiplication is :: ");
    	for(int i=0;i<row1;i++)
    	{
    	   for(int j=0;j<col2;j++)
    	   {
    	     c[i][j]=0;
    	     for(int k=0;k<col1;k++)
    	     {
    	        c[i][j]+=a[i][k]*b[k][j];
    	      }
    	      System.out.println(c[i][j]+" ");
    	  }
    	  System.out.println("");
    	  }
    	  }
    	  }
    	  }
