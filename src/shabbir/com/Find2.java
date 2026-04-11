package shabbir.com;

import java.util.ArrayList;

public class Find2 {
    static void main(String[] args) {
        int[] arr={1,2,3,4,4,5};
        ArrayList<Integer> ans=Find(arr,4,0);
        System.out.println(ans);
    }
    static ArrayList<Integer> Find(int[] arr,int target,int index){
        ArrayList<Integer> list=new ArrayList<>();
        if (index==arr.length){
            return list;
        }
        if (arr[index]==target){
            list.add(index);
        }
        ArrayList<Integer> ansFromBelowCalls=Find(arr,target,index+1);
        list.addAll(ansFromBelowCalls);
        return list;
    }
}
