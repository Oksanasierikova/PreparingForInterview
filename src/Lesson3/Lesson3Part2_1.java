package Lesson3;

public class Lesson3Part2_1 {

static Article[] articles = new Article[5];

    public static void main(String[] args) {
    initArticles();
        //System.out.println(Lesson3Part2_1.initArticles());
    }

    static void initArticles() {
        for (int i = 0; i < 5; i++) {
            Article article = new Article(); //create object of class
            article.title = "Article " + i;  //set object title
            article.text = "Some text " + i;  //set object title
            article.imageURL = "http://images.com/en2j3" + i;
            articles[i] = article;
        }
    }

}
