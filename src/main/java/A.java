public class A {
    private int no;

    public A() {
    }

    public A(int no) {
        this.no = no;
        this.no++;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }
}
