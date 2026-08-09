public class arrayProblem {

    // array each element multiply with 10
    // static void multiplyWith10(int arr[]) {
    //     int multiply;
    //     for (int i : arr) {
    //         multiply = 10 * i;
    //         System.out.println("10* " + i + " is: " + multiply);
    //     }
    // }

// -------------------------------------------------------------

    // search an element in array[Linear Search]
    /*static boolean searchElem(int arr[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Eneter the target element: ");
        int target=sc.nextInt();

        for(int i=0;i<arr.length;i++){
            if (arr[i]==target){
                return true;
            }
        }
        return  false;
    }*/


// ------------------------------------------------------------

    // fint the max element in a array
    /*static int searchMax(int arr[]){
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }

        }
        return max;
    }*/

// ------------------------------------------------------------

    // count 0 and 1
    /*static void countElement(int arr[]){
        int zeroCount=0;
        int oneCount=0;

        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                zeroCount=zeroCount+1;
            }
            else{
                oneCount=oneCount+1;
            }
        }
        System.out.println("Zero count: " + zeroCount);
        System.out.println("One count: " + oneCount);
    }*/

// ------------------------------------------------------------

    // Find the fist unsorted element in a array
   /* static int findUnsorted(int arr[]){
        for(int i=0;i<arr.length;i++){
            // base logic
            if(arr[i+1]<=arr[i]){
                return arr[i+1];
            }
        }
        return -1;
    }
 */

// -------------------------------------------------------

    // swap alternate element
    /*static void swapElement(int arr[]){
        for(int i = 0; i + 1 < arr.length; i += 2){
            int temp=arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=temp;
        }
    }*/

// ----------------------------------------------------

    // array intersection element
    static void intersectionElement(int arr1[],int arr2[]){
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr2.length;j++){
                if(arr1[i]==arr2[j]){
                    System.out.print(arr1[i]+" ");
                    break;
                }
            }
        }
    }



    public static void main(String[] args) {

        // average of array elements
        /* int arr[]={8,7,6,4}; 

        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
        }
        float avg=(float)sum/arr.length;
        System.out.println("Average is : "+avg); */
        
        // call the function
        // int arr[] = {5, 4, 3};
        // multiplyWith10(arr);

        // call the function
       /* int arr[]={8,4,6,9,2};
        boolean ans=searchElem(arr);
        if(ans){
            System.out.print("Element Found");
        }
        else{
            System.out.println("element not found");
        } */

        // call the function
      /*int arr[]={80,42,98,77};
        int ans=searchMax(arr);
        System.out.println("Max  elemenet is : "+ans); */

        // Sum of positive and negative number
/*        int arr[]={44,12,-5,6,-18,-21,33};
        int positiveNum=0;
        int negativeNum=0;

        for(int i=0;i<arr.length;i++){
            if(arr[i]>0){
                positiveNum=positiveNum+arr[i];
            }
            else{
                negativeNum=negativeNum+arr[i];             
            }
            
        }
        System.out.println("Positive Num sum: "+positiveNum);
        System.out.println("negative Num sum: "+negativeNum); */


        // call the function
        /*int arr[]={1,0,0,0,1,1,0,1,0};
        countElement(arr);*/

        // call the function
        /*int arr[]={4,5,6,7,1,9,10};
        System.out.println("The Unsorted element is: "+findUnsorted(arr));
*/

        // call the function
        /*int arr[]={1,2,3,4,5,6};
        swapElement(arr);

        for(int swapingElem:arr){
            System.out.print(swapingElem+" ");
        }*/


        int arr1[]={2,1,5,4,9};
        int arr2[]={3,1,4,5,7};

        intersectionElement(arr1, arr2);

    }
}
