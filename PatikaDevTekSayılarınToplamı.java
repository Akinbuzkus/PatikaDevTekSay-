
import java.util.Scanner;


public class PatikaDevTekSayılarınToplamı {
    public static void main(String[] args) {
        
        
        Scanner scan=new Scanner(System.in);
        
      /* Tek Sayıların Toplamı

        
        int toplam = 0;
        int number;
        
        do {    
            System.out.print("Please enter the Number :");
                number=scan.nextInt();
                if(number%2==1){
                    toplam+=number;
                    
                }
                
                
        } while (number>0);
        System.out.println("Tek Sayıların Toplamı :"+toplam);

*/
        int total = 0;
        int number;
        
        do { 
            System.out.print("Please enter the number :");
            number=scan.nextInt();
            if(number%2==0 || number%4==0){
                total+=number;
            }
            
            
        } while (number%2==0);
      
        System.out.println("Sayıların toplamı :"+total);

    }
}

