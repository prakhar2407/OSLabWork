import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class SJTF {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter no of processes: ");
        int processes = scanner.nextInt();
        int[][] processArray = new int[processes][];
        for (int i = 0; i < processArray.length; i++) {
            for (int j = 0; j < 5;) {
                System.out.println("Please Enter Arrival Time and Burst Time of Process P" + i);
                processArray[i][j] = scanner.nextInt();
                j++;
                processArray[i][j] = scanner.nextInt();
                j++;
            }
        }
        Queue<Integer> priorityQueue = new LinkedList<>();
    }

}
