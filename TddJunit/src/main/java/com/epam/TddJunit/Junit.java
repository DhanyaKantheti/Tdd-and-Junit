    package com.epam.TddJunit;
	//import java.util.*;


	public class Junit {
		public static String remove(String str)
		{
			    if(str.equals("AA"))
			    	return "";
				else{
				
				if(str.charAt(1)=='A' && str.charAt(0)!='A')
					return String.valueOf(str.charAt(0));
				else if(str.charAt(0)=='A' && str.charAt(1)!='A')
					return String.valueOf(str.charAt(1));
				else
					return str;
				}
			
				
		}
		public String mainn(String str) {
		    //Scanner sc=new Scanner(System.in);
		    //String str=sc.next();
			String str1=new String();
			String str2=new String();
			String res=new String();
			if(str.length()==0)
				return " ";
			else if(str.length()==1) {
				if(str.equals("A"))
					return "";
				else
				    return str;
			}
			else{
			str1=str.substring(0,2);
			str2=str.substring(2,str.length());
			res=remove(str1);
			
			return res+str2;
			
		}

	}
	}



