// -------------------------------------------------------------------------------------------
// Assignment ( 4 )
// Written by: ( JAD ARAMOUNI 40244750 ; ADAM CHAMI 40248165 )
// For COMP 248 Section ( R ) – Fall 2022
// -------------------------------------------------------------------------------------------

//The HouseholdBudget class is the one mainly used in the driver class. It combines the two earlier classes to create methods that will
// be used for each case in the driver.

public class HouseholdBudget {

	private Fund funds;
	private Expense[] expenses;

	//Constructors
	
	public HouseholdBudget() //default constructor
	{
		this.funds = new Fund();
		this.expenses = null;
	}
	
	public HouseholdBudget(Fund funds, Expense[] expenses) { //initial value constructor
		this.funds = funds;
			this.expenses = expenses;
	}
	
	
	//Verifies if total value of funds of householdbudget objects is equal
	public boolean equalFunds(Fund obj1, Fund obj2)
	{
		return (obj1.fundTotal() == obj2.fundTotal());
	}
	
	//Verifies if number of fund types of householdbudget objects is equal
	public boolean equalTypes(Fund obj1, Fund obj2)
	{
		return(obj1.getToonies()==obj2.getToonies()&&
				obj1.getLoonies()==obj2.getLoonies()&&
				obj1.getBill5$()==obj2.getBill5$()&&
				obj1.getBill10$()==obj2.getBill10$()&&
				obj1.getBill20$()==obj2.getBill20$());
	}
	
	public int totalHouseholdFunds() //views the total funds in a household
	{
		return funds.fundTotal();
	}
	
	public int numberOfExpenses() //returns the amount of expense
	{
		if (expenses == null) // returns 0  if no expenses
			return 0;
		else
			return(expenses.length);
	}
	
	public int addExpense(Expense anExpense) //adds new expense in the array of expenses
	{
		Expense[] temp = new Expense[this.expenses.length+1]; //created new Expense array with 1 extra element and assigns new expense to the element
		for (int i = 0; i<temp.length-1;i++) {
			temp[i]= expenses[i];
		}
		temp[temp.length-1]= anExpense;
		this.expenses=temp;
		
		return(expenses.length);
	}
	
	public boolean removeExpense(int index) //removes expense from the array of expenses
	{
		if (expenses.length <= 0 || index >= expenses.length)
			return false;
		else
		{
			Expense[] temp = new Expense[this.expenses.length-1];
			
			for (int i = 0; i<index;i++) { //creates new Expense array including everything from before and after the expense we want to remove
				temp[i]= expenses[i];
			}
			for (int i = index+1; i<temp.length;i++) {
				temp[i]= expenses[i];
			}
		this.expenses=temp; //returns true if the expense has been removes, so if there were any expenses in the hhb to begin with
		return true;
		}
	}
	
	public void updateDueDate(int index,int day,int month) //updates due day and month to a certain expense (index)
	{
		Expense theExpense = expenses[index]; //chooses which expense to update
		
		theExpense.setPayementDueDay(day);
		theExpense.setPayementDueMonth(month);
		expenses[index]=theExpense;
		
	}
	
	public int addingFunds(int addedLoonies,  int addedToonies, int addedBills5$,int addedBills10$,int addedBills20$) //adds new funds
	{
		this.funds.setLoonies(this.funds.getLoonies()+addedLoonies); //updates each fund type
		this.funds.setToonies(this.funds.getToonies()+addedToonies);
		this.funds.setBill5$(this.funds.getBill5$()+addedBills5$);
		this.funds.setBill10$(this.funds.getBill10$()+addedBills10$);
		this.funds.setBill20$(this.funds.getBill20$()+addedBills20$);
		return(this.funds.fundTotal()); //returns total amount of money
	}
	
	public boolean equals(HouseholdBudget obj2) //sees if total amount is equal and if number of expenses is same
	{
		return(this.funds.fundTotal() == obj2.funds.fundTotal() && this.expenses.length == obj2.expenses.length);
	}

	
	public String toString() //describes all the hhb
	{
		String str = new String();
		if (this.expenses == null) //if a hhb has none, it notices and writes no expense
			str = "No Expenses";
			
		else
		for(int i=0;i<this.expenses.length;i++)
			str += this.expenses[i].toString()+"\n";
		
		return(funds.toString()+"\n"+ str); //returns the funds description and expense description
	}
	
	public String fundsSummary() //describes how many of each type of money we have
	{
		return("(" + funds.getLoonies() + " x $1) + (" + funds.getToonies() + " x $2) + (" 
	+ funds.getBill5$() + " x $5) + (" + funds.getBill10$() + " x $10) + (" + funds.getBill20$() + " x $20)");
	}
	
}
