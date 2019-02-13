package forms;

import util.Default;

public class Number extends Input
{
	private int max;
	private int min;
	private String placeholder;
	private int step;
	
	public Number()
	{
		setType("number");
		try
		{
			properties.put("max", new Object[] {getClass().getMethod("parseMax", String.class), new Default(), "-1"});
			properties.put("min", new Object[] {getClass().getMethod("parseMin", String.class), new Default(), "-1"});
			properties.put("placeholder", new Object[] {getClass().getMethod("setPlaceholder", String.class), new Default(), null});
			properties.put("step", new Object[] {getClass().getMethod("parseStep", String.class), new Default(), "-1"});
		} catch (NoSuchMethodException | SecurityException e)
		{
			e.printStackTrace();
			throw new RuntimeException();
		}
	}
	
	public int getStep()
	{
		return step;
	}
	
	public void setStep(int step)
	{
		this.step = step < 0 ? -1 : step;
		if(this.step < 0)
		{
			_removeAttribute("step");
		}
		else
		{
			_setAttribute("step", String.valueOf(this.step));
		}
	}
	
	public String getPlaceholder()
	{
		return placeholder;
	}
	
	public void setPlaceholder(String p)
	{
		this.placeholder = p;
		if(this.placeholder == null)
		{
			_removeAttribute("placeholder");
		}
		else
		{
			_setAttribute("placeholder", this.placeholder);
		}
	}
	
	public int getMin()
	{
		return min;
	}
	
	public void setMin(int min)
	{
		this.min = min < 0 ? -1 : min;
		if(this.min < 0)
		{
			_removeAttribute("min");
		}
		else
		{
			_setAttribute("min", String.valueOf(this.min));
		}
	}
	
	public int getMax()
	{
		return max;
	}
	
	public void setMax(int max)
	{
		this.max = max < 0 ? -1 : max;
		if(this.max < 0)
		{
			_removeAttribute("max");
		}
		else
		{
			_setAttribute("max", String.valueOf(this.max));
		}
	}
	
	public void parseStep(String step)
	{
		setStep(step == null ? -1 : Integer.parseInt(step));
	}
	
	public void parseMin(String min)
	{
		setMin(min == null ? -1 : Integer.parseInt(min));
	}
	
	public void parseMax(String max)
	{
		setMax(max == null ? -1 : Integer.parseInt(max));
	}
}
