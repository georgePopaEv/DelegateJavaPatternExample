



class RealPrinter{
    // the "delegate"

    void print(){
        System.out.println("The Delegate");
    }
}

class Printer{
    //the "delegator"
    RealPrinter p = new RealPrinter();

    // create the delegate
    void print() {
        p.print(); // delegation
    }
}


public class Tester {
    public static void main(String[] args) {
        Printer  p = new Printer();
        p.print(); //delegation

    }
}