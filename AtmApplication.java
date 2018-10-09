import java.util.Scanner;
public class AtmApplication {
	/**properties setPin deposit check balance withdraw transfer Recharges a phone 
	int deposit;
	int enterPin;
	double checkBalances;
	*/
	private static Scanner input;
	private static int mPin = 0012;
	private static float balance =2000;
	private static int nextTransaction;
	
	
	
	
	public static void main(String []agrs){
		 input = new Scanner(System.in);
			transaction();
			checkInput();
			
		
	}
	private static void transaction(){
		int select;
		System.out.println("Welcome to\nUBA!");
		System.out.println("Choose your transaction");
		System.out.println(1+" "+"Enter your pin:");
		System.out.println(2+" "+"withdraw");
		System.out.println(3+" "+"deposit");
		System.out.println(4+" "+"check balance");
		System.out.println(5+" "+"others");
		select= input.nextInt();
		
		
		switch(select){
		case 1:
			//int pin;
			System.out.println("Enter your four digit pin here:");
			//pin = input.nextInt();
			checkInput();
			nextTransaction();
			/*if(pin == inPin){
				System.out.println("Start your transaction");
				nextTransaction();
			}else if(pin != inPin){
				System.out.println("Your pin is incorrect");
				nextTransaction();*/
			//}
				
			
		
		case 2:
			float amount;
			System.out.println("Please Enter amount to withdraw:");
			amount=input.nextFloat();
			if(amount < balance || amount ==2000){
				System.out.println("You have sufficient fund\n\n");
				balance = balance -amount;
				System.out.println("You have withdraw" + " " + amount+" " + "and your new balance is" +" "+balance+"\n");
				nextTransaction();
				
			/*}else if(amount > balance){
				System.out.println("Insufficient fund\n\n");
				anotherTransaction();*/
			}/*else{
				balance = balance -amount;
				System.out.println("You have withdraw" + amount+ "and your new balance is" +" "+balance+"\n");
				checkBalance();
				nextTransaction();
			}*/
			break;
			
			case 3:
				//option number 3 is for deposit
				float deposit;
				System.out.println("Pleease enter amount you wish to deposit");
				deposit = input.nextFloat();
				balance = deposit + balance;
				System.out.println("you have deposited"+ " " +deposit+ " " +"New balance is" +" "+balance+"\n");
				
				nextTransaction();
			
			break;
			case 4:
				//option 3 is for check balance
				System.out.println("Your balance is" +balance+ "\n" );

				nextTransaction();
			break;
			
			default:
				System.out.println("Invalid option: \n\n ");
				break;
		}
		 
	}
	private static void nextTransaction(){
		System.out.println("Do you want transaction?\n\npress 1 for another transaction\n2 To exit");
		nextTransaction = input.nextInt();
		if(nextTransaction == 1){
			transaction();//call transaction method
		}else if(nextTransaction ==2){
			System.out.println("Thanks for banking with us");
			//nextTransaction();
		}else{
			System.out.println("Invalid selection \n\n");
			nextTransaction();
		}
			
			
	}
	
	private static void checkInput(){
		int number ;
		number = input.nextInt();
		if(number == mPin){
			System.out.println("Start your transaction");
			//nextTransaction();
		}else if(number != mPin){
			System.out.println("Invalid pin");
		
		}else{
			System.out.println("Try again");
		}
	
	
	
	
	}
}
