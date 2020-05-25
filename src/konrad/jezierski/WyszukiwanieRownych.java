package konrad.jezierski;

public class WyszukiwanieRownych extends Wyszukiwanie {
    @Override
    public boolean porownaj(int a, int b) {
        return  a == b;
    }
}
