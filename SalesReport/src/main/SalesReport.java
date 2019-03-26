package main;


public class SalesReport {

	public static void main(String[] args) {

		double[][] sales = {
				{1540.0, 2010.0, 2450.0, 1845.0}, // Region 1
				{1130.0, 1168.0, 1847.0, 1491.0}, // Region 2
				{1580.0, 2305.0, 2710.0, 1284.0}, // Region 3
				{1105.0, 4102.0, 2391.0, 1576.0} // Region 4
		};
		
		
		System.out.println("The Sales Report Application\n");
		
		System.out.println("Region\tQ1 \t\tQ2 \t\tQ3 \t\tQ4");
		
		// Sales by quarter for reach region.
		for (int i = 0; i < sales.length; i++)
		{
			for (int j = 0; j < sales[i].length; j++)
			{
				System.out.print((i + 1 ) + "\t$" + sales[i][j]);
			}
			System.out.println();
		}
		
		// Sales by region.
		System.out.println("\nSales by region: ");
		
		for (int i = 0; i < sales.length; i++)
		{
			double regionSales = 0;
			
			for (int j = 0; j < sales[i].length; j++)
			{
				regionSales += sales[i][j];
			}
			
			System.out.println("Region " + (i + 1) + ": $" + regionSales);
			regionSales = 0;
		}
		
		// Sales by quarter.
		System.out.println("\nSales by quarter: ");
		
		for (int i = 0; i < sales.length; i++)
		{
			double quarterlySales = 0;
			
			for (int j = 0; j < sales[i].length; j++)
			{
				quarterlySales += sales[j][i];
			}
			
			System.out.println("Q" + (i + 1) + ": $" + quarterlySales);
			quarterlySales = 0;
		}
		
		// Total sales.
		System.out.println("\nTotal Sales: ");
		
		double totalSales = 0;
		
		for (int i = 0; i < sales.length; i++)
		{
			for (int j = 0; j < sales[i].length; j++)
			{
				totalSales += sales[i][j];
			}
		}
		
		System.out.println("Total sales: $" + totalSales);
	}

}
