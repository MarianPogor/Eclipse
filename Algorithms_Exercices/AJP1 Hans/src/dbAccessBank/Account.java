package dbAccessBank;


/**
* Bank/Account.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Bank.idl
* Monday, October 28, 2013 5:49:03 PM CET
*/

public final class Account //implements org.omg.CORBA.portable.IDLEntity
{
  public int accountNo = (int)0;
  public String name = null;
  public double balance = (double)0;

  public Account ()
  {
  } // ctor

  public Account (int _accountNo, String _name, double _balance)
  {
    accountNo = _accountNo;
    name = _name;
    balance = _balance;
  } // ctor

} // class Account