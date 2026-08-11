
public class array_imp_questions {


    // Find repeanting element
  /*   static void findRepeating(int arr[]){
       int n=arr.length;
       for(int i=0;i<n;i++){
        for(int j=i+1;j<n;j++){
            if(arr[i]==arr[j]){
                System.out.println("Repeating element: "+arr[i]);
                System.out.println("Fisrt index: "+i);
                System.out.println("Element find at index: "+j);
                return;

            }
        }
       }

       System.out.println("No elem found");
    }*/

// ------------------------------------------------

    // another method to Mode
    /*
    HashMap<Integer> freq=new HashMap<>();

    for(int num:arr){
    freq.put(num,freq.getOrDefault(num,0)+1);
    
    }
    for(int i:arr){
        if(freq.get(i)>1){
            returns i;
        }

    }
        return -1;
    */


    public static void main(String[] args) {



        // arraySort0and1
        /*int arr[]={0,1,0,1,0,1,1,0};

        int n=arr.length;
        int i=0;
        int j=n-1;

        while(i<j){
            if(arr[i]==1 && arr[j]==0){
                arr[i]=0;
                arr[j]=1;
            }
            if(arr[i]==0){
                i++;
            }
            if(arr[j]==1){
                j--;
            }
        }
        // print the sorted array
        for(int nums:arr){
            System.out.print(nums+" ");
        }*/

        // find the missing element(0 <-> n)
        /*int nums[]={0,2,3,5,1};

        int xorSum=0;

        for(int i:nums){
            xorSum=xorSum^i;
        }
        int n=nums.length;
        for(int j=0;j<=n;j++){
            xorSum=xorSum^j;
        }

        System.out.println("Missing valu is: "+xorSum);*/


        // find the unique element in an array
        /*int arr[]={7,6,6,5,7,5,1,4,4};
        int xorSum=0;
        for(int e:arr){
            xorSum=xorSum^e;
        }
        System.out.println("Unique Element: "+xorSum);*/


        // ----------------------------------------------
        // int arr[]={1,5,3,2,4,6,3,5};
        // findRepeating(arr);
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    }




}