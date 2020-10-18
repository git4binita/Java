package string;

public class ReverseString 
{

	public void reverse(String s)
	{
		char [] c=s.toCharArray();
		char temp;
		int left,right=s.length()-1;
		for(left=0;left<right;left++, right--)
		{
			//System.out.println("in reverse");
			temp=c[left];
			c[left]=c[right];
			c[right]=temp;
			
		}
		
		System.out.println(c);
	}
	public static void main(String[] args) 
	{
		String s="Hello World!!";
		ReverseString rs=new ReverseString();
		rs.reverse(s);

		
	}

}
