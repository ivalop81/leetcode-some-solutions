package solutions;

public class Octano {
    public int x;
    private int y;
    protected int z;

    public class A2 extends Octano {
        protected int a;
        private int b;

    }

    public class A3 extends A2 {
        private int q;
    }

    public void main(String[] args) {
        A3 a3 = new A3();

    }
}
