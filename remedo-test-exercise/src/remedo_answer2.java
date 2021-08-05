import java.util.Arrays;

public class remedo_answer2 {

    public static void main(String[] args)
    {
// random array
        int [] array = new int [] {90, 23, 5, 109, 12, 22, 67, 34};

        Arrays.sort(array);
        System.out.println("Elements of array sorted in ascending order: ");

        for (int i = 0; i < array.length; i++)
        {
            System.out.println(array[i]);

        }
    }
}
