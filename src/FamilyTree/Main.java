package FamilyTree;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        FileHandler fileHandler = new FileHandler();
        String file= "src/family_tree/tree.txt";

        FamilyTree familytree = new FamilyTree();


        familytree = (FamilyTree) fileHandler.read(file);


        System.out.println(familytree.getData());

        fileHandler.save(familytree, file);


    }
}