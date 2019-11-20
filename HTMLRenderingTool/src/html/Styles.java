package html;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Styles
{
	private Map<String, String> styles;
	
	public Styles()
	{
		styles = new HashMap<String, String>();
	}
	
	public Map<String, String> getStyles()
	{
		return Collections.unmodifiableMap(styles);
	}
	
	public void addStyle(String style, String value)
	{
		if(value == null)
		{
			removeStyle(style);
		}
		else
		{
			styles.put(style, value);
		}
	}
	
	public void removeStyle(String style)
	{
		styles.remove(style);
	}
	
	public String getStyle(String style)
	{
		return styles.getOrDefault(style, null);
	}
	
	public void clear()
	{
		styles.clear();
	}
	
	public void setBackgroundImage(String backgroundimage)
	{
		if(backgroundimage == null)
		{
			removeStyle("background-image");
		}
		else
		{
			addStyle("background-image", backgroundimage);
		}
	}

	public String getBackgroundImage()
	{
		return getStyle("background-image");
	}
}
