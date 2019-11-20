package html;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * A CompoundElement is an Element, but can contain other Elements
 * within itself. This renders in HTML as nested tags within this Element.
 * This class allows for nesting element within it in the order of the elements
 * list. It also allows for elements to always be added at the end of this element,
 * regardless of the amount of elements inside the main list. These elements are 
 * called endElements, and <code>endElement</code> associated methods affect these.
 * 
 * Data added to this element will always appear before all nested elements. If wanting
 * to add text data, then html tags, and then more text data, it is recommended to add
 * an element that contains all this data. This is unfortunately a limitation of the data
 * section.
 * 
 * Self-closing elements cannot be a CompoundElement.
 * @author colli
 *
 */
public class CompoundElement extends Element
{
	/**
	 * A list of regular nested elements.
	 */
	private List<Element> elements;
	
	/**
	 * A list of end nested elements.
	 */
	private List<Element> endElements;
	
	/**
	 * Constructor. Creates a CompoundElement with the given
	 * tag, no data, and no attributes.
	 * @param tag a tag for this element
	 */
	public CompoundElement(String tag)
	{
		this(tag, null, null);
	}
	
	/**
	 * Constructor. Creates a CompoundELement with the given tag, given data,
	 * and given attributes.
	 * @param tag a tag for this element
	 * @param data data for this element
	 * @param attributes key-value attributes for this element
	 */
	public CompoundElement(String tag, String data)
	{
		this(tag, data, null);
	}
	
	public CompoundElement(String tag, Map<String, Object> attributes)
	{
		this(tag, null, attributes);
	}
	
	public CompoundElement(String tag, String data, Map<String, Object> attributes, Element... startingElements)
	{
		super(tag, data, attributes);
		if(HTML.SELF_CLOSING_TAGS.contains(tag))
		{
			throw new IllegalArgumentException(String.format("<%s /> cannot be a compound element", tag));
		}
		elements = new LinkedList<Element>();
		endElements = new LinkedList<Element>();
		
		addElements(startingElements);
	}
	
	/**
	 * Gets the element from the main elements list at the given index.
	 * @param index location for an element
	 * @return an element
	 */
	public Element getElement(int index)
	{
		return elements.get(index);
	}
	
	/**
	 * Gets the element from the end elements list at the given index.
	 * @param index location for an element
	 * @return an element
	 */
	public Element getEndElement(int index)
	{
		return endElements.get(index);
	}
	
	/**
	 * Finds all elements (including end elements) that contain this singular class.
	 * @param c a class
	 * @return a list of elements that contain the given class
	 */
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
	
	/**
	 * Finds all elements (including end elements) that contain the given attribute's value.
	 * Attributes that do not have specific values (such as boolean-type attributes) will contain
	 * a blank string.
	 * @param attribute the attribute to find
	 * @param value the value to find
	 * @return a list of elements that contain the attribute's value
	 */
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
	
	/**
	 * Finds all elements (including end elements) that contain the given tag.
	 * @param tag the tag to find
	 * @return a list of elements that contain the given tag
	 */
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
	
	/**
	 * Find an element (including end elements) that contain the given id.
	 * If multiple elements have the same id, it will find the first occurance.
	 * @param id the id to find
	 * @return a list of elements that contain the given id
	 */
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
	
	/**
	 * Gets an unmodifiable list of all the main elements.
	 * @return a list of the main elements
	 */
	public List<Element> getElements()
	{
		return Collections.unmodifiableList(elements);
	}
	
	/**
	 * Gets an unmodifiable list of all the end elements.
	 * @return a list of the end elements
	 */
	public List<Element> getEndElements()
	{
		return Collections.unmodifiableList(endElements);
	}
	
	/**
	 * Adds the element into the main list at the given index.
	 * @param index location to add the element into
	 * @param e element to add
	 */
	public void addElement(int index, Element e)
	{
		if(e == null)
		{
			throw new NullPointerException();
		}
		
		elements.add(index, e);
	}
	
	/**
	 * Adds the element to the end of the main list.
	 * @param e element to add
	 */
	public CompoundElement addElement(Element e)
	{
		if(e == null)
		{
			throw new NullPointerException();
		}
		
		elements.add(e);
		
		return this;
	}
	
	public CompoundElement addElements(Element... elements)
	{
		for(var e : elements)
		{
			addElement(e);
		}
		
		return this;
	}
	
	/**
	 * Removes the given element from the main list.
	 * @param e element to remove
	 */
	public CompoundElement removeElement(Element e)
	{
		if(e == null)
		{
			throw new NullPointerException();
		}
		
		elements.remove(e);
		return this;
	}
	
	/**
	 * Removes an element from the main list at a given index.
	 * @param index location to remove
	 */
	public CompoundElement removeElement(int index)
	{	
		elements.remove(index);
		return this;
	}
	
	/**
	 * Adds an element to the end of the end elements list.
	 * @param e element to add
	 */
	public CompoundElement addEndElement(Element e)
	{
		if(e == null)
		{
			throw new NullPointerException();
		}
		
		endElements.add(e);
		return this;
	}
	
	/**
	 * Adds an element to the end elements list at the given index.
	 * @param index location to add
	 * @param e element to add
	 */
	public CompoundElement addEndElement(int index, Element e)
	{
		if(e == null)
		{
			throw new NullPointerException();
		}
		
		endElements.add(index, e);
		return this;
	}
	
	/**
	 * Removes the given element from the end elements list.
	 * @param e element to remove
	 */
	public void removeEndElement(Element e)
	{
		if(e == null)
		{
			throw new NullPointerException();
		}
		
		endElements.remove(e);
	}
	
	/**
	 * Removes an element from the end element list at the given index.
	 * @param index location to remove
	 */
	public void removeEndElement(int index)
	{	
		endElements.remove(index);
	}
	
	/**
	 * Returns the rendered html of this element.
	 * @return html of this element
	 */
	@Override
	public String getHTML()
	{
		setStyleString();
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
	
	/**
	 * Removes all elements from the main elements list.
	 */
	public void clearElements()
	{
		elements.forEach(this::removeElement);
	}
	
	/**
	 * Removes all element from the end elements list.
	 */
	public void clearEndElements()
	{
		endElements.forEach(this::removeEndElement);
	}
	
	/**
	 * Removes all elements.
	 */
	public void clearAllElements()
	{
		clearElements();
		clearEndElements();
	}
	
	/**
	 * Adds the given classes to the list of classes. This will also change the
	 * "class" attribute for rendering.
	 * 
	 * @param classes a list of classes
	 */
	@Override
	public CompoundElement addClasses(String... classes)
	{
		for (var c : classes)
		{
			addClass(c);
		}
		
		return this;
	}
	
	/**
	 * Finds elements by the given attribute and value from the given list.
	 * @param list a list of elements to search
	 * @param attribute attribute to find
	 * @param value value to find
	 * @return the list of elements that are contained within the elements from the given list
	 */
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
	
	/**
	 * Finds elements by the given tag from the given list.
	 * @param list a list of elements to search
	 * @param tag tag to find
	 * @return the list of elements that are contained within the elements from the given list
	 */
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
	
	/**
	 * Finds elements by the given class from the given list.
	 * @param list a list of elements to search
	 * @param c the class to find
	 * @return a list of elements that are contained within the elements from the given list
	 */
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
	
	/**
	 * Finds an element by the given id from the given list.
	 * @param list a list of elements to search
	 * @param id the id to find
	 * @return an element that contains the given id
	 */
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
