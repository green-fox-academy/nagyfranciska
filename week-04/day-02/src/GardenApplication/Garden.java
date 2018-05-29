package GardenApplication;
import java.util.ArrayList;

public class Garden {

  double waterAmount;
  ArrayList<Flower> flowers;
  ArrayList<Tree> trees;

  public Garden() {
    flowers = new ArrayList<>();
    trees = new ArrayList<>();
    waterAmount = 0;
  }

  public ArrayList addFlowers(Flower flower) {
    flowers.add(flower);
    return flowers;
  }

  public ArrayList addTrees(Tree tree) {
    trees.add(tree);
    return trees;
  }

  public void info() {                    // this after watering
    for (Flower flower : flowers) {
      if (flower.flowerWaterAmount < 5) {
        System.out.println("The " + flower + "Flower needs water.");
      } else {
        System.out.println("The " + flower + "Flower doesn't need water.");
      }
    }
    for (Tree tree : trees) {
      if (tree.treeWaterAmount < 10) {
        System.out.println("The " + tree + "Tree needs water.");
      } else {
        System.out.println("The " + tree + "Tree doesn't need water.");
      }
    }
  }
}
