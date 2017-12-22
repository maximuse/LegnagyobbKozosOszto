package hu.nyirszikszi.legnagyobbkozososzto;


public class LegnagyobbKozosOszto {
    private int a;
    private int b;

    public LegnagyobbKozosOszto(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getLnko() {
        int c = 0;

        while(this.b>0) {
            c = b;
            b = a % b;
            a = c;
        }

        return a;
    }
}