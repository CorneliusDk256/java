public class ifConditionalstatement{
    public static void main (String[] args){
Scanner scanner = new Scanner(System.in);//create a new scanner class
System.out.println("Enter your number");
int number = scanner.nextInt();
if(number>0){
    System.out.println("you man This is a positive number");}
    else if(number<0){
        System.out.println("This is a negative number for sure");}
        else{
System.out.println("This is zero haha");
        }
        scanner.close();
    }

}    
