package util;

import java.util.Objects;

import tags.Body;
import tags.Head;
import tags.Html;

/**
 * A Template represents a whole HTML file. It has the two main
 * componenets of an HTML file, which is the head and body.
 * @author colli
 *
 */
public class Template
{
	/**
	 * The head component of the template.
	 */
	private Head head;
	
	/**
	 * The body component of the template. 
	 */
	private Body body;
	
	private Html html;
	
	/**
	 * Constructor. Creates an empty head and body
	 * component.
	 */
	public Template()
	{
		html = new Html();
		head = new Head();
		body = new Body();
		
		reAddHeadBody();
	}
	
	/**
	 * Gets the head component.
	 * @return head component
	 */
	public Head getHead()
	{
		return head;
	}
	
	/**
	 * Gets the body component.
	 * @return body component.
	 */
	public Body getBody()
	{
		return body;
	}
	
	public Html getHtmlTag()
	{
		return html;
	}
	
	public void setHead(Head head)
	{
		this.head = Objects.requireNonNull(head);
		reAddHeadBody();
	}
	
	public void setBody(Body body)
	{
		this.body = Objects.requireNonNull(body);
		reAddHeadBody();
	}
	
	/**
	 * Returns a string representation of the whole template.
	 * This will include the opening html tag, as well as
	 * information in the head and body components.
	 * @return html of the template
	 */
	public String getHtml()
	{
//		return String.format("<!DOCTYPE HTML>"
//				+ "<html>"
//				+ "%s"
//				+ "%s"
//				+ "</html>", head, body);
		
		return String.format("<!DOCTYPE HTML>\n%s", html);
	}
	
	/**
	 * Returns the html of this template
	 * @return html of the template
	 */
	@Override
	public String toString()
	{
		return getHtml();
	}
	
	private void reAddHeadBody()
	{
		html.clearAllElements();
		html.addElements(head, body);
	}
}
