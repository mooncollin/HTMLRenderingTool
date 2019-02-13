package forms;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import util.Default;

public class File extends Input
{
	private List<String> accept;
	private String capture;
	private List<HTMLFile> files;
	private boolean multiple;
	
	public File()
	{
		setType("file");
		try
		{
			properties.put("multiple", new Object[] {getClass().getMethod("setMultiple", boolean.class), true, false});
			properties.put("capture", new Object[] {getClass().getMethod("setCapture", String.class), new Default(), null});
			properties.put("accept", new Object[] {getClass().getDeclaredMethod("parseAccept", String.class), new Default(), null});
		} catch (NoSuchMethodException | SecurityException e)
		{
			e.printStackTrace();
			throw new RuntimeException();
		}
		
		accept = new LinkedList<String>();
		files = new LinkedList<HTMLFile>();
	}
	
	public List<HTMLFile> getFiles()
	{
		return Collections.unmodifiableList(files);
	}
	
	@SuppressWarnings("unused")
	private void parseAccept(String acceptString)
	{
		if(acceptString == null)
		{
			_removeAttribute("accept");
		}
		else
		{
			for(String a : acceptString.split(","))
			{
				addAccept(a);
			}
		}
	}
	
	public List<String> getAccept()
	{
		return Collections.unmodifiableList(accept);
	}
	
	public void removeAccept(String a)
	{
		if(a == null)
		{
			throw new NullPointerException();
		}
		
		accept.remove(a);
		if(accept.isEmpty())
		{
			_removeAttribute("accept");
		}
		else
		{
			_setAttribute("accept", String.join(",", accept));
		}
	}
	
	public void addAccept(String a)
	{
		if(a == null)
		{
			throw new NullPointerException();
		}
		
		accept.add(a);
		_setAttribute("accept", String.join(",", accept));
	}
	
	public String getCapture()
	{
		return capture;
	}
	
	public void setCapture(String c)
	{
		this.capture = c;
		if(this.capture == null)
		{
			_removeAttribute("capture");
		}
		else
		{
			_setAttribute("capture", c);
		}
	}
	
	public boolean getMultiple()
	{
		return multiple;
	}
	
	public void setMultiple(boolean m)
	{
		this.multiple = m;
		if(this.multiple)
		{
			_setAttribute("multiple", "");
		}
		else
		{
			_removeAttribute("multiple");
		}
	}
	
	@Override
	public void removeAttribute(String key)
	{
		if(key != null)
		{
			if(key.equals("files"))
			{
				throw new IllegalArgumentException("Cannot change attribute: files");
			}
		}
		
		super.removeAttribute(key);;
	}
	
	@Override
	public void setAttribute(String key, String value)
	{
		if(key != null)
		{
			if(key.equals("files"))
			{
				throw new IllegalArgumentException("Cannot change attribute: files");
			}
		}
		
		super.setAttribute(key, value);
	}
}
