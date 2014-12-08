package package2;

import javax.swing.*;
import java.util.Date;
import java.text.*;
class validate
{

	boolean isEmail(String s1)
	{
		 // if(s1.matches("^[_A-Za-z][_\\w-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]{2,4})?(\\.[A-Za-z]{2,4})$"))
		if (s1.matches("^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$"))
			return true;
		else
		{

			return false;
		}

	}


	boolean isSelected(String s1)
	{
		s1 = s1.trim();
		int len = s1.length();
		if(s1.equals("Select") || len==0)
		{

			return false;
		}
		else
			return true;
	}

}