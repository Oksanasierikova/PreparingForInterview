package Lesson3;

public class Lesson3Part2 {
    static String[] titles = new String[5];
    static String[] texts = new String[5];
    static String[] images = new String[5];

    public static void main(String[] args) {
        initArticles();
        printArticles();
    }

    private static void initArticles() {
        for (int i = 0; i < 5; i++) {
            titles[i] = "Article " + i;
            texts[i] = "Some text " + i;
            images[i] = "http://images.com/en2j3" + i;
        }
    }
    private static void printArticles() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Article name: " + titles[i]);
            System.out.println("Article text: " + texts[i]);
            System.out.println("Image url: " + images[i]);
        }
    }
}
