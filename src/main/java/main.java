public class main {

    public static void main(String[] args) {

        int[] abc = {1,2,4};
        solution(abc);
    }

    private static void solution(int[] A) {

        int c = 0;
        for (int b : A) {
            if (c<b) {
                c = b + 1;
            }
        }
        System.out.println(c);

    }


}
