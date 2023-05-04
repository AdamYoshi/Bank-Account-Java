// -------------------------------------------------------------------------------------------
// Assignment ( 4 )
// Written by: ( JAD ARAMOUNI 40244750 ; ADAM CHAMI 40248165 )
// For COMP 248 Section ( R ) – Fall 2022
// -------------------------------------------------------------------------------------------

/*This program allows the user to manage his money. The user is able to enter what funds he has and what he has to pay, his expenses
To make things more simple, a user is able to precisely describe each fund and expense by writting how many of each type of money he has, and
by writing whom he owes the money to and what day he has to give it back, along with the amount due and the type of expense.
In this program, the user can also add expenses, add funds, remove expenses, etc.
This program has many householdbudgets each containing funds and expenses, and the user can compare the funds/expenses of each of these households.
*/

import java.util.Scanner;

public class BudgetDemo {

	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n");
		System.out.println("Welcome to COMP248 Geek's HouseholdBudget_2022 Application");
		System.out.println("\n+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		
		
		//householdbudget 1
		Fund fund1 = new Fund(1,2,3,4,5); //creates new fund class to be used by householdbudget 1
		Expense expense1 = new Expense("Food", 21, "Poulet Rouge", 2, 25); //creates new expense to be used by hhb1
		Expense[] expenseArray1 = new Expense[1]; //new array containing expenses
		expenseArray1[0] = expense1; //adding expense 1 to array
		HouseholdBudget hhb1 = new HouseholdBudget(fund1, expenseArray1); //new housholdbudget containing fund and array of expense
		
		//householdbudget 2, same as hhb1
		Fund fund2 = new Fund(1,2,3,4,5); 
		Expense[] expenseArray2 = new Expense[1];
		Expense expense2 = new Expense("Food", 13, "Shawarmaz", 2, 28);
		expenseArray2[0] = expense2;
		HouseholdBudget hhb2 = new HouseholdBudget(fund2, expenseArray2);
		
		//householdbudget 3
		Fund fund3 = new Fund(1,2,3,0,7); 
		Expense expense31 = new Expense("Food", 40, "Poulet Vert", 8, 5);
		Expense expense32 = new Expense("Food", 31, "Poulet Jaune", 3, 15);
		Expense expense33 = new Expense("Food", 111, "Poulet Bleu", 6, 25);
		Expense[] expenseArray3 = {expense31,expense32,expense33};
		HouseholdBudget hhb3 = new HouseholdBudget(fund3, expenseArray3);
		
		//householdbudget 4
		Fund fund4 = new Fund(9,8,1,4,1); 
		Expense expense4 = null;
		Expense[] expenseArray4 = null;
		HouseholdBudget hhb4 = new HouseholdBudget(fund4, expenseArray4);
		
		//householdbudget 5
		Fund fund5 = new Fund(9,8,1,4,1); 
		Expense expense5 = null;
		Expense[] expenseArray5 = null;
		HouseholdBudget hhb5 = new HouseholdBudget(fund5, expenseArray5);
		
		HouseholdBudget[] hhbArray = {hhb1,hhb2,hhb3,hhb4,hhb5}; //an array containing all the earlier householdbudgets
		
		int code = 1;
		while (code != 0) //as long as user doesn't input 0, the program will keep asking him to input a code
		{
		
		System.out.println("\nWhat would you like to do?");
		System.out.println("  1. See the possessions of all householdBudgets");
		System.out.println("  2. See the possessions of one householdBudget");
		System.out.println("  3. List householdBudgets with same total amount of fund");
		System.out.println("  4. List householdBudgets with same fund denomination(s)");
		System.out.println("  5. List householdBudgets with same total amount of fund and same number of expenses");
		System.out.println("  6. Add an expense to an existing householdBudget");
		System.out.println("  7. Remove an existing expense from a householdBudget");
		System.out.println("  8. Update the payment due date of an existing expense");
		System.out.println("  9. Add fund to a householdBudget");
		System.out.println("  0. To quit");
		
		System.out.print("\nPlease enter you choice and press <Enter>:");
		code = keyboard.nextInt();
		
		switch (code) { //info for each code shows up depending on what user inputs
			case 1: //describes funds and expenses of each householdbudget
				System.out.println("Content of each HouseholdBudget:");
				System.out.println("---------------------");
				
				System.out.println("HouseholdBudget #0:");
				System.out.println(hhb1.fundsSummary());
				System.out.println(hhb1.toString());
				
				System.out.println("HouseholdBudget #1:");
				System.out.println(hhb2.fundsSummary());
				System.out.println(hhb2.toString());
				
				System.out.println("HouseholdBudget #2:");
				System.out.println(hhb3.fundsSummary());
				System.out.println(hhb3.toString());
				
				System.out.println("HouseholdBudget #3:");
				System.out.println(hhb4.fundsSummary());
				System.out.println(hhb4.toString());
				
				
				System.out.println("HouseholdBudget #4:");
				System.out.println(hhb5.fundsSummary());
				System.out.println(hhb5.toString());
				break;
			
			case 2: //Does the same thing as code 1, but instead only sees the possessions of the householdbudget the user chooses
				System.out.print("Which HouseholdBuget do you want to see the possessions of? (Enter number 0 to 4): ");
				int HouseholdBudgetNbr = keyboard.nextInt();
				while (HouseholdBudgetNbr < 0 || HouseholdBudgetNbr > 4)
				{
					System.out.println("Sorry, but there is no HouseholdBudget number " + HouseholdBudgetNbr);
					System.out.print("--> Try again: (Enter number 0 to 4: ");
					HouseholdBudgetNbr = keyboard.nextInt();
					System.out.println();
				}
				
				switch (HouseholdBudgetNbr) //depending on which household the user choses
				{
					case 0: //shoe hhb1
						System.out.println("HouseholdBudget #0:");
						System.out.println(hhb1.fundsSummary());
						System.out.println(hhb1.toString());
						break;
				
					case 1: //show hhb2
						System.out.println("HouseholdBudget #1:");
						System.out.println(hhb2.fundsSummary());
						System.out.println(hhb2.toString());
						break;
				
					case 2: //show hhb3
						System.out.println("HouseholdBudget #2:");
						System.out.println(hhb3.fundsSummary());
						System.out.println(hhb3.toString());
						break;
				
					case 3: //hhb4
						System.out.println("HouseholdBudget #3:");
						System.out.println(hhb4.fundsSummary());
						System.out.println(hhb4.toString());
						break;
				
					case 4: //hhb5
						System.out.println("HouseholdBudget #4:");
						System.out.println(hhb5.fundsSummary());
						System.out.println(hhb5.toString());
						break;
				}
				
				break;
			
			case 3: //list hhbs with same TOTAL fund
				System.out.println("List of HouseholdBudgets with same total fund: ");
				for(int i=0; i<4; i++)
				{
					
					for(int j=4; j>i; j--) //finds which ones have the same total using totalhhfunds method
						{
						if (hhbArray[i].totalHouseholdFunds() == hhbArray[j].totalHouseholdFunds())
							System.out.println("HouseholdBudgets " + i + " and " + j + " both have " + hhbArray[i].totalHouseholdFunds());
						}
					
				}
				break;
			
			case 4: //list household budgets with same amount of each loonies, toonies, etc.
				System.out.println("List of HouseholdBudgets with same Fund denomination:\n");
				for(int i=0; i<4; i++) //compares each householdbudget fund so it can see which have same denomination
				{
					
					for(int j=4; j>i; j--)
						{
						if (hhbArray[i].fundsSummary().equals(hhbArray[j].fundsSummary()))
							System.out.println("HouseholdBudgets " + i + " and " + j + " both have " + hhbArray[i].fundsSummary());
						}
					
				}
				
				break;
			
			case 5: //similar to case 3, but this time we also have to make sure the hhbs have same amount of expenses, using numberOfExpenses method
				System.out.println("List of HouseholdBudgets with same amount of money and same number of expenses:\n");
				for(int i=0; i<4; i++) //like before, we use loops to go through all the combinations of hhbudgets in order to find which are similar
				{
					
					for(int j=4; j>i; j--)
						{
						if ((hhbArray[i].totalHouseholdFunds() == hhbArray[j].totalHouseholdFunds()) && (hhbArray[i].numberOfExpenses() == hhbArray[j].numberOfExpenses()))
							System.out.println("HouseholdBudgets " + i + " and " + j);
						}
					
				}
				break;
			
			case 6: //adding expenses to a householdbudget
				System.out.print("Which HouseholdBudget do you want to add an Expense to? (Enter number 0 to 4): ");
				int HouseholdBudgetNbr2 = keyboard.nextInt();
				while (HouseholdBudgetNbr2 < 0 || HouseholdBudgetNbr2 > 4) //if ever user inputs invalid integer, program asks user to try again
				{
					System.out.println("Sorry, but there is no HouseholdBudget number " + HouseholdBudgetNbr2); //changes according to user input
					System.out.print("--> Try again: (Enter number 0 to 4: ");
					HouseholdBudgetNbr2 = keyboard.nextInt();
					System.out.println();
				}
				
				System.out.println("Please enter the following information so that we may complete the expense-"); //prompts info on expense
				
				System.out.print(" --> Type of expense (Bill, Purchase, etc.): ");
				String TypeExpense = keyboard.next();
			
				System.out.print("\n --> Amount of the expense: ");
				double AmountExpense = keyboard.nextDouble();
				
				System.out.print("\n --> Name of the business: ");
				String BusinessName = keyboard.next();
				
				System.out.print("\n --> Payment due day number and month (separated by a space): ");
				int dueDay = keyboard.nextInt();
				int dueMonth = keyboard.nextInt();
				
				Expense temp = new Expense(TypeExpense, AmountExpense, BusinessName, dueMonth, dueDay); //creates new expense using earlier info
				hhbArray[HouseholdBudgetNbr2].addExpense(temp); //adds this expense using method addExpense
				System.out.println("\nYou now have " + hhbArray[HouseholdBudgetNbr2].numberOfExpenses() + " expense(s)"); //tells user how many expenses in hhb chosen
				
				break;
			
			case 7: //removes an expense
				System.out.print("Which HouseholdBudget do you want to remove an expense from? (Enter number 0 to 4): ");
				int HouseholdBudgetNbr3 = keyboard.nextInt();
				while (HouseholdBudgetNbr3 < 0 || HouseholdBudgetNbr3 > 4) //so user doesn't enter invalid hhb number
				{
					System.out.println("Sorry, but there is no HouseholdBudget number " + HouseholdBudgetNbr3);
					System.out.print("--> Try again: (Enter number 0 to 4) ");
					HouseholdBudgetNbr3 = keyboard.nextInt();
					System.out.println();
				}
				
				if (hhbArray[HouseholdBudgetNbr3].numberOfExpenses() > 0) //if householdbudget has any expnse
				{
					System.out.print("Enter number from 0 to " + (hhbArray[HouseholdBudgetNbr3].numberOfExpenses()-1) + " :");
					
					int expNbr = keyboard.nextInt();
					if (hhbArray[HouseholdBudgetNbr3].removeExpense(expNbr)) //chooses which xpense to remove
						System.out.println("\nExpense was removed successfully");
					else
						System.out.println("\nSorry, that HouseholdBudget has no expenses");
				}
				
				else //if hhb has no expense
					System.out.println("\nSorry, that HouseholdBudget has no expenses");
				
				
				break;
			
			case 8: //updates expenses due date using updateDueDate method
				System.out.print("Which HouseholdBudget do you want to update an expense from? (Enter number 0 to 4): "); 
				int HouseholdBudgetNbr4 = keyboard.nextInt();
				while (HouseholdBudgetNbr4 < 0 || HouseholdBudgetNbr4 > 4) //if valid hhb choice
				{
					System.out.println("Sorry, but there is no HouseholdBudget number " + HouseholdBudgetNbr4);
					System.out.print("--> Try again: (Enter number 0 to 4): ");
					HouseholdBudgetNbr4 = keyboard.nextInt();
					System.out.println();
				}
				
				
				System.out.print("Enter number from 0 to " + (hhbArray[HouseholdBudgetNbr4].numberOfExpenses()-1) + " :");
				int updateExp = keyboard.nextInt();
				while (updateExp < 0 || updateExp > hhbArray[HouseholdBudgetNbr4].numberOfExpenses()-1) //if invalid expense hoice
				{
					System.out.println("Sorry, but there is no expense number " + updateExp);
					System.out.print("--> Try again: ");
					updateExp = keyboard.nextInt();
					System.out.println();
				}
				
				System.out.print("\n --> Enter new payment due day number and month (separated by a space): "); //prompts new date
				int newDueDay = keyboard.nextInt();
				int newDueMonth = keyboard.nextInt();
				hhbArray[HouseholdBudgetNbr4].updateDueDate(updateExp, newDueDay, newDueMonth); //adds new date to expense
				System.out.println("\nDue Date updated.");

				break;
			
			case 9: //adds funds
				System.out.print("Which HouseholdBudget do you want to add Fund to? (Enter number 0 to 4): ");
				int HouseholdBudgetNbr5 = keyboard.nextInt();
				while (HouseholdBudgetNbr5 < 0 || HouseholdBudgetNbr5 > 4) //if valid hhb choice
				{
					System.out.println("Sorry, but there is no HouseholdBudget number " + HouseholdBudgetNbr5);
					System.out.print("--> Try again: (Enter number 0 to 4: ");
					HouseholdBudgetNbr5 = keyboard.nextInt();
					System.out.println();
				}
				
				System.out.println("How many loonies, toonies, 5$, 10$ and 20$ bills do you want to add?");
				System.out.print("Enter 5 numbers separated by a space:"); //number of each money type
				int nbr1 = keyboard.nextInt();
				int nbr2 = keyboard.nextInt();
				int nbr3 = keyboard.nextInt();
				int nbr4 = keyboard.nextInt();
				int nbr5 = keyboard.nextInt();
				
				hhbArray[HouseholdBudgetNbr5].addingFunds(nbr1, nbr2, nbr3, nbr4, nbr5); //adds funds written by user
				
				System.out.println("You now have $" + hhbArray[HouseholdBudgetNbr5].totalHouseholdFunds()); //tells user new total funds
				
				break;
			
			default: //in case the user enters any invalid code
				System.out.println("Sorry, that is not a valid choice. Try again");
				break;
			
			case 0: //quits program
				System.out.println("Thank you for using COMP248 Geek's HouseholdBudget application!");
				break;
		
		
			}
		
		
		}
		
		keyboard.close();
	}
}
