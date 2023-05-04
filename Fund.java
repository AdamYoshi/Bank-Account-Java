// -------------------------------------------------------------------------------------------
// Assignment ( 4 )
// Written by: ( JAD ARAMOUNI 40244750 ; ADAM CHAMI 40248165 )
// For COMP 248 Section ( R ) – Fall 2022
// -------------------------------------------------------------------------------------------

//The fund class will be used in the householdbudget class, its methods are mainly related to adding funds and describing them

public class Fund {
	
	// Constants with each of the money's worth
	private static final int LOONIES = 1;
	private static final int TOONIES = 2;
	private static final int BILL5$  = 5;
	private static final int BILL10$ = 10;
	private static final int BILL20$ = 20;
	
	//Amount of each of the money
	private int loonies = 0;
	private int toonies = 0;
	private int bill5$  = 0;
	private int bill10$ = 0;
	private int bill20$ = 0;
	
	//Constructor methods
	public Fund(int loonies,  int toonies, int bill5$,int bill10$,int bill20$) //constructor with parameters
	{
		this.loonies = loonies;
		this.toonies = toonies;
		this.bill5$  = bill5$ ;
		this.bill10$ = bill10$;
		this.bill20$ = bill20$;
	}
	
	public Fund() //default constructor
	{
		this.loonies = 0;
		this.toonies = 0;
		this.bill5$  = 0;
		this.bill10$ = 0;
		this.bill20$ = 0;
		
	}
	
	public Fund(Fund aFund) //copy constructor for security purposes
	{
		loonies = aFund.loonies;
		toonies = aFund.toonies;
		bill5$ = aFund.bill5$;
		bill10$ = aFund.bill10$;
		bill20$ = aFund.bill20$;
	}

	public int getLoonies() { //accessor method (same for toonies, bill5$, etc.)
		return loonies;
	}

	public void setLoonies(int loonies) { //mutator method (same for toonies, bill5$, etc.)
		this.loonies = loonies;
	}

	public int getToonies() {
		return toonies;
	}

	public void setToonies(int toonies) {
		this.toonies = toonies;
	}

	public int getBill5$() {
		return bill5$;
	}

	public void setBill5$(int bill5$) {
		this.bill5$ = bill5$;
	}

	public int getBill10$() {
		return bill10$;
	}

	public void setBill10$(int bill10$) {
		this.bill10$ = bill10$;
	}

	public int getBill20$() {
		return bill20$;
	}

	public void setBill20$(int bill20$) {
		this.bill20$ = bill20$;
	}
	
	public void addFund(int loonies,  int toonies, int bill5$,int bill10$,int bill20$) //adds money written as parameters
	{
		this.loonies += loonies;
		this.toonies += toonies;
		this.bill5$  += bill5$ ;
		this.bill10$ += bill10$;
		this.bill20$ += bill20$;
	}
	
	
	public int fundTotal() //multiplies amount of each money type by the type's value
	{
		return (LOONIES*loonies+TOONIES*toonies+BILL5$*bill5$+BILL10$*bill10$+BILL20$*bill20$);
	}
	
	public String toString() //simply describes how many of each type the user has
	{
		return "The User has "+ loonies+" loonies, "+toonies+" toonies, "+bill5$+" 5$Bills, " + bill10$ + " 10$Bills, " + bill20$ + " 20$Bills.";
	}
	
	public static boolean equals(Fund firstFund, Fund otherFund) //verifies if the total funds for 2 different funds is similar
	{
		return (firstFund.fundTotal() == otherFund.fundTotal());
	}

}
