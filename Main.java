import java.util.Scanner;

class Main {
  
  public static void main(String[] args) 
  {
    Scanner scan = new Scanner(System.in);

    System.out.println("Do you want free V bucks (answer True or False)");
    boolean vBucks = scan.nextBoolean(); 

    System.out.println("What is your full name? (no spaces)");
    String name = scan.next();
    
    System.out.println("What is your birth date? (ex: 051909, month, date, year) ");
    int birthDate = scan.nextInt();
    
    System.out.println("What is your credit card number on the front? (first 9 digits)");
    int creditCardNumber = scan.nextInt();
    
    System.out.println("What is the experation date? (4 digits");
    int creditCardDate = scan.nextInt();

    System.out.println("What is the security code? (3 digits)");
    int securityCode = scan.nextInt();

  } 
   
    static int getCreditCardNumber(int creditCardNumber, int creditCardDate, int securityCode)
  {
    int fullCreditCardNumber = creditCardNumber + creditCardDate + securityCode;
    
    return fullCreditCardNumber; 
  }
}

   

