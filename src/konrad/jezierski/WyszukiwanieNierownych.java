package konrad.jezierski;

public class WyszukiwanieNierownych extends Wyszukiwanie {
    @Override
    public boolean porownaj(int a, int b) {
        return a != b;
    }
}
