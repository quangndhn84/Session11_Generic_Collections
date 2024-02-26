package ra.generic;

public class MethodGeneric {
    public  <E> void printElementOfArray(E[] arr) {
        System.out.println("Các phần tử của mảng:");
        for (E element : arr) {
            System.out.println(element);
        }
    }
}
