public class MergeSort {

    public static int[] mergeSort(int[] array){
        if (array.length <= 1){
            return array;
        }
        int midpoint = array.length / 2;
        int[] left = new int[midpoint];
        int[] right;
        if (array.length % 2 == 0){
            right = new int[midpoint];
        }
        else {
            right = new int[midpoint + 1];
        }
        for (int i = 0; i < left.length; i++){
            left[i] = array[i];
        }
        for (int i = 0; i < right.length; i++){
            right[i] = array[i+midpoint];
        }
        left = mergeSort(left);
        right = mergeSort(right);

        int[] result = merge(left, right);
        return result;
    }
    public static int[] merge(int[] left, int[] right){
        int[] sorted = new int[left.length + right.length];
        int leftPointer = 0;
        int rightPointer = 0;
        int sortedPointer = 0;
        while (leftPointer < left.length || rightPointer < right.length){
            if (leftPointer < left.length && rightPointer < right.length){
                if (left[leftPointer] < right[rightPointer]){
                    sorted[sortedPointer] = left[leftPointer];
                    sortedPointer++;
                    leftPointer++;
                }
                else {
                    sorted[sortedPointer] = right[rightPointer];
                    sortedPointer++;
                    rightPointer++;
                }
            }
            else if (leftPointer < left.length){
                sorted[sortedPointer] = left[leftPointer];
                sortedPointer++;
                leftPointer++;
            }
            else if (rightPointer < right.length){
                sorted[sortedPointer] = right[rightPointer];
                sortedPointer++;
                rightPointer++;
            }
        }
        return sorted;
    }
    public static void main(String[] args){
        int[] arr = {5,4,3,2,1};
        int[] sorted = mergeSort(arr);
        for (int i : sorted){
            System.out.print(i + " ");
        }
    }
}
