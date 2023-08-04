public class Remove_Element_By_Two_Pointer {

    public static int removeElement(int[] a, int val) {
        int k = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != val) {
                a[k] = a[i];
                k++;
            }

        }
        return k;
    }

    public static void main(String[] args) {
        int[] a = { 3, 2, 2, 3 };
        System.out.println(removeElement(a, 2));
        System.out.println("DONE");
    }
}
