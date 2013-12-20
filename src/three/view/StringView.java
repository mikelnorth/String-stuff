package three.view;

import javax.swing.JOptionPane;

public class StringView
{

	public void displayError()
	{
		int test;
		String temp;

		JOptionPane.showMessageDialog(null, "Lets's watch the program crash!");
		temp = JOptionPane.showInputDialog("type your favorite number!");
		test = Integer.parseInt(temp);
		JOptionPane.showMessageDialog(null, "Your favorite number is " + test);
	}

	public String getResponse()
	{

		String response = null;
		JOptionPane.showMessageDialog(null, "Say something funny");
		response = JOptionPane.showInputDialog("say the funny thing now!!");
		return response;
	}

	public void showPassedValue(String currentValue)
	{
		JOptionPane.showMessageDialog(null, currentValue
				+ " is supposed to be funny...");
	}

	public void moreInteractive(String first, String second)
	{
		JOptionPane.showMessageDialog(null, "Hey " + first + "\n" + "says: "
				+ "\n" + second);
	}

	public void testStringMethods()
	{
		testSubString(7);
		testConCat("race car");
		testReplace("you cant see me");
	}

	
	{
		// TODO Auto-generated method stub
		
	}

	private void testSubString(int startPosition)
	{
		String testString = "superdeduper";
		JOptionPane.showMessageDialog(null, "The substring method test!");
		JOptionPane.showMessageDialog(null, "We are going tyo go from the"
				+ startPosition + "th letter in the test string");
		JOptionPane.showMessageDialog(null, "The test string is : " + "\n"
				+ testString);
		JOptionPane.showMessageDialog(null,
				"The testString.substring(7) call gives us:" + "\n"
						+ testString.substring(startPosition));
	}

	private void testConCat(String addedString)
	{
		String testString = "race car";
		JOptionPane.showMessageDialog(null, "ConCat method test");
		JOptionPane.showMessageDialog(null, "Lets add " + addedString
				+ " to the string");
		JOptionPane.showMessageDialog(null, "the test string is: " + "\n"
				+ testString);
		JOptionPane.showMessageDialog(null,
				"The testString.concat(addedString) call gives us: " + "\n"
						+ testString.concat(addedString));
	}

	private void testReplace(char oldText, char newText)
	{
		String testString = "You cant see me";
		JOptionPane.showMessageDialog(null, "the reaplcement test");
		JOptionPane.showMessageDialog(null, " lets replace " + oldText + " with " + newText);
		JOptionPane.showMessageDialog(null, " the test string is: " + "\n" + testString);
		JOptionPane.showMessageDialog(null, "the testString.replace(char oldText char newText) gives us: " + "\n" + testString.replace(oldText , newText))
	}
}
