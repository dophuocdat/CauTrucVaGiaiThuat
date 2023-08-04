public class Find_Numbers {

    public static int containsNumber(int a) {
        int count = 0;
        int kq = a;
        while (kq != 0) {
            kq = a / 10;
            a = kq;
            count++;
        }

        return count;
    }

    public static int findNumber(int[] nums) {
        int count = 0;
        for (int i : nums) {
            if (containsNumber(i) % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] a = { 12, 345, 2, 6, 7896 };

        System.out.println(findNumber(a));
    }
}
