import functions.*;

public class Main {
    public static void main(String[] args) throws InappropriateFunctionPointException, CloneNotSupportedException {
        double[] arr = {1, 2, -1};
        TabulatedFunction tabF1, tabF2;
        System.out.println("Massive:");
        tabF1 = new ArrayTabulatedFunction(0, 2, arr);
        for (int i = 0; i < tabF1.getPointsCount(); i++) {
            System.out.println("f1(" + i + ") = " + tabF1.getPointY(i));
        }
        System.out.println(tabF1);
        System.out.println("Linked list:");
        tabF2 = new LinkedListTabulatedFunction(0, 2, arr);
        for (int i = 0; i < tabF2.getPointsCount(); i++) {
            System.out.println("f2(" + i + ") = " + tabF2.getPointY(i));
        }
        System.out.println(tabF2);
        System.out.println("Equals: " + tabF1.equals(tabF2));
        System.out.println(tabF1.hashCode());
        System.out.println(tabF2.hashCode());
        System.out.println("Exchanging for...(2, -1) -> (1.99, -1)");
        tabF1.setPointX(2, 1.99);
        System.out.println("Equals: " + tabF1.equals(tabF2));
        System.out.println(tabF1.hashCode());
        System.out.println(tabF2.hashCode());
        System.out.println();
        System.out.println("Clone:");
        TabulatedFunction tabF1clone, tabF2clone;
        System.out.println("Original functions:");
        System.out.println(tabF1);
        System.out.println(tabF2);
        System.out.println();
        System.out.println("Cloning is started...");
        tabF1clone = (ArrayTabulatedFunction) tabF1.clone();
        tabF2clone = (LinkedListTabulatedFunction) tabF2.clone();
        System.out.println("Cloning is finished...");
        System.out.println("Cloned functions:");
        System.out.println(tabF1clone);
        System.out.println(tabF2clone);
        System.out.println();
        System.out.println("Exchanging for...(1.99, -1) -> (1.5, -1)");
        tabF1.setPointX(2, 1.5);
        System.out.println("Original function 1:");
        System.out.println(tabF1);
        System.out.println("Cloned function 1:");
        System.out.println(tabF1clone);
        System.out.println("Original function 2:");
        System.out.println(tabF2);
        System.out.println("Exchanging for...(2, -1) -> (1.5, -1)");
        tabF2.setPointX(1, 1.5);
        System.out.println("Original function 2:");
        System.out.println(tabF2);
        System.out.println("Cloned function 2:");
        System.out.println(tabF2clone);
    }
}