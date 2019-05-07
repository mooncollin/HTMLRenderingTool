package misc;

import static org.junit.Assert.*;

import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import org.junit.Test;

import forms.Button;
import forms.Checkbox;
import forms.Email;
import forms.Form;
import forms.Input;
import forms.TextField;
import html.Element;

public class FormsTest
{
	@Test
	public void formInputNullTest()
	{
		Form f = new Form();
		TextField t = new TextField();
		t.setRequired(true);
		t.setName("testInput");
		f.addInput(t);
		Map<String, String[]> parameters = new TreeMap<String, String[]>();
		
		assertTrue(f.validate(parameters));
	}
	
	@Test
	public void elementIDSet()
	{
		Input e = new Email();
		e.setAttribute("id", "Hello!");
		e.setAttribute("tabindex", "4");
		e.setAttribute("woot", 10);
		assertEquals("Hello!", e.getID());
		assertEquals(4, e.getTabIndex());
		assertEquals("10", e.getAttribute("woot"));
		
		e.removeAttribute("woot");
		assertEquals(null, e.getAttribute("woot"));
		
		e.removeAttribute("id");
		assertEquals(null, e.getID());
		
		e.removeAttribute("tabindex");
		assertEquals(-1, e.getTabIndex());
		
		e.setRequired(true);
		assertTrue(e.getRequired());
		
		e.setAttribute("required", 4);
		System.out.println(e.getRequired());
	}
}
