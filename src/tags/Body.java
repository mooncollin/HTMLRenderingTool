package tags;

import html.CompoundElement;

/**
 * This class represents a body element with extra functionality.
 * @author colli
 *
 */
public class Body extends CompoundElement
{	
	/**
	 * Constructor. Creates a Body with the given attributes.
	 * @param attributes key-value attributes
	 */
	public Body()
	{
		super("head");
	}
	
	/**
	 * Adds a script tag into the bottom of the body with the given source.
	 * @param src the source path of the script
	 */
	public void addScript(String src)
	{
		var script = new Script();
		script.setSrc(src);
		addEndElement(script);
	}
}
