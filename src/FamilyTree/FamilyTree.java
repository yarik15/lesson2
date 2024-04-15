package FamilyTree;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class FamilyTree implements Serializable {

    private List<Human> humanList;

    public FamilyTree()
    {
        this(new ArrayList<>());
    }

    public FamilyTree(List<Human> humanList)
    {
        this.humanList = humanList;
    }

    public boolean add(Human human)
    {
        if (human == null) return false;
        if (!humanList.contains(human))
        {
            humanList.add(human);
            if (human.getFather() != null) human.getFather().addChilde(human);
            if (human.getMother() != null) human.getMother().addChilde(human);
            if (human.getSpousa() != null) human.getSpousa();
            if (human.getSpouse() != null) human.getSpouse();
            return true;
        }
        else return false;
    }



    public Human getByName(String name)
    {
        for (Human human: humanList)
        {
            if (human.getName().equals(name)) return human;
        }
        return null;
    }
    public String getData()
    {
        StringBuilder info = new StringBuilder();
        info.append("В генеалогическим дереве: ");
        info.append(humanList.size());
        info.append(" объектов. \n");
        int i =1;
        for (Human human: humanList)
        {
            info.append(i);
            info.append(' ');
            info.append(human.getData());
            info.append("\n");
            i++;
        }
        return info.toString();
    }
}