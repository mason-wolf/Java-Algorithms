public class Main {

	public static void main(String[] args) {

		int[] numberArray = new int[] {1, 2, 4, 5, 6};
		int missingNumber = findMissingNumber(numberArray, 5);
    
		System.out.println(missingNumber);
 
	}

	static int findMissingNumber(int[] numberArray, int count)
	{

		int totalMissing = (count + 1) * (count + 2) / 2;
    
		for (int i = 0; i < count; i++)
		{
			totalMissing -= numberArray[i];
		}

		return totalMissing;
	}
}
