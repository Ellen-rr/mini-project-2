import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    
    Pillowcase pillowcase = new Pillowcase();
    //new scanner
    Scanner s = new Scanner(System.in);
    //print
    System.out.println("Happy Halloween!");
    System.out.println("How many houses should we trick or treat at?");
    int houseCount = s.nextInt();
    
    //while loop-->use loop to get candy
    while(houseCount>0) {
      pillowcase.getCandy();
      houseCount--;
    }

    //print

    System.out.println("We have " + pillowcase.getTotalCandyNum() +" candies." );

    //call pillowcase class-->printNumCandies(object)

    pillowcase.printNumCandies();





  }
}