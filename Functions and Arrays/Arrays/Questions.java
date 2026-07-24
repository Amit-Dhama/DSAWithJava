import java.util.*;
public class Questions {

  //1.) Find all elements Greater Than X -----------------------------------------------------------------------------------------------------
public static int countElementsGreaterThanX(int[] arr){
Scanner scn1 = new Scanner(System.in);
System.out.println("Enter the value of X");
int x = scn1.nextInt();
int count = 0;


for(int i=0;i<arr.length;i++){
  int ele = arr[i];

  if(ele>x)
  {
    count++;
  }

}
return count;
}


//2.) Find Span Of Arrays
//-------------------------------------------------------------------------------------------------------
public static int findSpan(int[] arr){
  int max = Integer.MIN_VALUE;
  int min = Integer.MAX_VALUE;
  for(int i=0;i<arr.length;i++){
    int ele = arr[i];
    if(ele>max){
      max = ele;
    }
    if(ele<min){
      min = ele;
    }
  }
  int span = max-min;
  return span;
}

//3.) Find index of Target Element
//-------------------------------------------------------------------------------------------------------
public static int search(int[] arr){
  Scanner scn3 = new Scanner(System.in);
  System.out.println("Enter Target Number! Please");
  int target = scn3.nextInt();

  for(int i=0;i<arr.length;i++){
    int ele = arr[i];

    if(ele==target){
      return i;
    }
    }
    return 0;
  }

  //Make Buildings from array Elements
  //-----------------------------------------------------------------------------------------------------


  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);

    System.out.println("Enter number of size : ");
    int size = scn.nextInt();
    int[] arr = new int[size];

    System.out.print("Enter " + size + " elements of array: ");

    for(int i=0;i<arr.length;i++){
    arr[i] = scn.nextInt();
    }

    //int totalElementsGreaterThanX = countElementsGreaterThanX(arr);
    //int spanOfArray = findSpan(arr);
    //int indexOfTargetElement = search(arr);


    //System.out.println("The Total Elements greater than X : "+totalElementsGreaterThanX);
    //System.out.println("The Sppan of an array : "+spanOfArray);
    //if(indexOfTargetElement==0){
      //System.out.println("Target, Not Found");
    //}
    //else{
    //System.out.println("The element of Target Number is lying in : " +indexOfTargetElement);
  //}
}
}