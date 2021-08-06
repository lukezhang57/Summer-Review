public class InsertionSort {
    private static void printArray(int[] array){
        for (int i : array){
            System.out.print(i + " ");
        }
    }

    public static int[] sort(int[] array){
        if (array == null || array.length < 2){
            return array;
        }
        for (int i = 1; i < array.length; i++){
            for (int j = i; j > 0; j--){
                if (array[j] < array[j-1]){
                    int current = array[j];
                    array[j] = array[j-1];
                    array[j-1] = current;
                }
                else {
                    break;
                }
            }
        }
        return array;
    }

    public static void main(String[] args){
        int[] arr = {221,6,5,4,3,3,2,1,-19,-19,-193};
        printArray(sort(arr));
    }

}
