package shabbir.com;

public class Sorted {
    static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
        System.out.println(sorted(arr,0));

    }
    static boolean sorted(int[] arr,int index){
        //base condition of the  function
        if (index==arr.length-1){
            return true;
        }
        return arr[index]<arr[index+1]&&sorted(arr,index+1);
    }
}
