import java.text.ParseException;
import java.util.Scanner;

class FCFS {
    static void findWaitingTime(int processes[], int n,int bt[], int wt[]) {
        wt[0] = 0;
        for (int i = 1; i < n; i++) {
            wt[i] = bt[i - 1] + wt[i - 1];
        }
    }
    static void findTurnAroundTime(int processes[], int n, int bt[], int wt[], int tat[]) {
        for (int i = 0; i < n; i++) {
            tat[i] = bt[i] + wt[i];
        }
    }
    static void findavgTime(int processes[], int n, int bt[]) {
        int wt[] = new int[n], tat[] = new int[n];
        int total_wt = 0, total_tat = 0;
        findWaitingTime(processes, n, bt, wt);
        findTurnAroundTime(processes, n, bt, wt, tat);
        System.out.printf("Processes Burst time Waiting" +" time Turn around time\n");
        for (int i = 0; i < n; i++) {
            total_wt = total_wt + wt[i];
            total_tat = total_tat + tat[i];
            System.out.printf(" %d ", (i + 1));
            System.out.printf("     %d ", bt[i]);
            System.out.printf("     %d", wt[i]);
            System.out.printf("     %d\n", tat[i]);
        }
        float s = (float)total_wt /(float) n;
        int t = total_tat / n;
        System.out.printf("Average waiting time = %f", s);
        System.out.printf("\n");
        System.out.printf("Average turn around time = %d ", t);
    }
    public static void main(String[] args) throws ParseException {
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
        findavgTime(processes, n, burst_time);
    }
}