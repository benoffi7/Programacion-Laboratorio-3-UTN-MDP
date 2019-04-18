package Guia3BisEjercicio4;

public class Time {
	private int hour;
	private int minute;
	private int second;
	
	public Time(int hour, int minute, int second)
	{
		if (comprobation(hour, minute, second))
		{
			setHour(hour);
			setMinute(minute);
			setSecond(second);
		}
		else
			System.out.println("Error");
	}

	private boolean comprobation(int hour, int minute, int second)
	{
		boolean success = false;
		if (hour >= 0 && hour <= 23 && minute >= 0 && minute <= 59 && second >= 0 && second <= 59)
			success = true;
		return success;
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
	
	public void advanceASecond()
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
	
	public void backASecond()
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
	
	public String printTime()
	{
		return ""+getHour()+":"+getMinute()+":"+getSecond();
	}
}
