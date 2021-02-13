public class BinarySearchRecursion {
  public static boolean binarySearch(int[] arr, int target, int low, int high) {
    // target is not found, since low (left) crosses high(right)
    if (low > high) {
      return false;
    } else {
      // set mid by getting index position
      int mid = ((low + high) / 2);
      // return true if the target the value found on arr[mid]
      if (target == arr[mid]) {
        return true;
        // otherwise if the target is less than the number stored at arr[mid]
      } else if (target < arr[mid]) {
        // recursively call binarySearch with same parameters and set the high to
        // (mid -1) shift left
        return binarySearch(arr, target, low, mid - 1);
      } else {
        // recursively call binarySearch with same parameters and set the low to
        // (mid +1) shift right
        return binarySearch(arr, target, mid + 1, high);
      }
    }
  }

  public static void main(String[] args) {
    // sample array
    int[] data = { 14, 19, 22, 44, 69, 102, 119 };
    // passing in data array, target=102, low=0, high=6 (indices)
    System.out.println(binarySearch(data, 102, 0, 6));
  }
}