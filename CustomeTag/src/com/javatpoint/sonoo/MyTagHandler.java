package com.javatpoint.sonoo;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

public class MyTagHandler extends TagSupport
{
	public MyTagHandler()
	{
		
	}

	@Override
	public int doStartTag() throws JspException
	{
		JspWriter out = pageContext.getOut();
		
		try
		{
			
			out.print(" Hello you are now in custom tag ");
			
		}
		catch (IOException e)
		{
		
			System.out.println(" Something went wrong ... !");
			
			e.printStackTrace();
		}
		
		
		return SKIP_BODY;
	}

	
}
