public class Contador {
    Integer n1;
    Integer n2;

    public Contador(int n1, int n2) {
        this.n1 = n1;
        this.n2 = n2;
    }

    public void counter() {
        int i = 1;
        int x = Math.abs(n1-n2);
        while(i <= x) {
            System.out.println("Printing number "+i);
            i++;
        }
        System.out.println("------ / / ------");
    }

    public Integer getN1() {
        return n1;
    }
    public void setN1(Integer n1) {
        this.n1 = n1;
    }

    public Integer getN2() {
        return n2;
    }
    public void setN2(Integer n2) {
        this.n2 = n2;
    }

    @Override
    public String toString() {
        return "Contador [n1=" + n1 + ", n2=" + n2 + "]";
    }
}