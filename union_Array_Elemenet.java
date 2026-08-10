
import java.util.HashSet;

/**
 * union_Array_Elemenet
 */
public class union_Array_Elemenet {


    static void unionElement(int arr1[],int arr2[]){
        HashSet<Integer> set=new HashSet<>();

        for(int elem:arr1){
            set.add(elem);
        }

        for(int elem:arr2){
            set.add(elem);
        }

        // print the union array
        for(int unionElem:set){
            System.out.print(unionElem+" ");
        }


    }

    public static void main(String[] args) {
        

        int arr1[]={4,1,3,8};
       int arr2[]={1,9,6};
       
       unionElement(arr1, arr2);

    }
}