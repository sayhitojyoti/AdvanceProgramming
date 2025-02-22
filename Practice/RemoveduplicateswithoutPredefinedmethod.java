package com.Practice;

public class RemoveduplicateswithoutPredefinedmethod {

	public static void main(String[] args) {
		System.out.println(removeDuplicates("javadeveloper"));
		

	}
	public static String removeDuplicates(String s)
	{
		char[] ch=s.toCharArray();
		String result="";
		for(int i=0;i<ch.length;i++)
		{
			char curr=ch[i];
			int count=0;
			for(int j=0;j<ch.length;j++)
			{
				if(ch[j]==curr);
				{
					count++;
				}
			}
			if (count==1)
			{
				result+=curr;	
		    }
			
			
		}
		return result;
	}

}
