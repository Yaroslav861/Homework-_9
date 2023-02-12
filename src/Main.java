public class Main {
    public static void main(String[] args) {
        Author Pushkin = new Author("Александр", "Пушкин");
        Author Tolstoy = new Author("Лев", "Толстой");
        Book capitanDaughter = new Book("Капитанская дочка", Pushkin, 1836);
        Book annaKarenina = new Book("Анна Каренина", Tolstoy, 1877);

        capitanDaughter.printInfo();
        annaKarenina.printInfo();

        capitanDaughter.setYearOfPublication(1840);
        capitanDaughter.printInfo();


    }
}