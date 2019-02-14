package forms;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import html.CompoundElement;
import html.Element;
import util.Default;

public class Form extends CompoundElement
{
	private List<Input> inputs;
	private List<Input> endInputs;
	private List<String> acceptCharset;
	private String action;
	private String autocapitalize;
	private String autocomplete;
	private String enctype;
	private String method;
	private String name;
	private boolean novalidate;
	private String target;
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
	
	public Form()
	{
		super("form");
		inputs = new LinkedList<Input>();
		endInputs = new LinkedList<Input>();
		acceptCharset = new LinkedList<String>();
		try
		{
			properties.put("accept-charset", new Object[] {getClass().getMethod("parseCharset", String.class), new Default(), null});
			properties.put("action", new Object[] {getClass().getMethod("setAction", String.class), new Default(), null});
			properties.put("autocapitalize", new Object[] {getClass().getMethod("setAutocapitalize", String.class), new Default(), null});
			properties.put("autocomplete", new Object[] {getClass().getMethod("setAutocomplete", String.class), new Default(), null});
			properties.put("enctype", new Object[] {getClass().getMethod("setEnctype", String.class), new Default(), null});
			properties.put("method", new Object[] {getClass().getMethod("setMethod", String.class), new Default(), null});
			properties.put("name", new Object[] {getClass().getMethod("setName", String.class), new Default(), null});
			properties.put("novalidate", new Object[] {getClass().getMethod("setNoValidate", boolean.class), true, false});
			properties.put("target", new Object[] {getClass().getMethod("setTarget", String.class), new Default(), null});
		} catch (NoSuchMethodException | SecurityException e)
		{
			e.printStackTrace();
			throw new RuntimeException();
		}
	}
	
	public String getTarget()
	{
		return target;
	}
	
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
	
	public boolean getNoValidate()
	{
		return novalidate;
	}
	
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
	
	public String getName()
	{
		return name;
	}
	
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
	
	public String getMethod()
	{
		return method;
	}
	
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
	
	public String getEnctype()
	{
		return enctype;
	}
	
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
	
	public String getAutocomplete()
	{
		return autocomplete;
	}
	
	public void setAutocomplete(String auto)
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
	
	public String getAutocapitalize()
	{
		return autocapitalize;
	}
	
	public void setAutocapitalize(String auto)
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
	
	public String getAction()
	{
		return action;
	}
	
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
	
	public List<String> getAcceptCharset()
	{
		return Collections.unmodifiableList(acceptCharset);
	}
	
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
	
	public void addCharset(String charset)
	{
		if(charset == null)
		{
			throw new NullPointerException();
		}
		
		acceptCharset.add(charset);
		_setAttribute("accept-charset", String.join(",", acceptCharset));
	}
	
	public void parseCharset(String charset)
	{
		if(charset == null)
		{
			_removeAttribute("accept-charset");
		}
		else
		{
			for(String c : charset.split("[ ,]"))
			{
				addCharset(c);
			}
		}
		
	}
	
	public void removeInput(Input in)
	{
		if(in == null)
		{
			throw new NullPointerException();
		}
		
		inputs.remove(in);
		super.removeElement(in);
	}
	
	public void removeEndInput(Input in)
	{
		if(in == null)
		{
			throw new NullPointerException();
		}
		
		endInputs.remove(in);
		super.removeEndElement(in);
	}
	
	public void addInput(Input in)
	{
		if(in == null)
		{
			throw new NullPointerException();
		}
		
		inputs.add(in);
		super.addElement(in);
	}
	
	public void addEndInput(Input in)
	{
		if(in == null)
		{
			throw new NullPointerException();
		}
		
		endInputs.add(in);
		super.addEndElement(in);
	}
	
	public Input getInput(int index)
	{
		return inputs.get(index);
	}
	
	public Input getEndInput(int index)
	{
		return endInputs.get(index);
	}
	
	public List<Input> getInputs()
	{
		return Collections.unmodifiableList(inputs);
	}
	
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
			createdInput = foundClass.newInstance();
		} catch (InstantiationException | IllegalAccessException e1)
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
	
	public Element getElementByName(String name)
	{
		if(name == null)
		{
			throw new NullPointerException();
		}
		
		Element foundElement = null;
		
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
