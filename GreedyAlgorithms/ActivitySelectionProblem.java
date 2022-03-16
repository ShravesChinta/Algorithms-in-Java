class ActivitySelectionProblem {

    public void printMaxActivities(int n, String activityname[], int starttime[], int endtime[]) {
        int i = 0;
        System.out.println(activityname[0]);
        for (int j = 1; j < n; j++) {
            if (endtime[i] <= starttime[j]) {
                System.out.println(activityname[j]);
                i = j;
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        ActivitySelectionProblem asp = new ActivitySelectionProblem();
        int s[] = { 1, 3, 0, 5, 8, 5 };
        int e[] = { 2, 4, 6, 7, 9, 9 };
        String activityname[] = { "A3", "A1", "A4", "A5", "A2", "A6" };
        asp.printMaxActivities(6, activityname, s, e);
    }
}
