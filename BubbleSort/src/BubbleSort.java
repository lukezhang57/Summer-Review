public class BubbleSort {

    public static int[] bubbleSort(int[] arr){
        if (arr == null || arr.length <= 1){
            return arr;
        }
        for (int i = arr.length-1; i >= 0 ; i--){
            for (int j = 0; j < i; j++){
                if (arr[j] > arr[j+1]){
                    swap(arr, j, j+1);
                }
            }
        }
        return arr;
    }

    private static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    private static void printArray(int[] array){
        for (int i : array){
            System.out.print(i + " ");
        }
    }
    public static void main(String[] args){
        int[] array = {123,2,-5,34,7,1,5,2};
        array = bubbleSort(array);
        printArray(array);
    }
}
