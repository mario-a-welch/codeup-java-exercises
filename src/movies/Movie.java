package movies;

public class Movie {
    //Private fields for name and category
    private String name;
    private String category;

    //Constructor that sets name and category
    public Movie(String name, String category) {
        this.name = name;
        this.category = category;
    }

    //Methods to access above properties and allows to change them(getters and setters)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
