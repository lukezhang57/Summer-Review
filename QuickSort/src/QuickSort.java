public class QuickSort {

    public static void quickSort(int[] array, int left, int right){
        if (left >= right){
            return;
        }
        int p = partition(array, left, right);

        quickSort(array, left, p-1);
        quickSort(array, p+1, right);
    }

    private static int partition(int[] array, int left, int right){
        int pivot = array[right];
        int j = left - 1;
        for (int i = left; i < right; i++){
            if (array[i] < pivot){
                j++;
                swap(array,i,j);
            }
        }
        swap(array,j+1,right);
        return j+1;
    }

    private static void swap(int[] array, int index1, int index2){
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    private static void printArray(int[] array){
        for (int i : array){
            System.out.print(i + " ");
        }
    }
    public static void main(String[] args){

    }
}
