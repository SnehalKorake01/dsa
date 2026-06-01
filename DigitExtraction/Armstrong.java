
class Demo {

    public static void main(String[] args) {
        int n = 151;
        int store = n;
        int rev = 0;
        while (n != 0) {
            int rem = n % 10;
            rev = rev + rem * rem * rem;
            n = n / 10;
        }
        if (store == rev) {
            System.out.println("Armstrong no");
        } else {
            System.out.println("not armstrong");
        }
    }
}
