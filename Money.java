import java.util.Scanner;
public class Money {

private double allowance = 0 ;


Scanner scan = new Scanner (System.in);

public void Money(double allowance ) {


this.allowance = allowance ;


}

void setAllowance ( ){
 
 allowance = scan.nextDouble ();

}


double getAllowance (){


    return allowance;
}

    
}
