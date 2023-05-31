import java.util.Scanner;

public class No8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try {
            // Input yang ingin ditemukan
            System.out.print("Temukan angka : ");
            int bil = input.nextInt();
            input.close();

            int[][] nums = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

            // perulangan untuk mencari lokasi angka dalam array 2d
            boolean temukan = false;
            for (int i = 0; i < nums.length; i++) {
                for (int j = 0; j < nums.length; j++) {
                    if (nums[i][j] == bil) {
                        System.out.printf("Found %d at [%d][%d]", bil, i, j);
                        temukan = true;
                        break;
                    }
                }
                if (temukan) {
                    break;
                }
            }
            if (!temukan) {
                System.out.println("Bilangan tidak ditemukan");
            }
        } catch (Exception e) {
            System.out.println("input tidak valid");
        }
    }
}
