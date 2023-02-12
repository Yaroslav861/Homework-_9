public class Author {
    private String name;
    private  String famille;

    public Author(String name, String famille) {
        this.name = name;
        this.famille = famille;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFamille() {
        return famille;
    }

    public void setFamille(String famille) {
        this.famille = famille;
    }
}
