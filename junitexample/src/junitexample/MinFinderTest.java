package junitexample;

public class MinFinderTest {
	
	public static int findMin(int[] array)
    {
            int min=array[0];
            for(int i=1;i<array.length;i++)
            {
                    
                    if(array[i]<min)
                            min=array[i];
            }
            return min;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
