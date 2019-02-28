package forms;

import util.Default;

/**
 * This class represents a range input.
 * @author colli
 *
 */
public class Range extends Input
{
	/**
	 * Max attribute.
	 */
	private int max;
	
	/**
	 * Min attribute.
	 */
	private int min;
	
	/**
	 * Step attribute.
	 */
	private int step;
	
	/**
	 * Constructor. Creates an input of type "range".
	 */
	public Range()
	{
		setType("range");
		try
		{
			properties.put("max", new Object[] {getClass().getMethod("parseMax", String.class), new Default(), "-1"});
			properties.put("min", new Object[] {getClass().getMethod("parseMin", String.class), new Default(), "-1"});
			properties.put("step", new Object[] {getClass().getMethod("parseStep", String.class), new Default(), "-1"});
		} catch (NoSuchMethodException | SecurityException e)
		{
			e.printStackTrace();
			throw new RuntimeException();
		}
	}
	
	/**
	 * Gets the step attribute
	 * @return step value
	 */
	public int getStep()
	{
		return step;
	}
	
	/**
	 * Sets the step attribute. < 0 to remove.
	 * @param step step value
	 */
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
	
	/**
	 * Gets the min attribute.
	 * @return min value
	 */
	public int getMin()
	{
		return min;
	}
	
	/**
	 * Sets the min attribute. < 0 to remove.
	 * @param min min value
	 */
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
	
	/**
	 * Gets the max attribute.
	 * @return max value
	 */
	public int getMax()
	{
		return max;
	}
	
	/**
	 * Sets the max attribute. < 0 to remove.
	 * @param max max value
	 */
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
	
	/**
	 * Parses the string as a number and sets the step
	 * attribute.
	 * @param step number as a string
	 */
	public void parseStep(String step)
	{
		setStep(step == null ? -1 : Integer.parseInt(step));
	}
	
	/**
	 * Parses the string as a number and sets the min
	 * attribute.
	 * @param min number as a string
	 */
	public void parseMin(String min)
	{
		setMin(min == null ? -1 : Integer.parseInt(min));
	}
	
	/**
	 * Parses the string as a number and sets the max
	 * attribute.
	 * @param max number as a string
	 */
	public void parseMax(String max)
	{
		setMax(max == null ? -1 : Integer.parseInt(max));
	}
}
