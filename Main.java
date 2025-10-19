import java.util.ArrayList;
import java.util.Scanner ;

public class Main {

public static void main (String []args ){

Scanner scan = new Scanner (System.in );
Fixedexp expe = new Fixedexp();
ArrayList < Money > array = new ArrayList<>();
Money mon = new Money ();
double allowance = mon.getAllowance();
int option;


System.out.println ("Hello User , How can we help you today ");


do {

System.out.println ("Choose from options below\n");
System.out.println (" ( 1 ) Enter my Allowance for the Month ");
System.out.println (" ( 2 ) Enter my Expenses for the Month ");
System.out.println (" ( 3 ) Price for each Expense ");
System.out.println (" ( 4 ) Total Saved ");

 option = scan.nextInt();


switch (option ){

case 1 :
System.out.println ("Enter my Allowance for the Month ");
mon.setAllowance();

break;

case 2 :



expe.expenses();


break;
case 3 :

System.out.println ("Price for each Expense ");
expe.gettotalExpenses();
break;

case 4 :

System.out.println ("Total Saved ");
expe.remainingBalance(mon);



} } while (option <= 4 );

}

}