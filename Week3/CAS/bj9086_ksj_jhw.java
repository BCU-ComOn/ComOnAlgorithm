public class bj9086_ksj {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for (int i = 0; i < num; i++) {
            String str = sc.next();
            String arr[] = str.split("");
            System.out.println(arr[0] + arr[arr.length - 1]);
        }
    }
}
