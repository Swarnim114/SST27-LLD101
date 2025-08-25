public class BasicPrinter implements Printing , Machine {
    @Override
    public void Print(String text){ System.out.println("Print: "+text); }

}
