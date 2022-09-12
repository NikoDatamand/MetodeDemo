public class Person {

    private int alder;
    private double højde;

    public Person(int alder, double højde) {
        this.alder = alder;
        this.højde = højde;
    }

    public int getAlder() {
        return alder;
    }
    public double getHøjde() {
        return højde;
    }

    public void setAlder(int alder) {
        this.alder = alder;
    }
    public void setHøjde(double højde) {
        this.højde = højde;
    }

    public void harFødselsdag() {
        alder++;
    }
}
