package html;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class CompoundElement extends Element
{
	private List<Element> elements;
	private List<Element> endElements;
	
	public CompoundElement(String tag)
	{
		this(tag, null);
	}
	
	public CompoundElement(String tag, Map<String, String> attributes)
	{
		super(tag, attributes);
		if(HTML.SELF_CLOSING_TAGS.contains(tag))
		{
			throw new IllegalArgumentException(String.format("<%s /> cannot be a compound element", tag));
		}
		elements = new LinkedList<Element>();
		endElements = new LinkedList<Element>();
	}
	
	public Element getElement(int index)
	{
		return elements.get(index);
	}
	
	public Element getEndElement(int index)
	{
		return endElements.get(index);
	}
	
	public List<Element> getElementsByAttribute(String attribute, String value)
	{
		if(attribute == null)
		{
			throw new NullPointerException();
		}
		return getElementsByAttribute(elements, attribute, value);
	}
	
	public List<Element> getEndElementsByAttribute(String attribute, String value)
	{
		if(attribute == null)
		{
			throw new NullPointerException();
		}
		return getElementsByAttribute(endElements, attribute, value);
	}
	
	public List<Element> getElementsByTag(String tag)
	{
		if(tag == null)
		{
			throw new NullPointerException();
		}
		return getElementsByTag(elements, tag);
	}
	
	public List<Element> getEndElementsByTag(String tag)
	{
		if(tag == null)
		{
			throw new NullPointerException();
		}
		return getElementsByTag(endElements, tag);
	}
	
	public List<Element> getElements()
	{
		return elements;
	}
	
	public List<Element> getEndElements()
	{
		return endElements;
	}
	
	public void addElement(int index, Element e)
	{
		if(e == null)
		{
			throw new NullPointerException();
		}
		
		elements.add(index, e);
	}
	
	public void addElement(Element e)
	{
		if(e == null)
		{
			throw new NullPointerException();
		}
		
		elements.add(e);
	}
	
	public void removeElement(Element e)
	{
		if(e == null)
		{
			throw new NullPointerException();
		}
		
		elements.remove(e);
	}
	
	public void removeElement(int index)
	{	
		elements.remove(index);
	}
	
	
	public void addEndElement(Element e)
	{
		if(e == null)
		{
			throw new NullPointerException();
		}
		
		endElements.add(e);
	}
	
	public void addEndElement(int index, Element e)
	{
		if(e == null)
		{
			throw new NullPointerException();
		}
		
		endElements.add(index, e);
	}
	
	public void removeEndElement(Element e)
	{
		if(e == null)
		{
			throw new NullPointerException();
		}
		
		endElements.remove(e);
	}
	
	public void removeEndElement(int index)
	{	
		endElements.remove(index);
	}
	
	@Override
	public String getHTML()
	{
		String html = HTML.tag(getTag(), getData(), getAttributes());
		
		for(Element e : elements)
		{
			html += e.getHTML();
		}
		for(Element e : endElements)
		{
			html += e.getHTML();
		}
		
		html += HTML.endTag(getTag());
		return html;
	}
	
	private List<Element> getElementsByAttribute(List<Element> list, String attribute, String value)
	{
		List<Element> results = new LinkedList<Element>();
		for(Element e : list)
		{
			String a = e.getAttribute(attribute);
			if(a != null && a.equals(value))
			{
				results.add(e);
			}
			if(e instanceof CompoundElement)
			{
				results.addAll(((CompoundElement) e).getElementsByAttribute(((CompoundElement) e).getElements(), attribute, value));
				results.addAll(((CompoundElement) e).getElementsByAttribute(((CompoundElement) e).getEndElements(), attribute, value));
			}
		}
		
		return results;
	}
	
	private List<Element> getElementsByTag(List<Element> list, String tag)
	{
		List<Element> results = new LinkedList<Element>();
		
		for(Element e : list)
		{
			if(e.getTag().equals(tag))
			{
				results.add(e);
			}
			if(e instanceof CompoundElement)
			{
				results.addAll(((CompoundElement) e).getElementsByTag(((CompoundElement) e).getElements(), tag));
				results.addAll(((CompoundElement) e).getElementsByTag(((CompoundElement) e).getEndElements(), tag));
			}
		}
		
		return results;
	}
}
