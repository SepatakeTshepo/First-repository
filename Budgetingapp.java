 import java.io.* ;
import java.util.ArrayList;
import java.util.Scanner;

abstract class Budgetingapp{

abstract void expenses ();
abstract double gettotalExpenses ();
abstract double remainingBalance (Money money);
}

 class Fixedexp extends Budgetingapp {


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


try {

BufferedWriter writer  = new BufferedWriter (new FileWriter ("myExpenses.txt"));

for (int i = 0 ; i == items.size () ; i ++ ){

String expensesWithPrice = items.get (i) + " R " + prices .get (i);
writer .write (expensesWithPrice );
writer .newLine ();
break;

}
writer.close();

}catch (IOException e ){

System.err.println ("Something went wrong with adiing prices : " + e.getMessage());

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
double remainingBalance(Money money){
    double remainingBalance = money.getAllowance()- gettotalExpenses();

    try {

    BufferedWriter writer = new BufferedWriter (new FileWriter ("Balance.txt"));
   

System.out.println ("Remaining Balance :" + remainingBalance);
writer.write("Remaining Balance : " + remainingBalance );

   writer.close();
}
catch(IOException a) {

    a.printStackTrace();
}

 
return remainingBalance;


}

} 
    

