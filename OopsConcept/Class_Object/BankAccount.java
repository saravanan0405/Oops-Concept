class BankAccount
{

  private int balance;
  private String accountNumber;
  private String accountType;

    BankAccount (int balance, String accountNumber, String accountType)
  {

	this.balance = balance;
	this.accountNumber = accountNumber;
	this.accountType = accountType;
  }

  public int getbalance ()
  {
	return balance;
  }
  public String getaccountNumber ()
  {
	return accountNumber;
  }
  public String getaccountType ()
  {
	return accountType;
  }
  public void setbalance (int balance)
  {
	this.balance = balance;
  }
  public void setaccountNumber (String accountNumber)
  {
	this.accountNumber = accountNumber;
  }
  public void setaccountType (String accountType)
  {
	this.accountType = accountType;
  }

  public static void main (String args[])
  {

	BankAccount obj = new BankAccount (1000, "500101011922847", "Saving");

	System.out.println ("Balance : " + obj.getbalance ());
	System.out.println ("Account Number : " + obj.getaccountNumber ());
	System.out.println ("Account Type : " + obj.getaccountType ());

	obj.setbalance (10000);
	obj.setaccountNumber ("5001010111922846");
	obj.setaccountType ("Current");
	 
	 System.out.println();

	System.out.println ("Balance : " + obj.getbalance ());
	System.out.println ("Account Number : " + obj.getaccountNumber ());
	System.out.println ("Account Type : " + obj.getaccountType ());
  }
}

