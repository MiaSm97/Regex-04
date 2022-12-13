package exercise.regex;

public class Start {
    public static void main(String[] args) {
        String string = "x3z ? xYz ! R1 && __";
        System.out.println(string.replaceAll("[0-9,a-z]", "*"));
    }
}
    /*You have a string with the following value: x3z ? xYz ! R1 && __
        with a regular expression, change into * every occurrence of a lowercase letter or of a digit between 0 and 9
        print the result*/
