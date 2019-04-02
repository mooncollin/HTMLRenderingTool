package misc;

import static org.junit.Assert.*;

import java.util.Map;
import java.util.TreeMap;

import org.junit.Test;

import forms.Form;
import forms.TextField;

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
}
