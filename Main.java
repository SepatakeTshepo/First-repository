import java.util.ArrayList;
import java.util.Scanner ;
public class Main {

public static void main (String []args ){

Scanner scan = new Scanner (System.in );
Fixedexp expe = new Fixedexp();
ArrayList < Money > array = new ArrayList<>();
Money mon = new Money ();
double allowance = mon.getAllowance();


mon.setAllowance();
expe.expenses ("Fixed expenses : ");
expe.gettotalExpenses();
expe.remainingBalance(mon);





}
}
