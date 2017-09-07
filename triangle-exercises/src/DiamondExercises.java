/**
 * Created by pezhang on 05/09/2017.
 */
public class DiamondExercises {
    public static void main(String[] args) {
        DiamondExercises diamondExercises = new DiamondExercises();
        diamondExercises.printDiamondWithName(3);
    }

    public void printLine(String s,int n){
        for (int i = 0; i < n; i++) {
            System.out.print(s);
        }
    }

    public void printIsoscelesTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            this.printLine(" ",n - i);
            this.printLine("*",2 * i - 1);
            System.out.println();
        }
    }

    public void printIsoscelesTriangleWithDefinedLastLine(int n) {
        for (int i = 1; i < n; i++) {
            this.printLine(" ",n - i);
            this.printLine("*",2 * i - 1);
            System.out.println();
        }
        System.out.println("zhangpei");
    }

    public void printIsoscelesTriangleDownAddOneSpace(int n) {
        for (int i = n; i >= 0; i--) {
            this.printLine(" ",n - i + 1);
            this.printLine("*",2 * i - 1);
            System.out.println();
        }
    }

    public void printIsoscelesTriangleDown(int n) {
        for (int i = n; i >= 0; i--) {
            this.printLine(" ", n - i);
            this.printLine("*",2 * i - 1);
            System.out.println();
        }
    }

    public void printDiamond(int n) {
        this.printIsoscelesTriangle(n);
        this.printIsoscelesTriangleDownAddOneSpace(n - 1);
    }

    public void printDiamondWithName(int n) {
        this.printIsoscelesTriangleWithDefinedLastLine(n);
        this.printIsoscelesTriangleDownAddOneSpace(n - 1);
    }
}
