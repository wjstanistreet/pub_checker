// This sobriety class should check if the input
public class Sobriety {
    private int sobriety;

    public Sobriety(int sobriety) {
        if (sobriety >= 0 || sobriety <= 100) {
            this.sobriety = sobriety;
        } else {
            throw new IllegalArgumentException("Sobriety out of range");
        }
    }
}
