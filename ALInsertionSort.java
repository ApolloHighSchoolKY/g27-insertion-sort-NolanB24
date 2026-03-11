import java.util.ArrayList;
import java.util.Arrays;
public class ALInsertionSort
{

    public static void main(String[] args)
    {
    	Integer myNumbers[] = {0, 15, 6, 8, 2, 37};
    	ArrayList<Integer> sorted = new ArrayList<Integer>();
    	boolean inserted=false;
		int passes = myNumbers.length;
		//Add the first number to the array list
		sorted.add(myNumbers[0]);
		//Loop once for all of the remaining numbers in the unsorted list
		for(int pass = 1; pass < passes; pass++)
		{
			//Check with each of the numbers in the sorted list
			for(int y = 0; y < sorted.size(); y++)
			{
				if(myNumbers[pass] < sorted.get(y))
				{
					sorted.add(myNumbers[pass],y);
				}

					
			}
				sorted.add(myNumbers[pass]);
				//If this number is less than one in the sorted list,
				//insert it there
		}
			

			//If it was not inserted, stick it on the end.


		//End Loop for unsorted list

		System.out.println(sorted);

		//Move the data back to the array
		for(int x = 0; x < sorted.size(); x++)
			myNumbers[x] = sorted.get(x);
		//Print the contents of the array
		System.out.println(Arrays.toString(myNumbers));
    }


}
