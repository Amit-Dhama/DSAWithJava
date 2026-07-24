import java.util.*;
public class MaxValue{
  public static void main(String[] args){
    Scanner scn = new Scanner(System.in);
    System.out.println("Enter the size of an array");
    int size = scn.nextInt();
    int[] arr = new int[size];
    for(int i=0;i<arr.length;i++){
      arr[i] = scn.nextInt();
    }
    int max = Integer.MAX_VALUE;
    System.out.println(max);
  }
}