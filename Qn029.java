// program to print the second smallest number of array elements
public class Qn029{
    public static void main(String[] args){
        int arrayVar[] = {12, 6, 17, 9};
        for(int i = 0; i<4; i++)
        {
            for(int j = i+1; j<4; j++)
            {
                if(arrayVar[i] > arrayVar[j])
                {
                    int temp = arrayVar[i];
                    arrayVar[i] = arrayVar[j];
                    arrayVar[j] = temp;
                }
            }
        }
        System.out.println("Second smallest number is: " + arrayVar[1]);
    }
}