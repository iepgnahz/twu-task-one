public class TriangleExercises {
    public static void main(String[] args) {
        TriangleExercises triangleExercises = new TriangleExercises();
        triangleExercises.printHorizontalLine(8);
        System.out.println();
        triangleExercises.printVerticalLine(3);
        System.out.println();
        triangleExercises.printTriangle(3);
    }

    public void printHorizontalLine(int n){
        for(int i=0;i<n;i++){
            System.out.print("*");
        }
    }

    public void printVerticalLine(int n){
        for(int i=0;i<n;i++){
            System.out.println("*");
        }
    }

    public void printTriangle(int n){
        for(int i=1;i<=n;i++){
            this.printHorizontalLine(i);
            System.out.println();
        }
    }
}
