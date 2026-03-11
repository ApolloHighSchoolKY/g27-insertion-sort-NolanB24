import java.util.Arrays;
public class AInsertionSort
{

    public static void main(String[] args)
    {
        
    	Integer myNumbers[] = {0,17,6,8,37,2};
        int passes = myNumbers.length;
        //int comparisons = passes;
        int storeNum;
        //This loops through the cards that you are going to compare.
        //Passes = myNumbers.length - 1,(in case i forget)
        for(int pass = 1; pass < passes; pass++)
        {
            System.out.println(Arrays.toString(myNumbers));
           //This loops through the cards that you are going to compare the first too, 
            //going until the end, or it is less than the current number
            for(int comp = 0; comp < pass - 1; comp ++)
            {
                //This checks to see if the number that you are holding to compare is less than
                //the one you are currently at starting at 0
                //If you are less than, store the number you are holding, and then loop through to 
                //push the other positions up
                if(myNumbers[pass] < myNumbers[comp])
                {
                    storeNum = myNumbers[pass];
                    for(int i = pass; i > 0; i--)
                    {
                        myNumbers[i] = myNumbers[i - 1];
                    }
                    myNumbers[comp] = storeNum;
                    comp--;
                }
                        
            }
            //System.out.println(Arrays.toString(myNumbers));
 
        }
            

                        
        System.out.println(Arrays.toString(myNumbers));            
                    
    }
}
