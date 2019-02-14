package html;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class CompoundElement extends Element
{
	private List<Element> elements;
	private List<Element> endElements;
	
	public CompoundElement(String tag)
	{
		this(tag, null, null);
	}
	
	public CompoundElement(String tag, String data)
	{
		this(tag, data, null);
	}
	
	public CompoundElement(String tag, Map<String, String> attributes)
	{
		this(tag, null, attributes);
	}
	
	public CompoundElement(String tag, String data, Map<String, String> attributes)
	{
		super(tag, data, attributes);
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
	
	public List<Element> getElementsByClass(String c)
	{
		if(c == null)
		{
			throw new NullPointerException();
		}
		
		List<Element> allElements = getElementsByClass(elements, c);
		allElements.addAll(getElementsByClass(endElements, c));
		
		return allElements;
	}
	
	public List<Element> getElementsByAttribute(String attribute, String value)
	{
		if(attribute == null)
		{
			throw new NullPointerException();
		}
		
		List<Element> allElements = getElementsByAttribute(elements, attribute, value);
		allElements.addAll(getElementsByAttribute(endElements, attribute, value));
		
		return allElements;
	}
	
	public List<Element> getElementsByTag(String tag)
	{
		if(tag == null)
		{
			throw new NullPointerException();
		}
		
		List<Element> allElements = getElementsByTag(elements, tag);
		allElements.addAll(getElementsByTag(endElements, tag));
		
		return allElements;
	}
	
	public Element getElementById(String id)
	{
		if(id == null)
		{
			throw new NullPointerException();
		}
		
		Element foundElement = getElementById(elements, id);
		if(foundElement == null)
		{
			foundElement = getElementById(endElements, id);
		}
		
		return foundElement;
	}
	
	public List<Element> getElements()
	{
		return Collections.unmodifiableList(elements);
	}
	
	public List<Element> getEndElements()
	{
		return Collections.unmodifiableList(endElements);
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
	
	public void clearElements()
	{
		elements.clear();
	}
	
	public void clearEndElements()
	{
		endElements.clear();
	}
	
	public void clearAllElements()
	{
		clearElements();
		clearEndElements();
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
	
	private List<Element> getElementsByClass(List<Element> list, String c)
	{
		List<Element> results = new LinkedList<Element>();
		
		for(Element e : list)
		{
			if(e.getClasses().contains(c))
			{
				results.add(e);
			}
			if(e instanceof CompoundElement)
			{
				results.addAll(((CompoundElement) e).getElementsByClass(((CompoundElement) e).getElements(), c));
				results.addAll(((CompoundElement) e).getElementsByClass(((CompoundElement) e).getEndElements(), c));
			}
		}
		
		return results;
	}
	
	private Element getElementById(List<Element> list, String id)
	{
		Element foundElement = null;
		for(Element e : list)
		{
			String currentId = e.getAttribute("id");
			if(currentId != null && id.equals(currentId))
			{
				foundElement = e;
				break;
			}
			
			if(e instanceof CompoundElement)
			{
				Element compoundElementResult = ((CompoundElement) e).getElementById(((CompoundElement) e).getElements(), id);
				if(compoundElementResult != null)
				{
					foundElement = compoundElementResult;
					break;
				}
				Element compoundEndElementResult = ((CompoundElement) e).getElementById(((CompoundElement) e).getEndElements(), id);
				if(compoundEndElementResult != null)
				{
					foundElement = compoundEndElementResult;
					break;
				}
			}
		}
		
		return foundElement;
	}
}
