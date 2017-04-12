package Lesson8;

/**
 * Created by P-C on 3/24/2017.
 */
public class Article implements Comparable {
    String title;
    int number;

    public Article(String title, int number) {
        this.title = title;
        this.number = number;
    }

    @Override
    public int compareTo(Object o) {
       Article entry = (Article) o;
       int result = title.compareTo(entry.title);
       if (result!=0){
           return result;
       }
        return number - entry.number;
    }
}
