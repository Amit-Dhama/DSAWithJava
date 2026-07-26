// How To Solve any Pattern Problem's Tips are :- 
// 1.) Count Number of total_number of line according to input
// 2.) Count number of star's and spaces in 1st Line
// 3.) See how number of star and spaces are changing with array line
// 4.) Code

import java.util.*;
public class Pattern2 {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    System.out.println("Enter the number : ");
    int number = scn.nextInt();
    int total_number_of_line = number;
    int current_number_of_line = 1;
    int stars = number;

    while(current_number_of_line<=total_number_of_line)
    {
      for(int i=1;i<=stars;i++){
        System.out.print("* ");
    }
    System.out.println();
    current_number_of_line++;
    stars--;
  }
}
}