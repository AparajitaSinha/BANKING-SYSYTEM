import java.util.Scanner;

public class balance {
	public static void main(String []ar) {
		
		BankAccount obj1 = new BankAccount("JOHN","BA2200");
		obj1.showMenu();
		
	}

}

class BankAccount
{
	int bal;
	int previousTransaction;
	String customerName;
	String customerId;
	
	
	BankAccount(String cname, String cid)
	{
		customerName = cname;
		customerId = cid;
	}
	
	void deposit(int amount)
	{
		if(amount != 0)
		{
			bal = bal + amount;
			previousTransaction = amount;
		}
	}
	
	void withdraw(int amount)
	{
		bal = bal - amount;
		previousTransaction = -amount;
	} 
  
     void getPreviousTransaction()
     {
    	 if(previousTransaction > 0)
    	 {
    		 System.out.println("Deposited amoutn " + previousTransaction);
    	 }
    	 else if(previousTransaction < 0)
    	 {
    		 System.out.println("Withdrawn amount = " +Math.abs(previousTransaction));	 
    	 }
    	 else
    	 {
    		 System.out.println("No Transaction occured");
    	 }
     }
     void showMenu()
     {
    	 char option='\0';
    	 Scanner scanner = new Scanner(System.in);
    	 
    	 System.out.println("Welcome" +customerName);
    	 System.out.println("Your id" +customerId);
    	 System.out.println("\n");
    	 System.out.println("A. Check Balance");
    	 System.out.println("B. Deposit");
    	 System.out.println("C. Withdraw");
    	 System.out.println("D. Previous Transaction");
    	 System.out.println("E. Exit");
    	 
    	 do
    	 {
    		 System.out.println("****************************************");
    		 System.out.println("Select the option");
    		 System.out.println("*******************************************");
             option = scanner.next().charAt(0);
    		 System.out.println("\n");
    		 
    		 switch(option)
    		 {
    		 case 'A':
        		 System.out.println("-----------------------------");
        		 System.out.println("balance = " +bal);
        		 System.out.println("---------------");
        		 System.out.println("\n");
            	break;
            	
    		 case 'B':

        		 System.out.println("--------------");
        		 System.out.println("Enter an amount to deposit");
        		 System.out.println("-----------------");
                 int amount = scanner.nextInt();
                 deposit(amount);
        		 System.out.println("\n");
            	 break;
            	 
    		 case 'C':

        		 System.out.println("--------------");
        		 System.out.println("Enter an amount to withdraw");
        		 System.out.println("---------------");
        		 int amount2 = scanner.nextInt();
                 withdraw(amount2);      		
        		 System.out.println("\n");
            	break;
            	
    		 case 'D':

        		 System.out.println("---------");
        		 getPreviousTransaction();        		
        		 System.out.println("---------");
        		 System.out.println("\n");
            	break;
            	
    		 case 'E':

        		 System.out.println("---------");
        		 break;

            	
            default:
            	System.out.println("Invalid option is selelcted ! Please try agian later");
            	break;
    		 }  
    	 }while(option != 'E');	 
    		
          System.out.println("Thankyou for using our services");  	
    		 
        	
          	 		 
     	   	    	 
    	 
     }
}

