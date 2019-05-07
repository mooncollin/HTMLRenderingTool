package forms;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import attributes.Attributes;

/**
 * This class represents a file input.
 * 
 * NOTE: This class currently does not parse files yet.
 * You will have to go through the request parameters for files
 * manually.
 * @author colli
 *
 */
public class File extends Input implements Attributes.Accept, Attributes.Capture, Attributes.Multiple
{
	/**
	 * A list of file types to accept.
	 */
	private List<String> accept;
	
	/**
	 * The capture attribute.
	 */
	private String capture;
	
	/**
	 * The list of files to be populated when
	 * given the parameter map.
	 */
	private List<HTMLFile> files;
	
	/**
	 * Allows for multiple file inputs.
	 */
	private boolean multiple;
	
	/**
	 * Constructor. Creates an input of type "file".
	 */
	public File()
	{
		setType("file");
		
		accept = new LinkedList<String>();
		files = new LinkedList<HTMLFile>();
	}
	
	/**
	 * Gets an unmodifiable list of files. This will only be
	 * populated when validated and valid information is passed.
	 * @return list of HTMLFiles
	 */
	public List<HTMLFile> getFiles()
	{
		return Collections.unmodifiableList(files);
	}
	
	/**
	 * Converts a comma separated string of tokens to accept
	 * types.
	 * @param acceptString comma separated string of tokens
	 */
	public void setAccept(String acceptString)
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
	
	/**
	 * Gets an unmodifiable list of the accepted file types.
	 * @return list of accepted file types.
	 */
	public List<String> getAcceptList()
	{
		return Collections.unmodifiableList(accept);
	}
	
	public String getAccept()
	{
		return getAttribute("accept");
	}
	
	/**
	 * Removes an accept file type. If there are no accepted
	 * file types, then the attribute will be removed entirely.
	 * @param a file type
	 */
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
	
	/**
	 * Adds an accept file type.
	 * @param a file type
	 */
	public void addAccept(String a)
	{
		if(a == null)
		{
			throw new NullPointerException();
		}
		
		accept.add(a);
		_setAttribute("accept", String.join(",", accept));
	}
	
	/**
	 * Gets the capture attribute.
	 * @return capture value
	 */
	public String getCapture()
	{
		return capture;
	}
	
	/**
	 * Sets the capture attribute. Null to remove.
	 * @param c capture value
	 */
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
	
	/**
	 * Gets the multiple attribute.
	 * @return multiple value
	 */
	public boolean getMultiple()
	{
		return multiple;
	}
	
	/**
	 * Sets the multiple attribute.
	 * @param m multiple value.
	 */
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
	public void setAttribute(String key, Object value)
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
