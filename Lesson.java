import java.util.*;


class RailwayTicket {
	String name;     //customer name
	int coachNo;    //customer coach
	long   mob;      //customer no
	int amt;         //ticket ammount
	int totalamt;    //updated ammount
	String coach;
	Scanner input = new Scanner(System.in);
	
	//To input name,coach,mob etc.
	public void accept() {
		System.out.println("Enter the name :");
		name = input.nextLine();
	    System.out.println("Select the coach : 1.First_AC 2.Second_AC 3.Third_AC 4.Sleeper");
		coach = input.nextLine();
	    System.out.println("Select the coach no : 1.First_AC 2.Second_AC 3.Third_AC 4.Sleeper");
        coachNo = input.nextInt();
		System.out.println("Enter the ticket ammount :");
		amt = input.nextInt();
		System.out.println("Enter the mobile no. :");
		mob = input.nextLong();

	}

	//To update ammount
	
	public void update() {

		switch (coachNo) {
			case 1:
				amt = amt + 700;
				break;
		 	case 2:
		 		amt = amt + 500;
		 		break;
		 	case 3:
		 		amt = amt + 250;
		 		break;
		 	case 4:
		 		amt = amt + 0;
		 		break;
		 	default:
		 	    System.out.println("Invalid");
		 	    break;
		}
	}  

	//To Display 
	public void display() {

		System.out.println("======================================");
		System.out.println("Customer Details");
		System.out.println("======================================");

		System.out.println("Customer Name : " + name);
		System.out.println("Mobile No :" + mob);
		System.out.println("Coach :" + coach);
		System.out.println("Total ammount  : Rs" + amt);
	} 
}
public class Lesson {
	public static void main(String args[]) {
		System.out.println("***** Welcome to the Eastern Railway *****");

		RailwayTicket EasternExpress102 = new RailwayTicket();
		EasternExpress102.accept();
		EasternExpress102.update();
		EasternExpress102.display();
	}
}