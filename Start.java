package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

import com.Student.manage.Student;
import com.Student.manage.StudentDao;

public class Start {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		
		System.out.println("Welcome to Student Management App");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		Scanner sc=new Scanner(System.in);
		while(true) {
			System.out.println("PRESS 1 TO ADD STUDENT");
			System.out.println("PRESS 2 TO DELETE STUDENT");
			System.out.println("PRESS 3 TO SHOW ALL STUDENT");
			System.out.println("PRESS 4 TO EXIT APP");
			System.out.println("PRESS 5 TO UPDATE STUDENT DETAIL");
			int choice=sc.nextInt();
			
			if(choice==1) {
				//add student
				System.out.println("Enter user name :");
				String name=br.readLine();
				
				System.out.println("Enter user phone :");
				String phone=br.readLine();
				
				System.out.println("Enter user city :");
				String city=br.readLine();
				
				Student st=new Student(name,phone,city);
				
				System.out.println(st.toString());
				boolean ans=StudentDao.insertStudentToDB(st);
				if(ans==true) {
					System.out.println("Student is added successfully");
					
				}
				else {
					System.out.println("Something went wrong !!!Try again");
				}
				
				
			}
			else if(choice==2) {
				
				System.out.println("Enter user id you want to delete :");
				int userId=Integer.parseInt(br.readLine());
				
				boolean f=StudentDao.deleteStudent(userId);
				if(f==true) {
					System.out.println("Userid deleted successfully");
				}
				else {
					System.out.println("Something went wrong...!");
				}
				
			}
			else if(choice==3) {
				
				StudentDao.showAllStudents();
				
			}
			else if(choice==4) {
				break;
			}
			else if(choice==5) {
				System.out.println("Enter the id you want to update :");
				int id=Integer.parseInt(br.readLine());
				
				System.out.println("Enter the new name :");
				String name=br.readLine();
				
				System.out.println("Enter the new Phoneno. : ");
				String phone=br.readLine();
				
				System.out.println("Entre the new city :");
				String city=br.readLine();
				
				boolean f=StudentDao.updateStudentDetail(id,name,phone,city);
				
				if(f==true) {
					System.out.println("Update happeed successfully");
				}
				else {
					
					System.out.println("Something went Wrong..... Please try again");
				}
				
			}
		}
		
		System.out.println("Thank You for using my application !");
		System.out.println("See you soon....... BYY BYY");
	}

}
