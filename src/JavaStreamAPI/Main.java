package JavaStreamAPI;

import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        // Create an instance of JavaStream
        javaStream javaStream = new javaStream();

        // Use reflection to access the private method (since getFootballers is private)
        try {
            // Access the private method getFootballers
            var method = javaStream.class.getDeclaredMethod("getFootballers");
            method.setAccessible(true);

            // Invoke the method and cast the result to the expected type
            @SuppressWarnings("unchecked")
            List<Footballer> footballerList = (List<Footballer>) method.invoke(javaStream);


            // Invoke the method and cast the result to the expected type
            List<Footballer> collect = footballerList.stream()
                    .filter(footballer -> footballer.getGender().equals(Gender.FEMALE))
                    .filter(footballer -> footballer.getAge() > 23)
                    .filter(footballer -> footballer.getPositions().contains("CF"))
                    .collect(Collectors.toList());

            // Print the list of footballers
            collect.forEach(System.out::println);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
