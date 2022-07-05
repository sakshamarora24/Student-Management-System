package Student_Database_Management;

import java.util.Scanner;

public class Student
{
	private String firstName;
	private String lastName;
	private int gradeYear;
	private String studentID;
	private String courses="";
	private int tutionBalance=0;
	private static int id=1000;
	
	//Constructor to prompt Student's name and details
	public Student()
	{
		Scanner in=new Scanner(System.in);
		System.out.print("Student's First Name:\t");
		this.firstName=in.nextLine();
		System.out.print("Student's Last Name: \t");
		this.lastName=in.nextLine();
		System.out.println(" 1.Freshmen\n 2.Sophomore\n 3.Junior\n 4.Senior");
		System.out.print("Enter Current Grade Year of study:\t");
		this.gradeYear=in.nextInt();
		setID();
		in.close();
	}
	
	//Generate an unique Student ID
	private void setID()
	{
		id++;
		this.studentID= gradeYear+"0"+id;
	}
	
	//Details and prices of courses
	private void courses()
	{
		System.out.println("List of courses with their respective Codes and Prices\n");
		System.out.println("English                       1001               6,000");
		System.out.println("Mathematics                   1002               8,000");
		System.out.println("Science                       1003               10,000");
		System.out.println("Geopgraphy                    1004               4,000");
		System.out.println("History                       1005               5,000");
	}
	
	//Enroll in desired courses
	public void enroll()
	{
		Scanner sc=new Scanner(System.in);
		courses();
		System.out.println("Enter desired code to enroll or Enter Q to quit!");
		do {
			String course=sc.nextLine();
			if(course.equalsIgnoreCase("Q"))
			{
				System.out.println("BREAK!");
				break;
			}
			else
			{
				char c=course.charAt(3);
				
				switch(c)
				{
				case '1':
				{
					courses = courses +"\n English";
					tutionBalance = tutionBalance + 6000;
					System.out.println("Successfully Enrolled in English!");
					break;
				}
				case '2':
				{
					courses = courses +"\n Mathematics";
					tutionBalance = tutionBalance + 8000;
					System.out.println("Successfully Enrolled in Mathematics!");
					break;
				}
				case '3':
				{
					courses = courses +"\n Science";
					tutionBalance = tutionBalance + 10000;
					System.out.println("Successfully Enrolled in Science!");
					break;
				}
				case '4':
				{
					courses = courses +"\n Geography";
					tutionBalance = tutionBalance + 4000;
					System.out.println("Successfully Enrolled in Geography!");
					break;
				}
				case '5':
				{
					courses = courses +"\n History";
					tutionBalance = tutionBalance + 5000;
					System.out.println("Successfully Enrolled in History!");
					break;
				}
				default:
				{
					System.out.println("Entered wrong code! Please enter again.");
					break;
				}
				}
			}
			
			sc.close();
		}while(1!=0);
	}
	
	//View balance of course fees
	public void viewBalance()
	{
		System.out.println("Your Balance fees is: ₹"+tutionBalance);
	}
	
	//Pay Tuition Fees for the courses enrolled
	public void paytution()
	{
		viewBalance();
		Scanner in=new Scanner(System.in);
		System.out.print("Enter amount to be deposited:\t");
		int payment=in.nextInt();
		tutionBalance= tutionBalance - payment;
		System.out.println("Thank You for your payment of ₹"+payment);
		viewBalance();
		
		in.close();
	}
	
	//Show Status of the Student
	public String toString()
	{
		return " Name: "+firstName+" "+lastName+
			   "\n Student ID: "+studentID+
			   "\n Grade Year: "+gradeYear+
			   "\n Courses Enrolled: "+courses+
			   "\n Balance Fees: ₹"+tutionBalance;
	}
}
