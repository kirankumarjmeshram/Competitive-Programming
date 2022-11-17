/*
 * Insertion is a basic but frequently used operation. Arrays in most languages cannnot be dynamically shrinked or expanded. Here, we will work with such arrays and try to insert an element at some index.

You are given an array arr(0-based index). The size of the array is given by sizeOfArray. You need to insert an element at given index and print the modified array.
 */
public class ArrayInsertAtIndex {
    public void insertAtIndex(int arr[],int n,int index,int element)
    {
      for ( int i = n-1; i > index; i--){
          arr[i] = arr[i-1];
      }
      arr[index] = element;
    }
}
