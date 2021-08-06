public class SelectionSorter {
    private static void printArray(int[] arr){
        for (int i : arr){
            System.out.print(i + " ");
        }
    }
    private static int[] selectionSort(int[] array){
        if (array == null || array.length <= 1){
            return array;
        }
        int minIndex;
        for (int i = 0; i < array.length-1; i++){
            minIndex = i;
            for (int j = i + 1; j < array.length; j++){
                if (array[j] < array[minIndex]){
                    minIndex = j;
                }
            }
            int temp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = temp;
        }
        return array;
    }
    public static void main(String[] args){
        int[] arr = {100,90,80,20,10,-74};
        printArray(selectionSort(arr));
    }

}
