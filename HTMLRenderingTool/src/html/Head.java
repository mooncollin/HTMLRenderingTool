package html;

/**
 * This class represents a head element with extra functionality.
 * @author colli
 *
 */
public class Head extends CompoundElement
{
	/**
	 * An element representing a title tag.
	 */
	private Element title;
	
	/**
	 * Constructor. Creates a Head with the given attributes.
	 * @param attributes key-value attributes
	 */
	public Head()
	{
		super("head");
		title = new Element("title");
		addElement(title);
	}
	
	/**
	 * Gets the title element.
	 * @return title element
	 */
	public Element getTitle()
	{
		return title;
	}
	
	/**
	 * Adds a script tag into the head with the given source.
	 * @param src the source path of the script
	 */
	public void addScript(String src)
	{
		Element script = new Element("script");
		script.setAttribute("src", src);
		addElement(script);
	}
	
	/**
	 * Adds a stylesheet into the head with the given source.
	 * @param sheet the source path of the stylesheet
	 */
	public void addStylesheet(String sheet)
	{
		Element link = new Element("link");
		link.setAttribute("rel", "stylesheet");
		link.setAttribute("type", "text/css");
		link.setAttribute("href", sheet);
		addElement(link);
	}
}
