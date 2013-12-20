package three.controller;

import three.view.StringView;


public class StringController
{
	private StringView myView;
	
	public StringController()
	{
		myView = new StringView();
	}
	
	public void start()
	{
//		myView.displayError();
//		String myResponse = myView.getResponse();
//		myView.showPassedValue(myResponse);
//		
//		myView.moreInteractive("Mikel North",  myResponse);
		myView.testStringMethods();
	}
}
