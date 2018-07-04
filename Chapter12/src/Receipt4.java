//: strings/Receipt.java
/*
Exercise 4: (3) Modify Receipt.java so that the widths are all controlled by
a single set of constant values. The goal is to allow you to easily change a
width by changing a single value in one place.
 */
import java.util.*;

public class Receipt4 {
    int itemF = -15;
    int QtyF = 5;
    int PriceF = 10;
    private String format = "%" + itemF + "s %" + QtyF + "s %" + PriceF + "s\n";
    private double total = 0;
    private Formatter f = new Formatter(System.out);
    public void printTitle() {
        f.format(format, "Item", "Qty", "Price");
        f.format(format, "----", "---", "-----");
    }
    public void print(String name, int qty, double price) {
        f.format("%" + itemF + "." + java.lang.Math.abs(itemF) + "s %" + QtyF +"d %" + PriceF + ".2f\n", name, qty, price);
        total += price;
    }
    public void printTotal() {
        f.format("%" + itemF + "s %" + QtyF + "s %" + PriceF +".2f\n", "Tax", "", total*0.06);
        f.format(format, "", "", "-----");
        f.format("%" + itemF + "s %" + QtyF + "s %" + PriceF +".2f\n", "Total", "",
                total * 1.06);
    }
    public static void main(String[] args) {
        Receipt4 receipt = new Receipt4();
        receipt.printTitle();
        receipt.print("Jack's Magic Beans", 4, 4.25);
        receipt.print("Princess Peas", 3, 5.1);
        receipt.print("Three Bears Porridge", 1, 14.29);
        receipt.printTotal();
    }
} /* Output:
Item              Qty      Price
----              ---      -----
Jack's Magic Be     4       4.25
Princess Peas       3       5.10
Three Bears Por     1      14.29
Tax                         1.42
                           -----
Total                      25.06
*///:~
