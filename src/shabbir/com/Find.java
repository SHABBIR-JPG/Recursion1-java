package shabbir.com;

import java.util.ArrayList;

public class Find {
    static void main(String[] args) {
        int[] arr={1,2,3,4,2,3};
       // int target=3;
        ArrayList<Integer> list=new ArrayList<>();
        ArrayList<Integer> ans=FindAllInteger(arr,1,0,list);
       // System.out.println(ans);
        System.out.println(list);

       // System.out.println(FindAllInteger(arr,target,0,new ArrayList<>()));
    }
  //  static ArrayList<Integer> list=new ArrayList<>();
    static ArrayList<Integer> FindAllInteger(int[] arr, int target, int index,ArrayList<Integer> list ){
        if (index==arr.length){
            return list;
        }
        if (arr[index]==target){
            list.add(index);
        }
        return FindAllInteger(arr,target,index+1,list);

    }
}
