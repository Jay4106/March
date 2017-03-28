package com.junit;

public class TestExample {

	
		 
		public String First2Positions(String str)
		{
			if (str.length() <= 2)
				return str.replaceAll("A", "1");
			
			String first2Chars = str.substring(0, 2);
			String stringMinusFirst2Chars = str.substring(2);
			
			return first2Chars.replaceAll("A", "1") + stringMinusFirst2Chars;
					
			
			
		}

	
	

}
