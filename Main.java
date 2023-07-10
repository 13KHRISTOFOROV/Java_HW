public class Main {
    public static void main(String[] args) {

        String simpleString = new String("I study Basic Java!");
        System.out.println(simpleString);
        System.out.println(simpleString.length());

        System.out.println(simpleString.charAt(18));

        System.out.println(simpleString.contains("Java"));

        System.out.println(simpleString.replace('a', '0'));

        System.out.println(simpleString.toUpperCase());

        System.out.println(simpleString.toLowerCase());

        System.out.println(simpleString.substring(0,13));

        System.out.println(simpleString.substring(0,13) + "!");

        /** int index = simpleString.indexOf("Java");
         System.out.println(simpleString.substring(index)); **/

        // int index = simpleString.indexOf("Java");
        // System.out.println(simpleString.substring(index));



        System.out.println("============Mathematical operations============");

        int a = 10;
        int b = 7;
        int c = a + b;
        System.out.println(c);

    }
}
