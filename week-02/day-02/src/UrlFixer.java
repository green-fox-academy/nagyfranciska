public class UrlFixer {
  public static void main(String[] args) {

    String url = "https//www.reddit.com/r/nevertellmethebots";

    url = url.replace("bots","odds");
    url = url.replace("//","://");
    System.out.println(url);

    //or

    String url2 = "https//www.reddit.com/r/nevertellmethebots";
    url2 = url2.replace("bots","odds");
    url2 = url2.substring(0,5) + ":" + url2.substring(5);
    System.out.println(url2);

  }
}
