public class Exercise1 {
    public static void main(String[] args) {
        String name="Vivek K Salgaonkar";
        String behaviour=" is a good guy";
        System.out.println("Which character is at position 8: " + name.charAt(8));
        System.out.println(name.concat(behaviour));
        System.out.println("Converting all characters to lower case & upper case: "+name.toLowerCase()+behaviour.toUpperCase());
        System.out.println("Check if the text contains Viv: "+name.contains("viv"));
        System.out.println("Comparing 2 strings: "+name.equalsIgnoreCase(behaviour));
        System.out.println("Check length for Vivek K Salgaonkar:"+name.length());
        System.out.println("Converting character 'k' to 'S': "+name.replace("k", "S"));
        System.out.println("Comparing 2 strings if it ends with same character: "+name.endsWith(behaviour));
    }
}
