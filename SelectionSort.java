

public class Main {

	public static void main(String[] args) {

		int[] numberArray = new int[] {2, 1, 1, 5, 6};
		sort(numberArray);
		
		for (int i = 0; i < numberArray.length; i++)
		{
			System.out.println(numberArray[i]);
		}

		
	}

	static void sort(int[] numberArray)
	{
		int minIndex, temp;
		
		for (int i = 0; i < numberArray.length; i++)
		{
			minIndex = i;
			
			for (int j = i + 1; j < numberArray.length; j++)
			{
				if (numberArray[i] > numberArray[j])
				{
					minIndex = j;
				}
			}
			
			temp = numberArray[minIndex];
			numberArray[minIndex] = numberArray[i];
			numberArray[i] = temp;
		}
	}
}
