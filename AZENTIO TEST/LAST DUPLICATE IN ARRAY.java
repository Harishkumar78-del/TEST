\\LAST DUPLICATE IN ARRAY
public class LastDuplicateFinder
 {
    public static void main(String[] args) {
        int[] arr = {3, 5, 2, 4, 5, 2, 1};

        Integer lastDuplicate = null;

        for (int i = 0; i < arr.length; i++) {

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    lastDuplicate = arr[i];
                    break; }
            }
        }

        if (lastDuplicate != null) {
            System.out.println("Last duplicate is: " + lastDuplicate);
        } else {
            System.out.println("No duplicates found.");
        }
    }
}