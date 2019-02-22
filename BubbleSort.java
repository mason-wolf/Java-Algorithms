

public class Main {

	public static void main(String[] args) {
		
		int[] numberArray = new int[] {2, 1, 1, 5, 6};
		bubbleSort(numberArray);
		
		for (int i = 0; i < numberArray.length; i++)
		{
			System.out.println(numberArray[i]);
		}
	}

	static void bubbleSort(int[] numberArray)
	{
		for (int i = 0; i < numberArray.length; i++)
		{
			for (int j = 0; j < numberArray.length - 1; j++)
			{
				if (numberArray[j] > numberArray[j + 1])
				{
					int temp = numberArray[j];
					numberArray[j] = numberArray[j + 1];
					numberArray[j + 1] = temp;
				}
			}
		}
	}
}
