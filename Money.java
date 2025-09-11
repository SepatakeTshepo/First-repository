import java.util.Scanner;
public class Money {

private double allowance = 0 ;


Scanner scan = new Scanner (System.in);

public void Money(double allowance ) {


this.allowance = allowance ;


}

void setAllowance ( ){
 System.out.println ("allowance for the month : ");
 allowance = scan.nextDouble ();

}


double getAllowance (){


    return allowance;
}

    
}
