package solid.delegationprinciple;

class RealPrinter {
    // this is the delegate
    public void print() {
        System.out.println("The delegate is printing");
    }
}

class Printer {
    // this is the delegator
    private RealPrinter realPrinter = new RealPrinter();

    public void print() {
        realPrinter.print();
    }
}

public class Tester {
    public static void main(String[] args) {
        // to the outside world it looks like Printer actually prints
        Printer printer = new Printer();
        printer.print();
    }
}
