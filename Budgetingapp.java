 import java.util.Scanner ;
import java.util.ArrayList;

abstract class Budgetingapp{

abstract void expenses (String message);
abstract double gettotalExpenses ();
abstract double remainingBalance (Money money);
}

class Fixedexp extends Budgetingapp {


Scanner scan = new Scanner (System.in);
ArrayList < String > items = new ArrayList <>();
ArrayList < Integer > prices = new ArrayList <>();

@Override
void expenses(String message){

System.out.println (message);


while (true ){
String expenses = scan.next ();


if (expenses.equalsIgnoreCase("Exit")){
System.out.println ("Thank you for adding user");
    break ;
}

items.add (expenses);
}

System.out.println ();
System.out.println ("Add price : ");
for (String a : items ){

System.out.print (a + " : " );
int price = scan.nextInt();
prices.add (price);


}


 }

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
System.out.println ("Remaining Balance :" + remainingBalance);


return remainingBalance;
}




} 
    

