/**
 * Controller of the Project.
 */
package controller;

import view.MiniView;

/**
 * @author CJ Oman
 * @version 1.1 Added documentation.
 * @date Jan 16, 2014 9:40:59 AM
 */
public class MiniController
{
	private String [][] friendNames;
	private int [][] myFamilyAges;
	private MiniView consoleView;
	
	/**
	 * List what is in the Controller.
	 */
	public MiniController()
	{
		myFamilyAges = new int [3][3];
		friendNames = new String [4][4];
		consoleView = new MiniView();
	}
	
	/**
	 * Gets Family Ages.
	 * @return FamilyAges
	 */
	public int[][] getFamilyAges()
	{
		return myFamilyAges;
	}
	
	/**
	 * Gets Friend Names.
	 * @return friendNames
	 */
	public String[][] getFriendNames()
	{
		return friendNames;
	}
	
	/**
	 * Sets Family Ages.
	 * @param myFamilyAges
	 */
	public void setMyFamilyAges(int[][] myFamilyAges)
	{
		this.myFamilyAges = myFamilyAges;
	}
	
	/**
	 * Sets friend Names.
	 * @param friendNames
	 */
	public void setFriendNames(String[][] friendNames)
	{
		this.friendNames = friendNames;
	}
	
	/**
	 * Fills the ArrayList with ages.
	 */
	private void fillAges()
	{
		myFamilyAges[0][0] = 17;
		myFamilyAges[0][1] = 18;
		myFamilyAges[0][2] = 23;
		
		myFamilyAges[1][0] = 38;
		myFamilyAges[1][1] = 36;
		myFamilyAges[1][2] = 39;
		
		myFamilyAges[2][0] = 37;
		myFamilyAges[2][1] = 19;
		myFamilyAges[2][2] = 4;
		
	}
	
	/**
	 * Fills the ArrayList with names.
	 */
	private void fillNames()
	{
		friendNames[0][0] = "caleb";
		friendNames[0][1] = "Justen";
		friendNames[0][2] = "Anthony";
		friendNames[0][3] = "Dean";
		
		friendNames[1][0] = "Evan";
		friendNames[1][1] = "Mason";
		friendNames[1][2] = "Kyle";
		friendNames[1][3] = "Bryce";
		
		friendNames[2][0] = "Whitni";
		friendNames[2][1] = "Camilla";
		friendNames[2][2] = "Reagan";
		friendNames[2][3] = "Shalae";
		
		friendNames[3][0] = "Kiani";
		friendNames[3][1] = "Jaren";
		friendNames[3][2] = "Jason";
		friendNames[3][3] = "Jordan";
	}
	
	/**
	 * Starts the programs.
	 */
	public void start()
	{
		fillNames();
		fillAges();
		consoleView.printStringInformation(friendNames);
		consoleView.printIntInformation(myFamilyAges);
	}

}
