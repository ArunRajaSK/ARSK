package point;

public class Mockone
{
	public static void main(String args[])
	{
		String str="I am Arun from Chennai";
		String words[]=str.split(" ");
		for(int i=0;i<words.length;i++)
		{
			String word=words[i];
			char ch[]=word.toCharArray();
			if(ch[0]=='A'||ch[0]=='E'||ch[0]=='I'||ch[0]=='O'||ch[0]=='U'||ch[0]=='a'||ch[0]=='e'||ch[0]=='i'||ch[0]=='o'||ch[0]=='u')
			{
			}
			else
			{
				System.out.println(word);
			}
		}
	}
}
