public class Strings{
    public static void main(String[] args)
    {
        String str1 = "Hello";
        String str2 = "World";

        //Concatenating strings
        String greetings = str1 +" "+ str2 +"!";

        //Displaying the concatenated string
        System.out.println("Concatenated Strings >> "+ greetings);

        //finding the length of the string
        int length = greetings.length();
        System.out.println("Length of the string: " + length);

        //accessing individual character from the string
        char firstChar = greetings.charAt(0);
        char lastChar = greetings.charAt(length-1);
        System.out.println("First character >> "+ firstChar);
        System.out.println("Last character >> "+ lastChar);

        //converting a string to lowercase
        String lowercaseGreetings = greetings.toLowerCase();
        System.out.println("Lowercase string >> "+ lowercaseGreetings);

        //converting a string to uppercase
        String uppercaseGreetings = greetings.toUpperCase();
        System.out.println("Uppercase string >> "+ uppercaseGreetings);

        //extracting a substring
        String substring = greetings.substring(2, 6);
        System.out.println("substring >> "+ substring);

        //splitting
        String[] words =greetings.split(" ");
        for(String word : words)
        {
            System.out.println("Splitting words >> "+ word);
        }
    }
}