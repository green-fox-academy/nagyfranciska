class Tree {

  String type;
  String leafColor;
  int age;
  String sex;

}

public class TreeType  {
  public static void main(String[] args) {

    Tree tree1 = new Tree();
    tree1.type = "Birch";
    tree1.leafColor = "green";
    tree1.age = 40;
    tree1.sex = "male";

    Tree tree2 = new Tree();
    tree2.type = "Pine";
    tree2.leafColor = "silver";
    tree2.age = 35;
    tree2.sex = "male";

    Tree tree3 = new Tree();
    tree3.type = "Willow";
    tree3.leafColor = "green";
    tree3.age = 70;
    tree3.sex = "unisex";

    Tree tree4 = new Tree();
    tree4.type = "Cedar";
    tree4.leafColor = "green";
    tree4.age = 1000;
    tree4.sex = "unisex";

    Tree tree5 = new Tree();
    tree5.type = "Oak";
    tree5.leafColor = "green";
    tree5.age = 250;
    tree5.sex = "female";

  }
}
