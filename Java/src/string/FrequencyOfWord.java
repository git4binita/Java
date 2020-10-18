package string;

import java.util.ArrayList;

//import linkedList.Insertion.Node;

public class FrequencyOfWord 
{
	

	public ArrayList toArraylist(String s1)
	{
		int max;
		String temp, substring="";
		ArrayList<String> sub = new ArrayList<String>();
		
		System.out.print("length="+s1.length());
		for(int i=0;i<s1.length();i++)
		{
			
			if(s1.charAt(i)!=' ')
			{
				substring=substring.concat(Character.toString(s1.charAt(i)));
				
				//continue;
			}
			if(s1.charAt(i)==' '||i==s1.length()-1)
			{
				sub.add(substring);
				substring="";
				// System.out.println(i +" substring=	" +sub);
			}
			
			
		}
		 System.out.println(sub);
		 return sub;
	}
	
	
	public static void main(String[] args) 
	{
		FrequencyOfWord obj = new FrequencyOfWord();
		String s1=new String("aaa bbb ccc aaa ccc aaa bbb ccc");
		String ss="ccc";
		ArrayList <String> al=obj.toArraylist(s1);
		
		for(int i=0;i<al.size();i++)
		{
			int count=1;
			for(int j=i+1;j<al.size();j++)
			{
				
				if(al.get(i).contains(al.get(j)))
				{
					
					count++;
					//al.remove(i);
					al.remove(j);
				}
			}
			
			System.out.println(al.get(i)+": "+count);
			al.remove(i);
			
		}

	}

}
