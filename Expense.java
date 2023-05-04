// -------------------------------------------------------------------------------------------
// Assignment ( 4 )
// Written by: ( JAD ARAMOUNI 40244750 ; ADAM CHAMI 40248165 )
// For COMP 248 Section ( R ) – Fall 2022
// -------------------------------------------------------------------------------------------

//The Expense class will be used in the householdbudget class as well. 
//Its methods are mainly related to adding expenses and describing their aspects like business name, amount, etc.

public class Expense {
	
	
	private String expenseType;
	private double amount;
	private String buisnessName;
	private int payementDueMonth;
	private int payementDueDay;
	
	//Constructors
	
	public Expense(String expenseType, double amount, String buisnessName, int payementDueMonth,int payementDueDay)
	{
		// Setting month due
		if (payementDueMonth <13 && payementDueMonth  > 0) //if invalid month, set to 0
			this.payementDueMonth = payementDueMonth;
		else this.payementDueMonth = 0;
		
		// Setting day due
		if (payementDueDay <32 && payementDueDay  > 0) //if invalid day, set to 0
			this.payementDueDay = payementDueDay;
		else this.payementDueDay = 0;
		
		// Setting expenseType
		this.expenseType = expenseType;
		
		// Setting buisnessName
		this.buisnessName = buisnessName;
		
		// Setting the amount due
		this.amount = amount;
		
	}	
	 
	public Expense() //default constructor
	{
		this.payementDueMonth = 0;
		this.payementDueDay = 0;
		this.expenseType = null;
		this.buisnessName = null;
		this.amount = 0.0;
		
	}
	
	public Expense(Expense anExpense) //copy constructor
	{
		this.payementDueMonth = anExpense.payementDueMonth;
		this.payementDueDay = anExpense.payementDueDay;
		this.expenseType = anExpense.expenseType;
		this.buisnessName = anExpense.buisnessName;
		this.amount = anExpense.amount;
	}

	public int getPayementDueMonth() { //accessor method
		return payementDueMonth;
	}

	public void setPayementDueMonth(int payementDueMonth) { //mutator method
		if (payementDueMonth < 13 && payementDueMonth > 0)
			this.payementDueMonth = payementDueMonth;
		else this.payementDueMonth = 0;
	}

	public int getPayementDueDay() {
		return payementDueDay;
	}

	public void setPayementDueDay(int payementDueDay) {
		if (payementDueDay <32 && payementDueDay  > 0)
			this.payementDueDay = payementDueDay;
		else this.payementDueDay = 0;
	}

	public String getExpenseType() {
		return expenseType;
	}

	public double getAmount() {
		return amount;
	}

	public String getBuisnessName() {
		return buisnessName;
	}
	
	public String toString() { //describes each expense and all its aspects
		
		String tempDueDay = null, tempDueMonth = null;
		
		if(payementDueMonth <10) 
			 tempDueMonth = "0"+payementDueMonth;
		else tempDueMonth = ""+payementDueMonth;
			
		if(payementDueDay <10) 
			 tempDueDay = "0"+payementDueDay;
		else tempDueDay = ""+payementDueDay;
		
		return( "Expense Type: " + expenseType +".\nBuisness Name: "+ buisnessName + ".\n" + "Payement Due Date: " + tempDueDay+"/"+tempDueMonth + "\n" );
	
		
	
	
	
	}

	public static  boolean equals(Expense Obj1,Expense Obj2) { //verifies if each aspect of two expenses is the same, if not then returns false
		return(Obj1.getAmount()==Obj2.getAmount()&&
				Obj1.getBuisnessName().equals(Obj2.getBuisnessName())&&
				Obj1.getExpenseType().equals(Obj2.getExpenseType())&&
				Obj1.getPayementDueDay()==Obj2.getPayementDueDay()&&
				Obj1.getPayementDueMonth()==Obj2.getPayementDueDay());
	}


}
