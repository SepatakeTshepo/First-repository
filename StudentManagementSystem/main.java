import java.util.*;
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
          "( 5 ) Exit Application ");
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
  saveManager.saveStudent(Array);



break ;

case 2 :

System.out.println (" Enter Student Id to search ");
int student_id = scan.nextInt() ;

searchStudent.getStudent(student_id);

break ; 

case 3 :

System.out.println ("Enter Student Id To delete ");
int studentId = scan.nextInt ();

DeleteStudent.removeStudent(studentId);

break ;


case 4 :

 System.out.println ("Get Student Report");
 List < Student > allStudents = studentReport.printReport();

for (Student a : allStudents ) {

  System.out.println ("ID " + a.getId());
System.out.println (" Name :" + a.getName ());
System.out.println (" Age " + a.getAge());
System.out.println ("Email " + a.getEmail());
System.out.println (" Course "+ a.getCourse());


}
break ;

case 5 :

  System.out.println ("You have Exited the Application");

}


                  }

                  
}
}
    










