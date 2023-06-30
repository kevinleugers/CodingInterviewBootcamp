public class Steps_11 {
    public static void main(String[] args) {
        System.out.println("Printing Steps");

        // Steps - Recursive solution
        Steps_11 steps11 = new Steps_11();
        steps11.printSteps(3);
    }
    public void printSteps(int n, int row, String stair) {
        if (n == row) {
            return;
        }

        if (n == stair.length()) {
            System.out.println(stair);
            printSteps(n, row+1, "");
            return;
        }

        if (stair.length() <= row) {
            stair += "#";
        } else {
            stair += " ";
        }

        printSteps(n, row, stair);
    }

    public void printSteps(int n) {
        printSteps(n, 0, "");
    }
}
