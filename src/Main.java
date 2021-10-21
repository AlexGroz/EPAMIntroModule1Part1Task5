public class Main {
    public static void main(String[] args) {
        int n = 112233;
        int x = (n - n%10000)/10000;
        int y = (n%10000 - n%100)/100;
        int z = (n%100);

        System.out.println(x + "ч " + y + "мин " + z + "с");
    }
}
