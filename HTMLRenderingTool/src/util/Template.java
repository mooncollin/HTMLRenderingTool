package util;

import html.Body;
import html.Head;

public class Template
{
	private Head head;
	private Body body;
	
	public Template()
	{
		head = new Head();
		body = new Body();
	}
	
	public Head getHead()
	{
		return head;
	}
	
	public Body getBody()
	{
		return body;
	}
	
	public String getHtml()
	{
		return String.format("<!DOCTYPE HTML>"
				+ "<html>"
				+ "%s"
				+ "%s"
				+ "</html>", head, body);
	}
	
	@Override
	public String toString()
	{
		return getHtml();
	}
}
