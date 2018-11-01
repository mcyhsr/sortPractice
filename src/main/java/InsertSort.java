public class InsertSort {


    public static int[] insertSort(int[] arr){
        Integer size = arr.length;
        for (int i = 0;i<size;i++){
            for(int j = i-1;j>-1;j--){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args){
        int[] arr = {5,1,3,5,8,2,6,9};
        arr = InsertSort.insertSort(arr);
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i]+",");
        }
    }
}
