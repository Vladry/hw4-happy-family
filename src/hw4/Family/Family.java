package hw4.Family;

import java.util.Arrays;

public class Family {

    private Human mother;
    private Human father;
    private Human[] children;
    private Pet pet;

    {
        this.children = new Human[20];
    }

    Family(Human mother, Human father) {
        this.mother = mother;
        this.father = father;
    }

    public void addChild(Human child) {
        String errMsg = "This family must be F@ing crazy to have more that 20 children! \n" +
                "Out of free space for another baby in the array";
        int freeCell = findNextFreeCell();
        if (freeCell >= children.length - 1) {
            Exception ErrOverflow = new Exception(errMsg);
            System.out.println(ErrOverflow.toString());
        } else {
            children[freeCell] = child;
        }
    }

    public boolean deleteChild(int index) {
        if (children[index] == null) {
            return false;
        } else {
            children[index] = null;
            return true;
        }
    }

    private int findNextFreeCell() {
        for (int i = children.length - 1; i >= 0; i--) {
            if (children[i] != null)
                return i + 1;
        }
        return 0;
    }

    public int countFamily() {
        return findNextFreeCell() + 2;
    }

    public Human getMother() {
        return this.mother;
    }

    public void setMother(Human mother) {
        this.mother = mother;
    }

    public Human getFather() {
        return this.father;
    }

    public void setFather(Human father) {
        this.father = father;
    }

    public Human[] getChildren() {
        return this.children;
    }

    public void setChildren(Human child) {
        child.setFamily(this);
        addChild(child);
    }

    public Pet getPet() {
        return this.pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    @Override
    public String toString() {
        return  "Family{\n mother= " + mother +
                "father= " + father +
                "children= " + Arrays.toString(children) + "\n" +
                "pet= " + pet +
                "}\n ";
    }
}

/* получить количество человек в семье countFamily (родители в семье никогда не изменяются; если происходит изменение родительского состава - это уже другая семья)
Решите какие поля стоит использовать для сравнения в методе equals() (к примеру, привычки животного могут меняться).*/