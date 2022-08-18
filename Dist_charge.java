import java.util.Scanner;

public class Dist_charge {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // int dist = sc.nextInt();
        System.out.println("Enter the distance:");
        int dist = sc.nextInt();
        if(dist<=100){
            System.out.println("Charges = "+ 8*dist);
        }else if(dist>100 && dist<=200){
            System.out.println("Charges = "+ 10*dist);
        }else if(dist>200 && dist<500){
            System.out.println("Charges = "+ 12*dist);
            
        }else{
            System.out.println("Charges = "+20*dist);

        }
        sc.close();
    }
}
