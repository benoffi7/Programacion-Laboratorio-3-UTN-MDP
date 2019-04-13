package e4;

public class Time
{
	private int hour;
	private int minute;
	private int second;
	
	public Time(int hour, int minute, int second)
	{
		if (!condition(hour, minute, second))
			throw new IllegalArgumentException("Error");
		else
		{
			setHour(hour);
			setMinute(minute);
			setSecond(second);
		}
	}

	private boolean condition(int hour, int minute, int second)
	{
		boolean condition = false;
		if (hour >= 0 && hour <= 23 && minute >= 0 && minute <= 59 && second >= 0 && second <= 59)
			condition = true;
		return condition;
	}	
	
	public void setHour(int hour)
	{
		this.hour = hour;
	}
	
	public void setMinute(int minute)
	{
		this.minute = minute;
	}
	
	public void setSecond(int second)
	{
		this.second = second;
	}
	
	public int getHour()
	{
		return hour;
	}
	
	public int getMinute()
	{
		return minute;
	}
	
	public int getSecond()
	{
		return second;
	}	
	
	public String getTime()
	{
		String time = String.format("%02d:%02d:%02d", getHour(), getMinute(), getSecond());
		return time;
	}
	
	public void advanceOneSecond()
	{
		if (getSecond() == 59)
		{
			if (getMinute() == 59)
			{
				if (getHour() == 23)
				{
					setHour(0);
					setMinute(0);
					setSecond(0);
				}
				else
				{
					setHour(getHour() + 1);	
					setMinute(0);
					setSecond(0);	
				}
			}
			else
			{
				setMinute(getMinute() + 1);
				setSecond(0);
			}
		}
		else
			setSecond(getSecond() + 1);
	}
	
	public void backOneSecond()
	{
		if (getSecond() == 0)
		{
			if (getMinute() == 0)
			{
				if (getHour() == 0)
				{
					setHour(23);
					setMinute(59);
					setSecond(59);
				}
				else
				{
					setHour(getHour() -1);	
					setMinute(59);
					setSecond(59);	
				}
			}
			else
			{
				setMinute(getMinute() - 1);
				setSecond(59);
			}
		}
		else
			setSecond(getSecond() - 1);
	}
}