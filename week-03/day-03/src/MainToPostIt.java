import javafx.geometry.Pos;

public class MainToPostIt {
  public static void main(String[] args) {

    PostIt post1 = new PostIt();
    post1.backgroundColor = "orange";
    post1.text = "Idea 1";
    post1.textColor = "blue" ;

    PostIt post2 = new PostIt();
    post2.backgroundColor = "pink";
    post2.text = "Awesome";
    post2.textColor = "black";

    PostIt post3 = new PostIt();
    post3.backgroundColor = "yellow";
    post3.text = "Superb!";
    post3.textColor = "green";

    //or

    PostIt post4 = new PostIt("red", "Cool", "white");

  }
}
