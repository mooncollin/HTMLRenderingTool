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
public class Form extends CompoundElement implements Attributes.AcceptCharset, 
	Attributes.Action, Attributes.AutoCapitalize, Attributes.AutoComplete, 
	Attributes.Enctype, Attributes.Method, Attributes.Name, Attributes.NoValidate, 
	Attributes.Target
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
		this(Collections.emptyMap());
	}
	
	@SafeVarargs
    public Form(Map.Entry<String, ?>... entries)
    {
        this(Map.ofEntries(entries));
    }
	
	public Form(Map<String, Object> attributes)
	{
		super("form", attributes);
		inputs = new LinkedList<Input>();
		endInputs = new LinkedList<Input>();
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
	public Object getInput(int index)
	{
		return inputs.get(index);
	}
	
	/**
	 * Gets the end input from the given index.
	 * @param index location of input
	 * @return end input found
	 */
	public Object getEndInput(int index)
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
	public Form addElement(Element e)
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
				return this;
			}
			if(e instanceof CompoundElement)
			{
				inputs.addAll(findInputs((CompoundElement) e));
			}
		}
		
		super.addElement(e);
		return this;
	}
	@Override
	public Form addEndElement(Element e)
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
				return this;
			}
			if(e instanceof CompoundElement)
			{
				endInputs.addAll(findInputs((CompoundElement) e));
			}
		}
		
		super.addEndElement(e);
		return this;
	}
	
	@Override
	public Form removeElement(Element e)
	{
		if(e != null)
		{
			if(e instanceof Input)
			{
				removeInput((Input) e);
				return this;
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
		return this;
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
	public Form removeElement(int index)
	{
		Element found = getElement(index);
		if(found != null)
		{
			removeElement(found);
		}
		
		return this;
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
		var foundInputs = new LinkedList<Input>();
		var allElements = new LinkedList<Element>(e.getElements());
		allElements.addAll(e.getEndElements());
		for(var el : allElements)
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
