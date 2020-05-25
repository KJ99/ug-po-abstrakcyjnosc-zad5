package konrad.jezierski;

public class Main {

    public static void main(String[] args) {
        int[] arr = new int[]{10, 20, 30, 10, 20};
        int el = 30;
        WyszukiwanieRownych wr = new WyszukiwanieRownych();
        int index = wr.szukaj(arr, el);
        String res = index >= 0 ? "Znaleziono w indeksie numer: " + index : "Nie znaleziono";
        System.out.println(res);
    }
}
