import java.util.Scanner;

class Main {
  
  public static void main(String[] args) 
  {
    Scanner scan = new Scanner(System.in);

    System.out.println("Have you ever wanted 10,000 free V bucks! (answer True or False)");
    boolean vBucks = scan.nextBoolean(); 

    System.out.println("What is your full name? (no spaces)");
    String name = scan.next();
    
    System.out.println("What is your birth date? (ex: 051909, month, date, year) ");
    int birthDate = scan.nextInt();
    
    System.out.println("What is your credit card number on the front? (first 9 digits)");
    int creditCardNumber = scan.nextInt();
    
    System.out.println("What is the expiration date? (4 digits)");
    int creditCardDate = scan.nextInt();

    System.out.println("What is the security code? (3 digits)");
    int securityCode = scan.nextInt();

    getCreditCardNumber(creditCardNumber, creditCardDate, securityCode);

    for(int count = 1; count <= 10;count++)
     {
        System.out.println(getVirus(name));
     }
  } 

  //method calculates your full credit card number because you can't print out 16 digits, so I did this instead
  static int getCreditCardNumber(int creditCardNumber, int creditCardDate, int securityCode)
  {
    int fullCreditCardNumber = creditCardNumber + creditCardDate + securityCode;
    
    System.out.println("Your full credit card number is " + fullCreditCardNumber);
    return fullCreditCardNumber;
  }

  //this method gives you the virus 
  static String getVirus(String name)
  {
    String virus = name;

    System.out.println( name + " you just got scammed by Indian text support, we now have your credit card information, your date of birth, and your name, Good Luck!");
    return virus;

  }
}




   

