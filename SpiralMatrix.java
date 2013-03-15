// WAP to print a matrix of mxn integers in spiral form?

  // layer by layer
	// 1. print top row
	// 2. print right most row
	// 3. print bottom row
	// 4. print the left most row
	// iterate the next layer with m-2, and n-2 as new row and column lengths, and k+1 as next layer
	// printSpiralMatrix (matrix, m-2, n-2, k+1)
	// base condition is very important - if m==1, and if n==1
	
	public void printSpiralMatrix (int[][] matrix, int m, int n, int k)
	{
		
		if (m == 1)
		{
			for (int i=0; i < n; i++)
			{
				System.out.println(matrix[k][k+i]);
			}
		}
		
		if (n == 1)
		{
			for (int i=0; i < m; i++)
			{
				System.out.println(matrix[k+i][k]);
			}
		}
		
		// n == number of columns
		// m == number of rows
		
		// print top left
		for (int i=0; i < n-1; i++)
		{
			System.out.println(matrix[k][k+i]);
		}
		
		// print top right to down
		for (int i=0; i < m-1; i++)
		{
			System.out.println(matrix[k+i][k+n-1]);
		}
		
		// print bottom row
		for (int i = 0; i < n-1; i++)
		{
			System.out.println(matrix[k+m-1][k+n-1-i]);
		}
		
		for (int i = 0; i < m-1; i++)
		{
			System.out.println(matrix[k+m-1-i][k]);
		}
		
		// print next layer
		printSpiralMatrix(matrix, m-2, n-2, k+1);		
	}
