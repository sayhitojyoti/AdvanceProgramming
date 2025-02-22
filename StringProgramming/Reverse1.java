package com.StringProgramming;

public class Reverse1 {

	public static void main(String[] args) {
		String s="java is easy";
		String [] str=s.split(" ");
		String temp="";
		for(int i=0;i<str.length;i++)
		{
			temp+=rev(str[i]);
			temp+=" ";
		}
		System.out.println(temp);
	}
	public static String rev(String s)
	{
		String temp="";
		for(int i=s.length()-1;i>=0;i--)
		{
			temp+=s.charAt(i);
		}
		return temp;
	}

}
/*package com.StringProgramming;

public class Reverse1 

    public static void main(String[] args) {
        String s = "java is easy";
        String[] str = s.split(" "); // Split by spaces to get words
        String temp = "";
        for (int i = 0; i < str.length; i++) {
            temp += rev(str[i]); // Reverse each word
            if (i != str.length - 1) {
                temp += " "; // Add space between words
            }
        }
        System.out.println(temp);
    }

    public static String rev(String s) {
        String temp = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            temp += s.charAt(i);
        }
        return temp;
    }
}
*/

