package client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import Dao.StudentDao;
import service.Student;

public class MainMenu {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true) {
			//add student
			System.out.println("PRESS 1 to ADD student");
			System.out.println("PRESS 2 to Delete student");
			System.out.println("PRESS 3 to display student");
			System.out.println("PRESS 4 to exit studentApp");
			int c = Integer.parseInt(br.readLine());
			if(c == 1) {
				System.out.println("Enter user name");
				String name = br.readLine();
				
				System.out.println("Enter user phone : ");
				String phone = br.readLine();
				
				System.out.println("Enter user city");
				String city = br.readLine();
				
				Student st = new Student (name, phone, city);
				boolean answer = StudentDao.insertStudentToDB(st);
				if(answer) {
					System.out.println("Student is added successfully..");
				
				} else
				{
					System.out.println("Something  went wrong..");
				}
				
				System.out.println(st);
				
				
				
			} else if (c == 2) {
				System.out.println("Enter student id to delete: ");
				int userId = Integer.parseInt(br.readLine());
				boolean f = StudentDao.deleteStudent(userId);
				if(f) {
					System.out.println("Deleted...");
				} else
				{
					System.out.println("Something went wrong");
				}
				//delete student
			} else if (c == 3) {
				StudentDao.showAllStudent();
				
			} else if (c == 4) {
				//exit
				break;
			} else {
				
			}
			
		
		// TODO Auto-generated method stub

	}
		System.out.println("Thankyou for using my application...");
		System.out.println("See you soon...");

}
}
