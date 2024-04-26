package challenge03.java;

public class App 
{
    public static String findNaughtyStep(String original, String modified) 
    {
        String firstStepChanged = "";
        String bigger = original;
        String smaller = modified;

        if (original.length() < modified.length()) 
        {
            bigger = modified;
            smaller = original;
        }

        for (int i = 0; i < smaller.length() && firstStepChanged.equals(""); i++) 
        {
            if (bigger.charAt(i) != smaller.charAt(i)) 
            {
                firstStepChanged = String.valueOf(bigger.charAt(i)); 
            }
        }

        if (bigger.length() > smaller.length() && firstStepChanged.equals("")) 
        {
            firstStepChanged = String.valueOf(bigger.charAt(bigger.length()-1));
        }

        return firstStepChanged;
    }

    public static void main(String[] args) 
    {
        String original = "stepfor";
        String modified = "stepor";
        System.out.println("Resultado: " + findNaughtyStep(original, modified)); // 'e'
    }    
}