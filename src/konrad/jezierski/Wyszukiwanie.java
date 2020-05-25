package konrad.jezierski;

public abstract class Wyszukiwanie {
    public abstract boolean porownaj(int a, int b);

    public int szukaj(int[] a, int ele) {
        for(int i=0; i < a.length; i++) {
            if ( porownaj(a[i], ele) ) { return i;
            }
        }
        return -1;
    }
}
