public class Pyramids_12 {
    public static void main(String[] args) {
        Pyramids_12 pyramids12 = new Pyramids_12();
        pyramids12.printPyramid(3);
        pyramids12.printPyramid(5);
        pyramids12.printPyramid(10);
    }

    public void printPyramid(int n, int row, String stair) {
        int columns = n * 2 - 1;

        if (n == row) {
            return;
        }

        if (columns == stair.length()) {
            System.out.println(stair);
            printPyramid(n, row+1, "");
            return;
        }

        int padding = n - (row + 1);
        if (stair.length() < padding || stair.length() >= columns - padding) {
            stair += " ";
        } else {
            stair += "#";
        }

        printPyramid(n, row, stair);
    }

    public void printPyramid(int n) {
        printPyramid(n, 0, "");
    }
}
