import java.util.*;
public class Hcricket 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		Hcricket hc=new Hcricket();
		Random r=new Random();
		System.out.println("HAND CRICKET : ");
		System.out.println();
		System.out.println("Enter Over(s) : ");
		int over=sc.nextInt();
		int balls=hc.over(over);
		int wct=hc.over(over);
		System.out.println("Enter Score : ");
		int score[]=new int[balls];
		int wkt[]=new int[wct];
		int run=0,itr=0,bl=0;
		for(int i=0;i<balls;i++)
		{
			score[i]=sc.nextInt();
			int sr=r.nextInt(6+1);
			System.out.println(sr);
			if(score[i]!=sr&&score[i]<=6)
			{
				run=hc.batbow(score[i],run);
				bl=hc.ball(bl);
				itr=hc.iter(itr);
			}
			if(score[i]==sr||score[i]>6)
			{
				bl=hc.ball(bl);
				itr=hc.iter(itr);
				break;
			}
			
		}
		int innings=run;
		int target=run+1;
		System.out.println("Score  : "+innings);
		System.out.println("Target : "+target);
		System.out.println("");
		System.out.println("Enter Score : ");
		int runn=0,itrn=0,bll=0;
		for(int i=0;i<wct;i++)
		{
			if(runn>=target)
			{
				System.out.println("------------------");
				System.out.println("Score : "+runn);
				System.out.println("Ball(s) left : "+(balls-bll));
				System.out.println("You Lose");
				break;
			}
			wkt[i]=sc.nextInt();
			int so=r.nextInt(6+1);
			System.out.println(so);
			if(wkt[i]!=so&&wkt[i]<=6)
			{
				runn=hc.bowbat(runn,so);
				bll=hc.ball(bll);
				itrn=hc.iter(itrn);
			}
			if(wkt[i]==so||wkt[i]>6)
			{
				bll=hc.ball(bll);
				itrn=hc.iter(itrn);
				break;
			}
			if(wct==bll)
			{
				break;
			}
		}	
		int diff=innings-runn;
		if(runn<target)
		{
			System.out.println("------------------");
			System.out.println("Score       :"+runn);
			System.out.println("Run(s) left :"+diff);
			System.out.println("** You Won **");
		}
		sc.close();
	}
	public int over(int b)
	{
		b=b*6;
		return b;
	}
	public int batbow(int r,int tot)
	{
		tot=tot+r;
		return tot;
	}
	public int bowbat(int tot,int r)
	{
		tot=tot+r;
		return tot;
	}
	public int ball(int b)
	{
		b=b+1;
		return b;
	}
	public int iter(int i)
	{
		i=i+1;
		return i;
	}
}