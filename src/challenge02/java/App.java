package challenge02.java;

import java.util.stream.Stream;

public class App 
{
    public static String[] manufacture(String[] gifts, String materials) 
    {
        return Stream.of(gifts)
            .filter(gift -> gift.chars()
                .mapToObj(letter -> String.valueOf((char)letter))
                .allMatch(letter -> materials.contains(letter)))
            .toArray(String[]::new);
    }

    public static void main(String[] args) 
    {
        String[] gifts = {"tren", "oso", "pelota"};
        String materials = "tronesa";
        Stream.of(manufacture(gifts, materials))
        .forEach(result -> System.out.println(result));
    }    
}
