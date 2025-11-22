 import java.io.* ;
import java.util.ArrayList;
import java.util.Scanner;

abstract class ExpenseInfo{

abstract void expenses ();
abstract double gettotalExpenses ();
abstract double remainingBalance (AllowanceInfo money);
}

 class Fixedexp extends ExpenseInfo {


Scanner scan = new Scanner (System.in);
ArrayList < String > items = new ArrayList <>();
ArrayList < Integer > prices = new ArrayList <>();

@Override
void expenses(){

     
System.out.println ("Enter expenses for the month ");


    while (true ){

String expenses = scan.next ();


if (expenses.equalsIgnoreCase ("Exit")){

System.out.println ("Thank you for adding user");
break;
    
}

items.add (expenses);
}


for (String a : items ){

System.out.println ("Enter the price of" + a + " R : ");
int price = scan.nextInt();
prices.add (price );

}
System.out.println ();
try (BufferedWriter writer  = new BufferedWriter (new FileWriter ("myExpenses.txt"));){

for (int i = 0 ; i < items.size () ; i ++ ){

String expensesWithPrice = items.get (i) + " R " + prices .get (i);
writer .write (expensesWithPrice );
writer .newLine ();


}


}catch (IOException e ){

System.err.println ("Something went wrong with adiing Expeses with Prices : " + e.getMessage());

}}



 @Override
 double gettotalExpenses(){
double total = 0;
    
for ( double a : prices ){

total += a;

}

System.out.println ("Total expenses " + total );
return total ;

}

 
@Override
double remainingBalance(AllowanceInfo money){
    double remainingBalance = money.getAllowance()- gettotalExpenses();

    try (BufferedWriter writer = new BufferedWriter (new FileWriter ("Balance.txt"));){

System.out.println ("Remaining Balance :" + remainingBalance);
writer.write("Remaining Balance : " + remainingBalance );


}
catch(IOException a) {

    a.printStackTrace();
}

 
return remainingBalance;


}

} 
    

