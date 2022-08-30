package proSky.hw_2908;

public class Main {
    public static void main(String[] args) {
        Author lev = new Author("Lev", "Tolstoy");
        Author max = new Author("Maxim", "Gorkiy");
        Book warAndPeace = new Book("War and Peace", lev, 1934);
        Book mother = new Book("Mother", max, 1920);
        mother.setYearPublication(1929);

        System.out.println("Название книги - " + warAndPeace.getName() + ", Автор - " + warAndPeace.getAuthor().getFirstName() + " " +warAndPeace.getAuthor().getLastName() + ", Год публикации " + warAndPeace.getYearPublication());
        System.out.println("Название книги - " + mother.getName() + ", Автор - " + mother.getAuthor().getFirstName() + " " +mother.getAuthor().getLastName() + ", Год публикации " + mother.getYearPublication());

    }
}
