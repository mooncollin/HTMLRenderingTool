package misc;

import forms.Form;
import forms.Input;
import html.Element;

public class CurrentProblems
{
	public static void main(String[] args)
	{
		Form f = new Form();
		Element e = new Element("input");
		e.setAttribute("type", "text");
		Input test = f.parseInput(e);
		
		System.out.println(f);
		
		f.addInput(test);
		f.addInput(test);
		
		System.out.println(f);
		System.out.println(f.getInputs());
		
		f.removeInput(test);
		System.out.println(f);
		
		f.setMethod("POST");
		
		System.out.println(f);
		System.out.println(f.getInputs());
		
		f.clearAllElements();
		System.out.println(f);
		System.out.println(f.getInputs());
		
		Element hiddenInput = new Element("input");
		hiddenInput.setAttribute("type", "hidden");
		
		f.addElement(hiddenInput);
		System.out.println(f);
		System.out.println(f.getInputs());
		f.removeElement(0);
		
		System.out.println(f);
		System.out.println(f.getInputs());
	}
	
}
