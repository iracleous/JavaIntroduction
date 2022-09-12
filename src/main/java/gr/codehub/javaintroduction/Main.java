/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package gr.codehub.javaintroduction;

import gr.codehub.javaintroduction.repository.Basket;
import gr.codehub.javaintroduction.model.Product;
import gr.codehub.javaintroduction.model.Customer;
import gr.codehub.javaintroduction.model.Printer;
import gr.codehub.javaintroduction.model.ProductNoExpiration;
import gr.codehub.javaintroduction.model.ProductWithExpiration;
import java.util.Date;

 
 
/**
 *
 * @author iracl
 */
public class Main {

    public static void main(String[] args) {
        
       Basket basket = new Basket();
       
        if(!    basket.add(new ProductNoExpiration()))  
            System.out.println("The product has not been added");
        basket.add(new ProductNoExpiration());
        basket.add(new ProductWithExpiration(new Date(122, 9,25), "Camamber", 20, "C1"));
        basket.add(new ProductNoExpiration());
        
        boolean hasEntered = basket.add(new ProductWithExpiration(new Date(122, 9,26), "Feta", 20, "C2"));
        if(! hasEntered)  
            System.out.println("The product has not been added");
        basket.printAll();

    }
    
    
    
    public static void test4(){
                
        Product table = new ProductNoExpiration();
        
        ProductWithExpiration milk = new ProductWithExpiration();
        
        milk.setExpirationDate(new Date());
        System.out.println("milk= "+ milk);
        milk.setPrice(1.1);
        System.out.println("milk= "+ milk);
      
        // Date expirationDate, String name, double price, String code
        Product cheese = new ProductWithExpiration(  new Date(122, 9,25), "Camamber", 20, "C1");
        System.out.println("Cheese= " + cheese);
        
        if (table instanceof ProductWithExpiration){
         
          ((ProductWithExpiration)  table  ).decreasePrice(0.05);
            
        }
        
        
        
        Product[] products = new Product[20];
        products[0] = new ProductNoExpiration();
        products[1] = new ProductWithExpiration();
        products[2] = new ProductNoExpiration();
        products[3] = new ProductWithExpiration();
        
        for (int index= 0; index<4 ; index++){
            System.out.println(""+products[index]);
        }
            
      
        Printer [] printers = new Printer[10];
        printers[0] = new ProductWithExpiration();
        
        
    }
    
    
     public static void test3(){
      Product product = new ProductNoExpiration(); //"Oranges", 1.80, "Or10");
        System.out.println("Product name = " + product.getName());
        System.out.println("Product code = " + product.getCode());
        System.out.println("Product price = " + product.getPrice());
        
        Product productPotatoes =  product;
        productPotatoes.setName("Mango");
 
        System.out.println("Product name = " + product.getName());
        
        
        System.out.println("Product " + product);
        
        // String name, String address, int age, double balance, boolean registered
        Customer foreignCustomer = new Customer("DPI", "Athens", 20, 0, false ); 
        System.out.println("" + foreignCustomer);
        
        
        //increase the price of product 5%
        
   //     product.setPrice( product.getPrice() * 1.05 );
        
        product.increasePrice(0.05);
        product.increasePrice(5);
        
         System.out.println("Product price = " + product.getPrice());
        
    
     }
    
    public static void test2(){
             //  testing();
      
      int[] balance;
      balance = new int[3];
   //   balance[0] = 7;
  //    balance[1] = -7;
   //   balance[2] = 1500;
      
       System.out.println(sumOfPositiveAndSmallBalances(balance ));  //call, invocation of a method
    }
    
    
    
    
     public static int sumOfPositiveAndSmallBalances(int[] balance ){
         int result = 0;
         for (int index = 0; index < balance.length; index++){
             if (balance[index]>0 && balance[index]<1000){
                result += balance[index];
             }
         }
         return result;
     }
     
       public static int sum(int[] balance ){
         int result = 0;
         for (int index = 0; index < balance.length; index++){
           
                result += balance[index];
  
         }
         return result;
     }
     public static int max(int[] balance){
         int maxResult = balance[0];
         for (int index = 1; index < balance.length; index++){
             if (balance[index]>maxResult){
                maxResult = balance[index];
             }
         }
         return maxResult;
     }
     
       public static double average(int[] balance){
         return (double)sum(balance)/balance.length;
     }
     
    public static void testing(){
    String hello = "Hello World!";
        hello = "Goodbye";
        
        System.out.println(hello);
        
        
        boolean checkedBalance = true;   // 1 bit
        byte myByte = 2;                // 1 Byte = 8 bit
        char myCharacter = 12;          // 2 Bytes = 16 bit
        char myOtherCharacter = '\u0041';
        short shortInteger = 32000;     // 2 Bytes = 16 bit
        int myInteger = 2147483647;     // 4 Bytes = 32 bit
        int myMaxInteger = Integer.MAX_VALUE; // 8 Bytes = 64 bit
        long myLong = 2147483647L;           // 8 Bytes = 64 bit
        
        System.out.println("checkedBalance = " + checkedBalance);
        
        System.out.println(myByte + myCharacter);
        System.out.println(myInteger == myMaxInteger);
        System.out.println(myOtherCharacter);
        
        
        float amount = 12.50F;              //32 bit
        double preciseNumber = 12.50;       //64 bit
        double robustness = 1444.3244e-26;
        
        System.out.println(robustness);
        
        double a1 = 0.1;
        double a2 = 0.2;
        double result  = 0.3;
        double acceptableError = 0.001;
        
        System.out.println( Math.abs((a1+a2) - result) < acceptableError);
        
         
        
        System.out.println("max int= "+myInteger);
        myInteger = myInteger + 10000;
        System.out.println("max int= "+myInteger);
        
        
        long[] accounts;
        accounts = new long[10];
        int myAccount = 4;
        myAccount = 3;
        myAccount = myInteger + 3;
        
        
        int part1 = 2;
        int part2 = 3;
        int part0 = 0;
        System.out.println("part1/part0 = " + part1/part2 );
        System.out.println("part1%part2 = " + part1%part2);
        System.out.println("part1/part2 = " + (double)part1/part2);
        System.out.println("part1+part2 = " +  part1+part2 );
        System.out.println("part1-part2 = " + (part1-part2));
        
        
        System.out.println("part1<part2 = " +  (part1 < part2) );
        System.out.println("part1<=part2 = " +  (part1 <= part2) );
        // < <= > >= == !=
        
       
        
        part1 = 2;
        System.out.println(part1++);
        System.out.println(++part1);
        System.out.println(part1);
        
        part1 /= 3;
        // part1 = part1 /3;
        System.out.println(""+part1);
}   
    
    
/*
0-4 F
5	E
6-7	D
8	C
9	B
10 A
*/
    public static char getGrade(int mark){
        if (mark>=0 && mark<=4)
                return 'F';
        if (mark== 5)
            return 'E';
        if (mark>=6 && mark<=7)
                return 'D';
        if (mark== 8)
            return 'C';
        if (mark== 9)
            return 'B';
        if (mark== 10)
            return 'A';
        return 'N';
    }
     public static char getGradeAnother(int mark){
         
         switch(mark){
             case 0:
             case 1:
             case 2:
             case 3:
             case 4: return 'F';
             case 5: return 'E';
             case 6:   
             case 7: return 'D';
             case 8: return 'C';
             case 9:   return 'B';
             case 10:   return 'A';
             default:return 'F';
         }
       
        
    }
    
}
