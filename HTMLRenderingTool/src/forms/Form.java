package forms;

import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import html.CompoundElement;
import html.Element;
import attributes.Attributes;

/**
 * This class represents a form tag. It allows for inputs
 * to be easilty added and data validation.
 * 
 * NOTE: Specific inputs are not yet validated. So not all fields
 * have been validated yet. Fields that are validated:
 * required
 * @author colli
 *
 */
public class Form extends CompoundElement implements Attributes.AcceptCharset, Attributes.Action, Attributes.AutoCapitalize, Attributes.AutoComplete, Attributes.Enctype, Attributes.Method, Attributes.Name, Attributes.NoValidate, Attributes.Target
{
	/**
	 * List of main inputs.
	 */
	private List<Input> inputs;
	
	/**
	 * List of end inputs.
	 */
	private List<Input> endInputs;
	
	/**
	 * List of accepted character sets.
	 */
	private List<String> acceptCharset;
	
	/**
	 * Action value.
	 */
	private String action;
	
	/**
	 * Autocapitalize value.
	 */
	private String autocapitalize;
	
	/**
	 * Autocomplete value.
	 */
	private String autocomplete;
	
	/**
	 * Enctype value.
	 */
	private String enctype;
	
	/**
	 * Method value.
	 */
	private String method;
	
	/**
	 * Name value.
	 */
	private String name;
	
	/**
	 * Novalidate value.
	 */
	private boolean novalidate;
	
	/**
	 * Target value.
	 */
	private String target;
	
	/**
	 * Map consisting of keys of input type names to their corresponding
	 * class specific implementations.
	 */
	public static final Map<String, Class<? extends Input>> formTypeToClass;
	
	static
	{
		formTypeToClass = new HashMap<String, Class<? extends Input>>();
		formTypeToClass.put("button", Button.class);
		formTypeToClass.put("checkbox", Checkbox.class);
		formTypeToClass.put("color", Color.class);
		formTypeToClass.put("date", Date.class);
		formTypeToClass.put("datetime-local", Datetime_Local.class);
		formTypeToClass.put("email", Email.class);
		formTypeToClass.put("file", File.class);
		formTypeToClass.put("hidden", Hidden.class);
		formTypeToClass.put("image", Image.class);
		formTypeToClass.put("month", Month.class);
		formTypeToClass.put("number", Number.class);
		formTypeToClass.put("password", Password.class);
		formTypeToClass.put("radio", Radio.class);
		formTypeToClass.put("range", Range.class);
		formTypeToClass.put("reset", Reset.class);
		formTypeToClass.put("search", Search.class);
		formTypeToClass.put("submit", Submit.class);
		formTypeToClass.put("tel", Telephone.class);
		formTypeToClass.put("text", TextField.class);
		formTypeToClass.put("time", Time.class);
		formTypeToClass.put("url", Url.class);
		formTypeToClass.put("week", Week.class);
	}
	
	/**
	 * Constructor. Creates an "form" element.
	 */
	public Form()
	{
		super("form");
		inputs = new LinkedList<Input>();
		endInputs = new LinkedList<Input>();
		acceptCharset = new LinkedList<String>();
	}
	
	/**
	 * Gets target attribute.
	 * @return target value
	 */
	public String getTarget()
	{
		return target;
	}
	
	/**
	 * Sets target attribute. Null to remove.
	 * @param target target value
	 */
	public void setTarget(String target)
	{
		this.target = target;
		if(this.target == null)
		{
			_removeAttribute("target");
		}
		else
		{
			_setAttribute("target", this.target);
		}
	}
	
	/**
	 * Gets novalidate attribute.
	 * @return novalidate value
	 */
	public boolean getNoValidate()
	{
		return novalidate;
	}
	
	/**
	 * Sets novalidate attribute.
	 * @param v novalidate value
	 */
	public void setNoValidate(boolean v)
	{
		this.novalidate = v;
		if(this.novalidate)
		{
			_setAttribute("novalidate", "");
		}
		else
		{
			_removeAttribute("novalidate");
		}
	}
	
	/**
	 * Gets the name attribute.
	 * @return name value
	 */
	public String getName()
	{
		return name;
	}
	
	/**
	 * Sets the name attribute. Null to remove.
	 * @param name name value
	 */
	public void setName(String name)
	{
		this.name = name;
		if(this.name == null)
		{
			_removeAttribute("name");
		}
		else
		{
			_setAttribute("name", this.name);
		}
	}
	
	/**
	 * Gets the method attribute.
	 * @return method value
	 */
	public String getMethod()
	{
		return method;
	}
	
	/**
	 * Sets the method attribute. Null to remove.
	 * @param method method value
	 */
	public void setMethod(String method)
	{
		this.method = method;
		if(this.method == null)
		{
			_removeAttribute("method");
		}
		else
		{
			_setAttribute("method", this.method);
		}
	}
	
	/**
	 * Gets the enctype attribute
	 * @return enctype value
	 */
	public String getEnctype()
	{
		return enctype;
	}
	
	/**
	 * Sets the enctype attribute. Null to remove.
	 * @param enc enctype value
	 */
	public void setEnctype(String enc)
	{
		this.enctype = enc;
		if(this.enctype == null)
		{
			_removeAttribute("enctype");
		}
		else
		{
			_setAttribute("enctype", this.enctype);
		}
	}
	
	/**
	 * Gets the autocomplete attribute.
	 * @return autocomplete value
	 */
	public String getAutoComplete()
	{
		return autocomplete;
	}
	
	/**
	 * Sets the autocomplete attribute. Null to remove.
	 * @param auto autocomplete value
	 */
	public void setAutoComplete(String auto)
	{
		this.autocomplete = auto;
		if(this.autocomplete == null)
		{
			_removeAttribute("autocomplete");
		}
		else
		{
			_setAttribute("autocomplete", this.autocomplete);
		}
	}
	
	/**
	 * Gets the autocapitalize attribute.
	 * @return autocapitalize value
	 */
	public String getAutoCapitalize()
	{
		return autocapitalize;
	}
	
	/**
	 * Sets the autocapitalize attribute. Null to remove.
	 * @param auto autocapitalize value
	 */
	public void setAutoCapitalize(String auto)
	{
		this.autocapitalize = auto;
		if(this.autocapitalize == null)
		{
			_removeAttribute("autocapitalize");
		}
		else
		{
			_setAttribute("autocapitalize", this.autocapitalize);
		}
	}
	
	/**
	 * Gets the action attribute.
	 * @return action value
	 */
	public String getAction()
	{
		return action;
	}
	
	/**
	 * Sets the action attribute. Null to remove.
	 * @param action action value
	 */
	public void setAction(String action)
	{
		this.action = action;
		if(this.action == null)
		{
			_removeAttribute("action");
		}
		else
		{
			_setAttribute("action", this.action);
		}
	}
	
	/**
	 * Gets an unmodifiable list of the accepted character sets.
	 * @return list of charsets
	 */
	public List<String> getAcceptCharsetList()
	{
		return Collections.unmodifiableList(acceptCharset);
	}
	
	public String getAcceptCharset()
	{
		return getAttribute("accept-charset");
	}
	
	/**
	 * Removes a character set from the list of charsets.
	 * @param charset singular charset
	 */
	public void removeCharset(String charset)
	{
		if(charset == null)
		{
			throw new NullPointerException();
		}
		
		acceptCharset.remove(charset);
		if(acceptCharset.isEmpty())
		{
			_removeAttribute("accept-charset");
		}
		else
		{
			_setAttribute("accept-charset", String.join(",", acceptCharset));
		}
	}
	
	/**
	 * Adds a character set to the list of charsets.
	 * @param charset singular charset
	 */
	public void addCharset(String charset)
	{
		if(charset == null)
		{
			throw new NullPointerException();
		}
		
		acceptCharset.add(charset);
		_setAttribute("accept-charset", String.join(",", acceptCharset));
	}
	
	/**
	 * Splits the given charsets by spaces and adds each individual charset
	 * into the list of charsets.
	 * @param charset space deliminated set of charsets
	 */
	public void setAcceptCharset(String charset)
	{
		if(charset == null)
		{
			_removeAttribute("accept-charset");
		}
		else
		{
			for(String c : charset.split(" "))
			{
				addCharset(c);
			}
		}
		
	}
	
	/**
	 * Removes an input from the main list.
	 * @param in input to remove
	 */
	public void removeInput(Input in)
	{
		if(in == null)
		{
			throw new NullPointerException();
		}
		
		inputs.remove(in);
		super.removeElement(in);
	}
	
	/**
	 * Removes an end input from the end inputs list.
	 * @param in end input to remove
	 */
	public void removeEndInput(Input in)
	{
		if(in == null)
		{
			throw new NullPointerException();
		}
		
		endInputs.remove(in);
		super.removeEndElement(in);
	}
	
	/**
	 * Adds an input into the main list.
	 * @param in input to add
	 */
	public void addInput(Input in)
	{
		if(in == null)
		{
			throw new NullPointerException();
		}
		
		inputs.add(in);
		super.addElement(in);
	}
	
	/**
	 * Adds an end input to the end inputs list.
	 * @param in end input to add
	 */
	public void addEndInput(Input in)
	{
		if(in == null)
		{
			throw new NullPointerException();
		}
		
		endInputs.add(in);
		super.addEndElement(in);
	}
	
	/**
	 * Gets the main input from the given index.
	 * @param index location of input
	 * @return input found
	 */
	public Input getInput(int index)
	{
		return inputs.get(index);
	}
	
	/**
	 * Gets the end input from the given index.
	 * @param index location of input
	 * @return end input found
	 */
	public Input getEndInput(int index)
	{
		return endInputs.get(index);
	}
	
	/**
	 * Gets an unmodifiable list of the main inputs.
	 * @return list of inputs
	 */
	public List<Input> getInputs()
	{
		return Collections.unmodifiableList(inputs);
	}
	
	/**
	 * Gets an unmodifiable list of the end inputs.
	 * @return list of end inputs
	 */
	public List<Input> getEndInputs()
	{
		return Collections.unmodifiableList(endInputs);
	}
	
	@Override
	public void addElement(Element e)
	{
		if(e != null)
		{
			if(e.getTag().equals("input"))
			{
				Input addedInput = null;
				if(!(e instanceof Input))
				{
					addedInput = parseInput(e);
				}
				
				addInput(addedInput == null ? (Input) e : addedInput);
				return;
			}
			if(e instanceof CompoundElement)
			{
				inputs.addAll(findInputs((CompoundElement) e));
			}
		}
		
		super.addElement(e);
	}
	
	@Override
	public void addEndElement(Element e)
	{
		if(e != null)
		{
			if(e.getTag().equals("input"))
			{
				Input addedInput = null;
				if(!(e instanceof Input))
				{
					addedInput = parseInput(e);
				}
				
				addEndInput(addedInput == null ? (Input) e : addedInput);
				return;
			}
			if(e instanceof CompoundElement)
			{
				endInputs.addAll(findInputs((CompoundElement) e));
			}
		}
		
		super.addEndElement(e);
	}
	
	@Override
	public void removeElement(Element e)
	{
		if(e != null)
		{
			if(e instanceof Input)
			{
				removeInput((Input) e);
				return;
			}
			if(e.getTag().equals("input"))
			{	
				Input removedInput = parseInput(e);
				if(removedInput != null)
				{
					removeInput(removedInput);
				}
			}
			if(e instanceof CompoundElement && getElements().contains(e))
			{
				inputs.removeAll(findInputs((CompoundElement) e));
			}
		}
		
		super.removeElement(e);
	}
	
	@Override
	public void removeEndElement(Element e)
	{
		if(e != null)
		{
			if(e instanceof Input)
			{
				removeEndInput((Input) e);
				return;
			}
			if(e.getTag().equals("input"))
			{	
				Input removedInput = parseInput(e);
				if(removedInput != null)
				{
					removeEndInput(removedInput);
				}
			}
			if(e instanceof CompoundElement && getEndElements().contains(e))
			{
				endInputs.removeAll(findInputs((CompoundElement) e));
			}
		}
		
		super.removeEndElement(e);
	}
	
	@Override
	public void removeElement(int index)
	{
		Element found = getElement(index);
		if(found != null)
		{
			removeElement(found);
		}
	}
	
	@Override
	public void removeEndElement(int index)
	{
		Element found = getEndElement(index);
		if(found != null)
		{
			removeEndElement(found);
		}
	}
	
	/**
	 * Attempts to turn an Element object into an input. It will call upon
	 * the constructor of the specific type of input it is.
	 * @param e element to check
	 * @return a specific Input, or null if given element is not an input.
	 */
	@SuppressWarnings("unchecked")
	public Input parseInput(Element e)
	{
		if(e.getAttribute("type") == null)
		{
			return null;
		}
		Class<Input> foundClass = (Class<Input>) formTypeToClass.get(e.getAttribute("type"));
		if(foundClass == null)
		{
			return null;
		}
		
		Input createdInput;
		
		try
		{
			createdInput = foundClass.getDeclaredConstructor().newInstance();
		} catch (InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException | NoSuchMethodException | SecurityException e1)
		{
			return null;
		}
		
		for(String key : e.getAttributes().keySet())
		{
			try
			{
				createdInput.setAttribute(key, e.getAttribute(key));
			}
			catch(IllegalArgumentException e1)
			{
				
			}
		}
		
		return createdInput;
	}
	
	@Override
	public void clearElements()
	{
		inputs.clear();
		super.clearElements();
	}
	
	@Override
	public void clearEndElements()
	{
		endInputs.clear();
		super.clearEndElements();
	}
	
	/**
	 * Cleares the value attribute of every input.
	 */
	public void clearValues()
	{
		inputs.forEach(i -> i.setValue(""));
		endInputs.forEach(i -> i.setValue(""));
	}
	
	/**
	 * Determines if the current form is valid.
	 * 
	 * NOTE: This needs to be changed to check for validation for specific
	 * inputs.
	 * @return true if all inputs are valid, false otherwise
	 */
	public boolean isValid()
	{
		return inputs.stream().filter(i -> i.getRequired() && i.getValue() != null && i.getValue().isEmpty())
					   .count() == 0;
	}
	
	/**
	 * Attempts to set the values of the inputs based on the parameter map.
	 * @param parameters key-value pair of name inputs to their value
	 * @return true if all inputs are valid, false otherwise
	 */
	public boolean validate(Map<String, String[]> parameters)
	{
		for(String key : parameters.keySet())
		{
			boolean inputFound = false;
			for(Input i : inputs)
			{
				if(i.getName().equals(key))
				{
					inputFound = true;
					i.setValue(String.join(",", parameters.get(key)));
					break;
				}
			}
			if(!inputFound)
			{
				for(Input i : endInputs)
				{
					if(i.getName().equals(key))
					{
						i.setValue(String.join(",", parameters.get(key)));
						break;
					}
				}
			}
		}
		return isValid();
	}
	
	/**
	 * Finds an input by its name attribute.
	 * @param name name value
	 * @return found Input, or null if not found.
	 */
	public Input getInputByName(String name)
	{
		if(name == null)
		{
			throw new NullPointerException();
		}
		
		Input foundElement = null;
		
		List<Input> allInputs = new LinkedList<Input>(inputs);
		allInputs.addAll(endInputs);
		
		for(Input i : allInputs)
		{
			if(i.getName().equals(name))
			{
				foundElement = i;
				break;
			}
		}
		
		return foundElement;
	}
	
	/**
	 * Searches a CompoundElement for all elements and attempts to
	 * find all inputs within it. This could be actual Input objects,
	 * or Elements that can be parsed into inputs.
	 * @param e a CompoundElement to search
	 * @return list of found Inputs in the CompoundElement
	 */
	private List<Input> findInputs(CompoundElement e)
	{
		List<Input> foundInputs = new LinkedList<Input>();
		List<Element> allElements = new LinkedList<Element>(e.getElements());
		allElements.addAll(e.getEndElements());
		for(Element el : allElements)
		{
			if(el instanceof CompoundElement)
			{
				foundInputs.addAll(findInputs((CompoundElement) el));
			}
			if(el instanceof Input)
			{
				foundInputs.add((Input) el);
			}
			else
			{
				if(el.getTag().equals("input"))
				{
					Input parsedInput = parseInput(el);
					if(parsedInput != null)
					{
						foundInputs.add(parsedInput);
					}
				}
			}
		}
		
		return foundInputs;
	}
}
