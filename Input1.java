package Pack;
import java.util.Scanner;
public class Input1 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.out.println("** STUDENT DETAILS	**");
		System.out.println(" BASIC DETAILS ");
		int regno,sem=1,marks,total=0;
		float percent;
		long phno;
		char grade=' ';
		String name="",course="",mailid="";
		Scanner s=new Scanner(System.in);
		System.out.println("Enter your Regno    	:");
		regno=s.nextInt();
		
		System.out.println("Enter your Name     	:");
		name=s.next();
		s.nextLine();
		
		System.out.println("Enter your Course   	:");
		course=s.next();
		s.nextLine();
		System.out.println("Enter your Phone Number :");
		phno=s.nextLong();
		
		System.out.println("Enter your Mail ID		:");
		mailid=s.next();
		s.nextLine();
		
		System.out.println("REGISTRATION NUMBER  :"+regno);
		System.out.println("STUDENT NAME         :"+name);
		System.out.println("STUDENT COURSE       :"+course);
		System.out.println("PHONE NUMBER         :"+phno);
		System.out.println("MAIL ID              :"+mailid);
		System.out.println(" ACADEMIC DETAILS ");
		
		if((course.equals("BA"))||(course.equals("BBA"))||(course.equals("BCA"))||(course.equals("BSC"))||(course.equals("MCA")))
		{
			sem=6;
		}
		else if((course.equals("BE"))||(course.equals("BTECH")))
		{
			sem=8;
		}
		else if((course.equals("MSC"))||(course.equals("ME"))||(course.equals("MTECH")))
		{
			sem=4;
		}
		else
		{
			System.out.println("INVALID COURSE");
		}
		for(int num=1;num<=sem;num++)
		{
			System.out.println("Enter the"+num+"Semester Marks :");
			marks=s.nextInt();
			total=total+marks;
		}			
		percent=total/sem;
		System.out.println("TOTAL MARKS    :"+total);
		System.out.println("PERCENTAGE     :"+percent);
		if(percent>=90)
		{
			grade='O';
			System.out.println("Grade :"+grade);
		}
		else if(percent>=80)
		{
			grade='A';
			System.out.println("Grade :"+grade);
		}
		else if(percent>=70)
		{
			grade='B';
			System.out.println("Grade :"+grade);
		}
		else if(percent>=60)
		{
			grade='C';
			System.out.println("Grade :"+grade);
		}
		else if(percent>=50)
		{
			grade='D';
			System.out.println("Grade :"+grade);
		}
		else if(percent>=40)
		{
			grade='E';
			System.out.println("Grade :"+grade);
		}
		else if(percent<40)
		{
			grade='F';
			System.out.println("Grade :"+grade);
		}
		else
		{
			grade='-';
			System.out.println("Grade :"+grade);
		}
	s.close();	
	}
}
