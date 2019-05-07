package forms;

import attributes.Attributes;

/**
 * This class represents a week input.
 * @author colli
 *
 */
public class Week extends Input implements Attributes.Max, Attributes.Min, Attributes.Step
{
	/**
	 * Max attribute.
	 */
	private double max;
	
	/**
	 * Min attribute.
	 */
	private double min;
	
	/**
	 * Step attribute.
	 */
	private double step;
	
	/**
	 * Constructor. Creates an input of type "week".
	 */
	public Week()
	{
		setType("week");
		var max = Attributes.max(this);
		var min = Attributes.min(this);
		var step = Attributes.step(this);
		properties.put(max.getKey(), max.getValue());
		properties.put(min.getKey(), min.getValue());
		properties.put(step.getKey(), step.getValue());
	}
	
	/**
	 * Gets the step attribute.
	 * @return step value
	 */
	public double getStep()
	{
		return step;
	}
	
	/**
	 * Sets the step attribute. < 0 to remove.
	 * @param step step value
	 */
	public void setStep(double step)
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
	public double getMin()
	{
		return min;
	}
	
	/**
	 * Sets the min attribute. Double.MIN_VALUE to remove.
	 * @param min min value
	 */
	public void setMin(double min)
	{
		this.min = min;
		if(this.min == Double.MIN_VALUE)
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
	public double getMax()
	{
		return max;
	}
	
	/**
	 * Sets the max attribute. Double.MAX_VALUE to remove.
	 * @param max max value
	 */
	public void setMax(double max)
	{
		this.max = max;
		if(this.max == Double.MAX_VALUE)
		{
			_removeAttribute("max");
		}
		else
		{
			_setAttribute("max", String.valueOf(this.max));
		}
	}
}
