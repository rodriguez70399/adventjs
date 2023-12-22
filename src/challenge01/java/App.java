package challenge01.java;

import java.util.HashSet;
import java.util.Set;

public class App 
{
    public static int findFirstRepeated(int[] gifts)
    {
        Set<Integer> seenGifts = new HashSet<>();
        
        for (Integer gift : gifts) 
        {
            if (seenGifts.contains(gift)) 
            {
                return gift;                
            }
            else
            {
                seenGifts.add(gift);
            }            
        }

        return -1;
    }
    
    public static void main(String[] args) 
    {
        int[] giftIds = {2, 1, 3, 5, 3, 2};
        System.out.println(App.findFirstRepeated(giftIds));
    }   
}
