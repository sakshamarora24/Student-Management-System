package Student_Database_Management;
import java.util.*;
public class StudentDatabase
{
	public static void main(String[] args)
	{
		Scanner scan =new Scanner (System.in);
		try {
			//Total No. of Students to be Enrolled
			System.out.println("Enter No. of Students to be Enrolled:");
			int numofStudents= scan.nextInt();
			Student[] students=new Student[numofStudents];
			//Create Database of all Students one by one
			for(int i=0; i<numofStudents; i++)
			{
				students[i]=new Student();
				students[i].enroll();
				students[i].paytution();
				System.out.println(students[i].toString());
			}
			
			
		}catch(Exception e) {
			return;
		}
		finally {
			scan.close();
		}
	}
}
