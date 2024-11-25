class Num {
    protected int number;
    public Num(int number) {
        this.number = number;
    }
    public void showNum() {
        System.out.println("The number is: " + number);
    }
}
class HexNum extends Num {

    public HexNum(int number) {
        super(number);
    }
    @Override
    public void showNum() {
        System.out.println("The number in hexadecimal is: " + Integer.toHexString(number).toUpperCase());
        System.out.println("The number in octal is: " + Integer.toOctalString(number));
    }
}
public class Main {
    public static void main(String[] args) {
        Num numObj = new Num(255);
        System.out.println("Using base class:");
        numObj.showNum();

        System.out.println();
        HexNum hexNumObj = new HexNum(255);
        System.out.println("Using derived class:");
        hexNumObj.showNum();
    }
}