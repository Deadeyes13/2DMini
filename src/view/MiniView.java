/**
 * The View Of the Project.
 */
package view;

/**
 * @author CJ Oman
 * @version 1.1 Added Documentation.
 * @date Jan 16, 2014 9:44:02 AM
 */
public class MiniView
{
	/**
	 * Lists the friend Names in the list.
	 * @param friendNames
	 */
	public void printStringInformation(String[][] friendNames)
	{
		System.out.println("foreach printing");
		for(String [] currentRow : friendNames)
		{
			for(String currentNumber : currentRow)
			{
				System.out.print(currentNumber + "\t");
			}
			System.out.println();
		}
		System.out.println("for printing");
		for(int row = 0; row < friendNames.length; row++)
		{
			for(int col = 0; col< friendNames[0].length; col++)
			{
				System.out.print(row + "," + col + ": " + friendNames[row][col] + "\t");
			}
			System.out.println();
		}
	}
	
	/**
	 * List the Family Ages in the list.
	 * @param myFamilyAges
	 */
	public void printIntInformation(int[][] myFamilyAges)
	{
		System.out.println("foreach printing");
		for(int [] currentRow : myFamilyAges)
		{
			for(int currentNumber : currentRow)
			{
				System.out.print(currentNumber + "\t");
			}
			System.out.println();
		}
		
		System.out.println("for printing");
		for(int row = 0; row < myFamilyAges.length; row++)
		{
			for(int col = 0; col< myFamilyAges[0].length; col++)
			{
				System.out.print(row + "," + col + ": " + myFamilyAges[row][col] + "\t");
			}
			System.out.println();
		}
	}
}
