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


//4.) Make Buildings from array Elements
  //-----------------------------------------------------------------------------------------------------
  public static void printBuildings(int[] heights){
    int n = heights.length;
    int maxHeight = Integer.MIN_VALUE;

    for(int i=0;i<n;i++){
      int currentBuildingHeight = heights[i];
      maxHeight = Math.max(maxHeight,currentBuildingHeight);
    }

    int totalFloor = maxHeight;
    int currentFloor = maxHeight;

    while(currentFloor>0){
      //go to every building and check if currB uilding is exists or not

      for(int i=0;i<n;i++){
        int currentBuildingHeight = heights[i];

        if(currentFloor<=currentBuildingHeight){
          System.out.print("* ");
        } else{
          System.out.print("  ");
        }
      }

      //prepare for next line

    System.out.println();
    currentFloor--;
    }
  }

  //5.)Sum of Two Arrays
  //-----------------------------------------------------------------------------------------------------
  public static int[] sumOfTwoArrays(int[] arr1, int[] arr2){
    int n1 = arr1.length;
    int n2 = arr2.length;

    int resSize = Math.max(n1,n2)+1;

    int[] res = new int[resSize];

    int i = arr1.length-1;
    int j = arr2.length-1;
    int k = res.length-1;

    int carry = 0;

    while(k>=0){
      int csum = 0;

      if(i>=0){
        csum += arr1[i];
      }

      if(j>=0){
        csum += arr2[j];
      }

        csum+=carry;

        carry = csum/10;
        int d = csum%10;
        res[k] = d;

      i--;
      j--;
      k--;
    }
    return res;
  }


  //6.)Sum of Three Arrays
  //-----------------------------------------------------------------------------------------------------
  public static int[] sumOfThreeArrays(int[] arr1, int[] arr2, int[] arr3){
    int n1 = arr1.length;
    int n2 = arr2.length;
    int n3 = arr3.length;

    int resSize = Math.max(n1,n2)+1;
    resSize = Math.max(resSize,n3)+1;

    int[] res = new int[resSize];

    int i = arr1.length-1;
    int j = arr2.length-1;
    int l = arr3.length-1;
    int k = res.length-1;

    int carry = 0;

    while(k>=0){
      int csum = 0;

      if(i>=0){
        csum += arr1[i];
      }

      if(j>=0){
        csum += arr2[j];
      }

      if(l>=0){
        csum += arr3[l];
      }

        csum+=carry;

        carry = csum/10;
        int d = csum%10;
        res[k] = d;

      i--;
      j--;
      l--;
      k--;
    }
    return res;
  }



  //7.) Find all SubArrays
  //-----------------------------------------------------------------------------------------------------
  public static void findAllSubArrays(int[] arr){
    int size = arr.length;
    int temp = size;

      for(int si=0;si<size;si++){
        for(int ei=si;ei<size;ei++){
          
          for(int k=si;k<=ei;k++){
            System.out.print(arr[k] + " ");
          }

          System.out.println();

        }
        System.out.println();
      }
  }








  //Array Input taking function
  //*****************************************************************************************************
  public static int[] takeArrayInput(){
    Scanner scn = new Scanner(System.in);
    System.out.println("Enter size of an array : ");
    
    int size = scn.nextInt();
    System.out.println("The size of an array is : " +size);
    int[] arr = new int[size];

    System.out.println("Enter values of an Array: ");

    for(int i=0;i<arr.length;i++){
      arr[i] = scn.nextInt();
    }

    return arr;
  }


//  Return Result print Array in Return Result
//*******************************************************************************************************
  public static void printArray(int[] arr){
    for(int i=0;i<arr.length;i++){
      System.out.print(arr[i] + ", ");
    }
  }


  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);

    int[] arr = takeArrayInput();
    //int[] arr1 = takeArrayInput();
    // int[] arr2 = takeArrayInput();
    // int[] arr3 = takeArrayInput();
   
    //int totalElementsGreaterThanX = countElementsGreaterThanX(arr);
    //int spanOfArray = findSpan(arr);
    //int indexOfTargetElement = search(arr);
      //printBuildings(arr);
    //int[] result = sumOfTwoArrays(arr1,arr2);
    //int[] result2 = sumOfThreeArrays(arr1,arr2,arr3);
    findAllSubArrays(arr);


    //System.out.println("The Total Elements greater than X : "+totalElementsGreaterThanX);
    //System.out.println("The Sppan of an array : "+spanOfArray);
    //if(indexOfTargetElement==0){
    //System.out.println("Target, Not Found");
    //}
    //else{
    //System.out.println("The element of Target Number is lying in : " +indexOfTargetElement);
    //printArray(result);
    //printArray(result2);
    //System.out.println("The sub arrays are : "+allSubArrays);
}
}