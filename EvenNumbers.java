input java.util.Scanner;
public class Score{
   
public static void main(String[] args){

Scanner inputValue = new Scanner(System.In);

int initialNumber = 0;
for(int count = 0; count<=5; count++){
System.out.printf("Enter number:");
int number = inputValue.nextInt();
int average = (initialNumber + number)/2
System.out.printf("the average is "+ average);
int sum = initialNumber + number;
System.out.printf("the total sum is "+ average);

}

}
}