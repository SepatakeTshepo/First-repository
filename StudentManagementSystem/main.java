import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
public class main{

public static void main (String [] args){

Scanner scan = new Scanner(System.in);
List <Student > Array = new ArrayList <>();
String Name ,Email , Course ;
int Age ;
int Id = 0;

System.out.println ("Student Managament Application");

System.out.println ("Enter ( 1 )to lunch menu or any other key to Exity " );
int input = scan.nextInt();

List < String > menuOptions = Arrays.asList (

"( 1 ) Capture a new Student ",
     "( 2 ) Search for a Student ",
     "( 3 ) Delete a Student ",
     "( 4 ) Print Student Report )",
     "( 5 ) Exit Application "

);
boolean running = true ;
while ( running ){

menuOptions.forEach (System.out::println );
int myOption = scan.nextInt();

switch (myOption ){

case 1 : 

int i = 0 ;


System.out.println ("Enter Student Id" );
 Id = scan.nextInt();
System.out.println ("Enter Student Name ");
 Name = scan.next();
scan.nextLine ();
System.out.println ();
System.out.println ("Enter Student Age ");
 Age= 0;

while ( true ){
   String input1 = scan.nextLine ();

try {

Age = Integer.parseInt(input1);

if (Age < 16 ){
System.out.println ("Student Age should be greater than 16");
System.out.println ("Please try again");
}else {


    break ;
}
}catch (NumberFormatException e){


System.out.println(" Age cannot include letters ");

}



}

System.out.println ("Enter Student Email");
  Email = scan.next();
System.out.println ("Enter the Student Course ");
 Course = scan.next();
Student obj = new Student (Id , Name, Age, Email, Course);
Array.add(obj);


System.out.println (" Student details have beeen succesfully saved ");

break ;

case 2 :
System.out.println (" Enter Student Id to search ");
while (true ){

int Id2 = scan.nextInt ();

Optional < Student > myOptional = Array.stream ()
.filter( s -> s.getId() == Id2)
.findFirst();

if (myOptional.isPresent() ){
    
    Student s = myOptional.get();
    System.out.println ("Student Id : " + s.getId());
    System.out.println ("Student Name : " + s.getName());
    System.out.println ("Student Age :"  + s.getAge());
    System.out.println (" Student Email : " + s.getEmail ());
    System.out.println (" System.out.println " + s.getCourse());

break;
}else {

System.out.println (" Student with Id " + Id2 + " Was not Found");
System.out.println (" Please try Again ");
}
}

break ; 

case 3 :

System.out.println ("Enter Student Id To delete ");
int studentId = scan.nextInt ();


while ( true ){



Optional < Student > delete = Array.stream()
.filter ( s -> s.getId() == studentId )
.findFirst();

if (delete.isPresent()){
Student s = delete.get ();
System.out.println (" Are you sure you want to delete Student " + studentId + " Yes or No");
String answer = scan.next( );

if (answer.equalsIgnoreCase ("Yes")){
Array.remove ( s);
System.out.println (" Student with ID " + studentId + " was deleted ");
break;

}else {

System.out.println ("Student with ID " + studentId + " was not found");

}}else{

System.out.println ("You have Exited the Program");

}

}
break ;

case 4 :
   AtomicInteger counter = new AtomicInteger(1);
 Array.forEach(s -> {
                        System.out.println("STUDENT " + counter.getAndIncrement());
                        System.out.println("--------------------------------------------------");
                        System.out.println("STUDENT ID: " + s.getId());
                        System.out.println("STUDENT NAME: " + s.getName());
                        System.out.println("STUDENT AGE: " + s.getAge());
                        System.out.println("STUDENT EMAIL: " + s.getEmail());
                        System.out.println("STUDENT COURSE: " + s.getCourse());
                        System.out.println("--------------------------------------------------\n");
                    });



}
}
}
    
}









