import java.util.Arrays;

public class StringTester{
   public static void main(String[] args) {
      int[] array1 = {1, 2, 3};
      int[] array2 = {1, 2, 3};

      System.out.println("Arrays: array1 = [1, 2, 3], array 2 = [1, 2, 3]");
      System.out.println("results: " + (array1 == array2));
      System.out.println("Arrays.equals() results: " + Arrays.equals(array1,array2));

      Object[] objArray1 = {array1};
      Object[] objArray2 = {array2};
      System.out.println("Arrays.equals() results: " + Arrays.equals(objArray1,objArray2));

      System.out.println("Arrays.deepEquals() results: " + Arrays.deepEquals(objArray1,objArray2));

   }
}
