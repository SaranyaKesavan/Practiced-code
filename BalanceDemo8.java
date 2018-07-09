// userdefined exception exercise min bal 1000

import java.lang.*;
import java.util.*;

class BalanceDemo8

{
	
	public static void main(String... args)

	{
		
		Scanner sc=new Scanner(System.in);

		int acc_no=0,flag1=0,flag2=0,flag3=0;

		String name;

		double balance=0;

		do{

			try

			{

				if(flag1==1 && flag2==1 && flag3==3)
					break;
				else
				{
					//***********************************************************************************
					if(flag1!=1)
					{				
						System.out.println("Enter your acc_no:");

						acc_no=sc.nextInt();

						if(String.valueOf(acc_no).length()!=10)

						{

							MinBalanceException e=new MinBalanceException("Enter a valid a/c no");
	
							throw e;

						}
						flag1=1;
					}
					//**************************************************************************************	

					if(flag2!=1)
					{
						System.out.println("Enter your name:");

						sc.nextLine();

						name=sc.nextLine();

						flag2=1;
					}
					//***************************************************************************************
					
                                        if(flag3!=1)
					{
						System.out.println("Enter your balance:");

						balance=sc.nextDouble();
						if(balance<1000)

						{

							MinBalanceException e1=new MinBalanceException("balance a minimum balance of 1000");

							throw e1;		

                                                }

						flag3=1;
					}
					//******************************************************************************************************						

				}
                        }   
			//**************************************************
			
			catch(MinBalanceException b)

			{

				System.out.println(b.getMessage());

			}
	
			
		}while(flag1==0 || flag2==0 || flag3==0);

	}

}

class MinBalanceException extends Exception

{

	MinBalanceException(String str)

	{
	
		super(str);

	}

}
