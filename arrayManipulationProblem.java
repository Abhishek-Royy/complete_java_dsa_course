
import java.util.HashMap;



    /**
     * arrayManipulationProblem
     */
    public class arrayManipulationProblem {

        // Reverse an array, another method (two pointer technique)
        /*static void reverseArray(int arr[]){
            
            int i=0;
            int j=arr.length-1;
            // termination condition
            while(i<=j){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;

                i++;

                j--;
            }

            for(int arrElem:arr){
                System.out.print(arrElem+" ");
            }
        }*/

        // -------------------------------------------

        // rightShift by 1 array elements
    /*  static void shiftRightArray(int arr[]){
            
            int right=arr.length-1;
            int temp=arr[right];

            for(int i=right;i>0;i--){
                arr[i]=arr[i-1];

            }
            arr[0]=temp;
        }
    */

    // ---------------------------------------------
        // print alternate element of an array
        /*static void printAlternate(int arr[]){
            int n=arr.length;
            int i=0;
            int j=n-1;

            while(i<=j){
                if(i==j){
                    System.out.println(arr[i]);
                    return;
                }
                else{
                    System.out.println(arr[i]);
                    i++;
                    System.out.println(arr[j]);
                    j--;
                }
            }
        }*/
        
// -------------------------------------------
    // find out the mode
    /*static int maxFrequency(int arr[]){
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int k:arr){
            map.put(k,map.getOrDefault(k,0)+1);
        }
        int maxFreq=0;
        int mode=0;
        for(int key:map.keySet()){
            if(map.get(key)>maxFreq){
                maxFreq=map.get(key);
                mode=key;
            }
        }
        return mode;
    }*/

// ---------------------------------------------------
    // calculate highest and lowest fequency number
    static int[] highLowFrequency(int arr[]){
        HashMap<Integer,Integer> freq=new HashMap<>();
         for(int elem:arr){
            freq.put(elem,freq.getOrDefault(elem, 0)+1);
         }
         int highestKeyFreq=Integer.MIN_VALUE;
         int highestNum=-1;

         for(int key:freq.keySet()){
            int currentKey=key;
            int currentKeyFrequency=freq.get(key);

            while(currentKeyFrequency>highestKeyFreq){
                highestKeyFreq=currentKeyFrequency;
                highestNum=currentKey;
            }
         }

         int lowestKeyFreq=Integer.MAX_VALUE;
         int lowestNum=-1;

         for(int key:freq.keySet()){
            int currentkey=key;
            int currentKeyFrequency=freq.get(key);

            while(currentKeyFrequency<lowestKeyFreq){
                lowestKeyFreq=currentKeyFrequency;
                lowestNum=currentkey;
            }
         }

         int ans[]={highestNum,lowestNum};
         return ans;


    }











        public static void main(String[] args) {
            
            // reverse an array, one kind of method
        /*int arr[]={2,9,4,8,7};
            for(int i=arr.length-1;i>=0;i--){
                System.out.print(arr[i]+" ");
            }*/
            
            // call the function
            /*int arr[]={2,4,6,8,10};
            reverseArray(arr);*/

            // call the function
            /*int arr[]={10,20,30,40,50,60};
            shiftRightArray(arr);
            for (int k:arr){
                System.out.print(k+" ");
            }*/

            // call the function
            // int arr[]={4,9,21,5,7,3};
            // printAlternate(arr);

            int arr[]={1,2,3,9,5,9,7,8,9,1,9,3,4,5,6,7,8,9};
            int ans[]=highLowFrequency(arr);
            System.out.println("Highest Frequency: "+ans[0]);
            System.out.println("Lowest frequency: "+ans[1]);
            // System.out.println(maxFrequency(arr));






        }
    }