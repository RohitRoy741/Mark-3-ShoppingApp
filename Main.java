import java.util.Scanner;
class Main
{
	public static void main(String[] args) {
		DatabaseCustomer u = new DatabaseCustomer();
		String username, password,name;
		int choice;
		System.out.println("1.Login\n2.Signup");
		System.out.println("Enter your choice:");
		Scanner sc =new Scanner(System.in);
		choice = sc.nextInt(); 
		if(choice==1)
		{
			System.out.print("Enter Username:");
			username = sc.nextLine();
			username = sc.nextLine();
			System.out.print("Enter password:");
			password = sc.nextLine();
			u.login(username,password);
			
		}
		else
		{
			System.out.println("Enter your name:");
			name = sc.nextLine();
			name = sc.nextLine();
			System.out.print("Enter Username:");
			username = sc.nextLine();
			System.out.print("Enter password:");
			password = sc.nextLine();
			u.Signup(name,username,password);
		}

	}
}