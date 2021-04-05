public class bj2675_ksj {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        for (int i = 0; i < len; i++) {
            int cnt = sc.nextInt();
            String[] str = sc.next().split("");
            for (int j = 0; j < str.length; j++) {
                for (int k = 0; k < cnt; k++) {
                    System.out.print(str[j]);
                }
            }
            System.out.println();

        }

    }
}
