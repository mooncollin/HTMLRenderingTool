package tags;

import html.CompoundElement;
import html.Element;

/**
 * This class represents a head element with extra functionality.
 * @author colli
 *
 */
public class Head extends CompoundElement
{	
	/**
	 * Constructor. Creates a Head with the given attributes.
	 * @param attributes key-value attributes
	 */
	public Head()
	{
		super("head");
		addElement(new Element("title"));
		addElement(new Meta().setAttribute("charset", "UTF-8"));
	}
	
	/**
	 * Adds a script tag into the head with the given source.
	 * @param src the source path of the script
	 */
	public void addScript(String src)
	{
		var script = new Script();
		script.setSrc(src);
		addElement(script);
	}
	
	/**
	 * Adds a stylesheet into the head with the given source.
	 * @param sheet the source path of the stylesheet
	 */
	public void addStylesheet(String sheet)
	{
		var link = new Link();
		link.setRel("stylesheet");
		link.setType("text/css");
		link.setHref(sheet);
		addElement(link);
	}
}
