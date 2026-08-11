/*public class exam {
    public static void main(String[]args){
        int num1 =5;
        int num2 = 10;
        int sum = num1 + num2 ;
        System.out.println(sum);

    }
}*/
/*import java.util.Scanner;

public class exam{
    public static void main(String[]args){
        Scanner S = new Scanner(System.in);
        System.out.print("Enter number 1 :");
        int a = S.nextInt();
        int b = S.nextInt();
        System.out.print("Enter number 2 :");
        int sum = a + b;
        System.out.println("the sum is : "+sum);  
    }
}*/

//calculate cbse board percentage
import java.util.Scanner;

public class exam{
    public static void main(String[]args){
        Scanner S = new Scanner(System.in);
        System.out.print("Enter marks of 1st subject :");
        byte subject1 = S.nextByte();
        System.out.print("Enter marks of 2nd subject :");
        byte subject2 = S.nextByte();
        System.out.print("Enter marks of 3rd subject :");
        byte subject3 = S.nextByte();
        System.out.print("Enter marks of 4th subject :");
        byte subject4 = S.nextByte();
        System.out.print("Enter marks of 5th subject :");
        byte subject5 = S.nextByte();
        int sum = subject1 + subject2 + subject3 + subject4 + subject5 ;
        int percent = sum*100/500;
        System.out.println("The total percentage is:"+percent);
    }
}

