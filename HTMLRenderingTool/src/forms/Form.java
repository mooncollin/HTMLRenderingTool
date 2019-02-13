package forms;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

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
				if(!(e instanceof Input))
				{
					throw new IllegalArgumentException("Input element needs to be of type Input");
				}
				
				addInput((Input) e);
				return;
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
				if(!(e instanceof Input))
				{
					throw new IllegalArgumentException("Input element needs to be of type Input");
				}
				
				addEndInput((Input) e);
				return;
			}
		}
		
		super.addEndElement(e);
	}
	
	@Override
	public void removeElement(Element e)
	{
		if(e != null && e instanceof Input)
		{
			removeInput((Input) e);
			return;
		}
		
		super.removeElement(e);
	}
	
	@Override
	public void removeEndElement(Element e)
	{
		if(e != null && e instanceof Input)
		{
			removeEndInput((Input) e);
			return;
		}
		
		super.removeEndElement(e);
	}
	
	@Override
	public void removeElement(int index)
	{
		Element found = getElement(index);
		if(found instanceof Input)
		{
			removeInput((Input) found);
			return;
		}
		
		super.removeElement(index);
	}
	
	@Override
	public void removeEndElement(int index)
	{
		Element found = getEndElement(index);
		if(found instanceof Input)
		{
			removeEndInput((Input) found);
			return;
		}
		
		super.removeEndElement(index);
	}
}
