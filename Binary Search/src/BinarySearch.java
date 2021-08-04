public class BinarySearch {
    public static int binarySearch(int[] array, int value, int left, int right){
        if (left > right){
            return -1;
        }
        int middle = (left + right) / 2;
        if (value < array[middle]){
            right = middle - 1;
        }
        else if (value > array[middle]){
            left = middle + 1;
        }
        else {
            return middle;
        }
        return binarySearch(array, value, left, right);
    }

    public static void main(String[] args){
        int[] array = {1,3,7,10,84,115};
        int target = 7;
        int start = 0;
        int end = array.length - 1;
        System.out.println(binarySearch(array, target, start, end));
        System.out.println("Expected: 1");
    }
}
