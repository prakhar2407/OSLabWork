import java.util.Scanner;

public class FCFS2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int processes[] = new int[5];
        int n = processes.length;
        int burst_time[] = new int[5];
        for (int i = 0; i < processes.length; i++) {
            System.out.println("Enter process id for process "+(i+1));
            processes[i] = scanner.nextInt();
            System.out.println("Enter burst time for process "+(i+1));
            burst_time[i] = scanner.nextInt();
        }
    }

    static void turnAroundTime(int arrivalTime, int burstTime) {

    }
}
