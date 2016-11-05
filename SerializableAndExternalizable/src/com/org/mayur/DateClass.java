package com.org.mayur;

import java.io.Serializable;

public class DateClass implements Serializable
{
	int dd;
	int mm;
	int yy;
	
	public DateClass()
	{
		
	}

	public DateClass(int dd, int mm, int yy)
	{
		
		this.dd = dd;
		this.mm = mm;
		this.yy = yy;
	}

	public String getStringDate()
	{
		return(" "+this.dd+" / "+this.mm+" / "+this.yy+" ");
	}


}
