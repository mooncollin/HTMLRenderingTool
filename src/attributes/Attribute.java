package attributes;

import java.util.Objects;
import java.util.function.Consumer;

public class Attribute<T>
{	
	Consumer<T> setterMethod;
	T defaultSet;
	T defaultRemove;
	Class<T> clazz;
	
	public Attribute(Class<T> clazz, Consumer<T> setter, T set, T remove)
	{
		setClazz(clazz);
		setSetterMethod(setter);
		setDefaultSet(set);
		setDefaultRemove(remove);
	}
	
	public Class<T> getClazz()
	{
		return clazz;
	}

	public Consumer<T> getSetterMethod()
	{
		return setterMethod;
	}

	public T getDefaultSet()
	{
		return defaultSet;
	}

	public T getDefaultRemove()
	{
		return defaultRemove;
	}

	public void setSetterMethod(Consumer<T> setterMethod)
	{
		this.setterMethod = Objects.requireNonNull(setterMethod);
	}

	public void setDefaultSet(T defaultSet)
	{
		this.defaultSet = defaultSet;
	}

	public void setDefaultRemove(T defaultRemove)
	{
		this.defaultRemove = defaultRemove;
	}
	
	public void setClazz(Class<T> clazz)
	{
		this.clazz = clazz;
	}
	
	public T convert(String original)
	{
		T value;
		if(this.clazz.equals(Boolean.class))
		{
			value = this.clazz.cast(Boolean.valueOf(original));
		}
		else if(this.clazz.equals(Integer.class))
		{
			value = this.clazz.cast(Integer.valueOf(original));
		}
		else if(this.clazz.equals(Double.class))
		{
			value = this.clazz.cast(Double.valueOf(original));
		}
		else
		{
			value = this.clazz.cast(original);
		}
		
		return value;
	}
}
