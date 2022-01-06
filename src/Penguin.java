public class Penguin {
    //Give your class the following private fields(Name, Weight, Species, Sex)

    private String name;
    private double weight;
    private String species;
    private char sex;

    //Give your class a constructor method-[cmd-n-select constructor]
    public Penguin(String name, double weight, String species, char sex) {
        this.name = name;
        this.weight = weight;
        this.species = species;
        this.sex = sex;
    }

    //Give your class the following public methods(getName, getWeight, getSpecies, getSex, setName, setWeight, setSpecies, setSex)[cmd-n-select getter setter]
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    //Give your class the following public static methods(canFly-returns false, areEvil-returns true)
    public static boolean canFly(){
        return false;
    }

    public static boolean areEvil(){
        return true;
    }
}
