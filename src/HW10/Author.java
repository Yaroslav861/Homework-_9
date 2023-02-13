package HW10;

import java.util.Objects;

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
    public String toString() {
        return name + "" + famille;
    }
    public boolean equals(Object o){
        if(o == null || getClass() != o.getClass()){
            return false;
        }
        Author author = (Author) o;
        return name.equals(author.getName()) && famille.equals(author.getFamille());
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, famille);
    }
}

