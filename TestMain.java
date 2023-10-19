import java.util.*;

public class TestMain {
    public static void main(String[] args) {
        int choice; 
        float totalAmount = 0;
        Product p[] = new Product[5];
        Scanner sc = new Scanner(System.in);

        do{
        System.out.println("---------------------------Billing System-------------------------");
        System.out.println("1. Order");
        System.out.println("2. Bill");
        System.out.println("3. Exit");
        System.out.println("---------------------------------------------------------------------");

        System.out.println("Enter your choice :  ");
        choice = sc.nextInt();

        switch(choice){
            case 1 : {
                for(int i = 0; i < 5; i++){
                    Product p1 = new Product();
                    System.out.println("Enter product name of " +(i+1)+" product");
                    p1.product_name = sc.next();
                    System.out.println("Enter product rate of " +(i+1)+" product");
                    p1.rate = sc.nextInt();
                    System.out.println("Enter product quantity of " +(i+1)+" product");
                    p1.quantity = sc.nextInt();
                    p[i] = p1;
                    p1 = null;

                }
                break;
            }
            case 2 :{
                System.out.println("--------------------------------------------");
                System.out.println("Product Name\tRate\tQuantity\tAmount");
                System.out.println("--------------------------------------------");

                for(int i = 0; i < 5; i++){
                    Product p1 = p[i];
                    System.out.println(p1.product_name +"\t");
                    System.out.println(p1.rate +"\t");
                    System.out.println(p1.quantity +"\t");
                    System.out.println((p1.rate * p1.quantity) +"\t");

                    totalAmount += (p1.rate * p1.quantity);



                }
                    System.out.println("------------------------------------------------");
                    System.out.println("        Total Amount "+totalAmount);
                    break;

            }
            case 3 :
                System.exit(0);
             
        }
    }
        while(choice!=3);
        
    

    
    }
}
