import java.util.Scanner;
class Account
{
	String acno,cname;
	double bal;
	public Account(String acno,String cname,double bal)
	{
		this.acno=acno;
		this.cname=cname;
		this.bal=bal;
	}

	public String getAcno()
	{
		return acno;
	}
	public double getBal()
	{
		return bal;
	}
	public void displayAccount()
	{
		System.out.println(acno+" "+cname+" "+bal);
	}
}
class Bank
{
   static String bname="Canara Bank";
   Account cust[]=new Account[10];   //cust[0], cust[1]...cust[9]
   int i=0;

    public void addCustomer(Account a)
	{
       cust[i]=a;
	   i++;
	}
	public void deposit(String acno,double amt)
	{   int j;
		for(j=0;j<i;j++)
		{
			if(acno.equals(cust[j].getAcno()))
			{
               cust[j].bal=cust[j].bal+amt;
			   break;
			}
    	}
		if(j==i)
			System.out.println("Invalid Account number");
	}
	public void withdraw(String acno,double amt)
	{ int j;
		for(j=0;j<i;j++)
		{
			if(acno.equals(cust[j].getAcno()))
			{
               cust[j].bal=cust[j].bal-amt;
			   break;
			}
    	}
		if(j==i)
			System.out.println("Invalid Account number");
	}
	public void transfer(String sacno,String racno,double amt)
	{   int p=-1,q=-1;
		for(int j=0;j<i;j++)
		{
			if(sacno.equals(cust[j].getAcno()))
			{
                p=j;
				break;
			}
		}
		for(int j=0;j<i;j++)
		{
			if(racno.equals(cust[j].getAcno()))
			{
                q=j;
				break;
			}
		}
		if(p!=-1 && q!=-1)
		{
			cust[p].bal=cust[p].bal-amt;
			cust[q].bal=cust[q].bal+amt;
		}
		else
			System.out.println("Invalid Account details");
	}
	public void display(String acno)
	{ int j;
       for(j=0;j<i;j++)
		{
		   if(acno.equals(cust[j].getAcno()))
            {
			   cust[j].displayAccount();
			   break;
			}
		}

	}
	public void listCustomers()
	{
		for(int j=0;j<i;j++)
		{
			cust[j].displayAccount();
		}
	}

	public static void main(String args[])
	{
       Account a;
	   Bank b=new Bank();
	   Scanner sc=new Scanner(System.in);
	   String acno,cname,acno1;
	   int ch;
	   double amt;
       while(true)
		{
		   System.out.println("1.Add Account\n2.Deposit\n3.withdraw\n4.Transfer\n5.Display\n6.List the Customers\n7.Exit");
           System.out.println("Enter your Choice");
		   ch=sc.nextInt();
		   sc.nextLine();
		   switch(ch)
			{
			   case 1:
				    acno=sc.nextLine();
			        cname=sc.nextLine();
					amt=sc.nextDouble();
					sc.nextLine();
					a=new Account(acno,cname,amt);
					b.addCustomer(a);
					break;
				case 2:
					acno=sc.nextLine();
				    amt=sc.nextDouble();
					sc.nextLine();
					b.deposit(acno,amt);
					break;
				case 3:
					acno=sc.nextLine();
				    amt=sc.nextDouble();
					sc.nextLine();
					b.withdraw(acno,amt);
					break;
				case 4:
					acno=sc.nextLine();
				    acno1=sc.nextLine();
					amt=sc.nextDouble();
					b.transfer(acno,acno1,amt);
                    break;
				case 5:
					acno=sc.nextLine();
				    b.display(acno);
					break;
				case 6:
					b.listCustomers();
				    break;
				case 7:
					System.exit(0);

				default:
					System.out.println("Invalid Choice");
				   break;
			}
		}
	}
}