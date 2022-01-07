public class ServerNameGenerator {
    //Two arrays that contain String elements: One with at least 10 adjectives, the other with at least 10 nouns.
    public static String[] adjectives = {"Courageous", "Historical", "Legendary", "Logical", "Shocking", "Swift", "Rabid", "Determined", "Frightening", "Ruthless"};
    public static String[] nouns = {"Computer", "Event", "Currency", "Flower", "Animal", "Aardvark", "LLama", "Justice", "Java", "Apple"};

    //Method that will return a random element from an array of strings
    public static String randomElement(String[] element){
        return element[(int)Math.floor((Math.random() * (element.length - 1)))];
    }

    //Main method that selects a random noun and adjective and hyphenates the combination
    public static void main(String[] args){
        System.out.println("Here is your server name:");
        System.out.println(randomElement(adjectives) + "-" + randomElement(nouns));
    }
}
