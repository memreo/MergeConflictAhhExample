public class StringBuilderExample {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder("Hello");

        // Modify the string using append
        builder.append(" World");
        builder.append("!");
        
        System.out.println(builder.toString()); // Output: Hello World!

        // Insert text at a specific position
        builder.insert(6, "Java ");
        System.out.println(builder.toString()); // Output: Hello Java World!

        // Delete a part of the string
        builder.delete(6, 11);
        System.out.println(builder.toString()); // Output: Hello World!
    }
}