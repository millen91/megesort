

public class App {
    public static void main(String[] args) throws Exception {
        int [] arr = new int[]{5,2,5,7,1};
        int k = 7;
        int [] solution = countingSort(arr,k);

        for (int i: solution){
            System.out.println(i);
        }
    }

    public static int [] countingSort(int [] arr, int k) {
        int[] counter = new int[k + 1];
        for (int j: arr) {
            counter[j]++;
        }

        int [] solution = new int[arr.length + 1];
        int next = 0;
        for (int i = 0; i <= k; i++) {
            for (int j = 0; j < counter[i]; j++) {
                solution[next++] = i;
            }
        }
        return solution;
    }
}
