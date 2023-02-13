package HW10;

public class Main {
    public static void main(String[] args) {
        Author Pushkin = new Author("Александр", "Пушкин");
        Author Tolstoy = new Author("Лев", "Толстой");

        Author Pushkin2 = new Author("Александр", "Пушкин");
        System.out.println(Pushkin.equals(Pushkin2));

        Book capitanDaughter = new Book("Капитанская дочка", Pushkin, 1836);
        Book annaKarenina = new Book("Анна Каренина", Tolstoy, 1877);

        Book annaKarenina2 = new Book("Анна Каренина", Tolstoy, 1877);
        System.out.println(annaKarenina2.equals(annaKarenina2));


        System.out.println(capitanDaughter);
        System.out.println(annaKarenina);

        capitanDaughter.setYearOfPublication(18364);
        System.out.println(capitanDaughter);

        System.out.println(Pushkin.hashCode());
        System.out.println((Tolstoy.hashCode()));
        System.out.println(capitanDaughter.hashCode());
        System.out.println((annaKarenina.hashCode()));
    }
}
