public class TestArrays {
    /*
     * 1. Write a method reverseArray() that takes an array of integers as a
     * parameter, called numArray; the method reverses numArray, i.e. it reverses
     * the array elements so that the first element becomes the last element, the
     * second element becomes the second to last element, and so on, with the old
     * last element now first. Do not just reverse the order in which they are
     * printed; actually change the way they are stored in the array. Do not create
     * a second array; just rearrange the elements within the array you have. (Hint:
     * Swap elements that need to change places.) 2. Embed this method in a program
     * TestArrays and test this method with an array containing {2,4,7,1, 5, 9};
     * After the method execution is done, print each element of the array.
     */

    public static void reverseArray(int numArray[]) {
        int start = 0;

        for (int end = (numArray.length); start != end; end--) {
            int now = numArray[end - 1];
            numArray[end - 1] = numArray[start];
            numArray[start] = now;
            start++;
        }
    }

    public static void main(String[] args) {
        int myArray[] = { 2, 4, 7, 1, 5, 9 };
        reverseArray(myArray);
        for (int element : myArray) {
            System.out.print(element + " ");
        }
    }
}