package hw4.Family;

public class Main {
    public static void main(String[] args) {

        Pet dogJoe = new Pet("dog", "Joe");
        Human mom1 = new Human("Taisiya", "Guseva", 1960);
        Human dad1 = new Human("Bronislav", "Gusev", 2000);
        Human aKid1 = new Human("Ivan", "Gusev", 2019);


        Pet parrotKiril = new Pet("parrot", "Kiril", 2, 20);
        Human mom2 = new Human("Taisiya", "Migalkovf", 1980);
        Human dad2 = new Human("Bronislav", "Migalkov", 1980);
        Human aKid2 = new Human("Ivan", "Migalkov", 2000);

        Pet catVasya = new Pet("cat", "Vasya", 4, 90);
        Human mom3 = new Human("Vera", "Klyuevf", 2000);
        Human dad3 = new Human("Vovan", "Klyuev", 2010);
        Human aKid3 = new Human("Maloye", "Klyuev", 2018);

        Family fam1 = new Family(mom1, dad1);
        fam1.setPet(dogJoe);
        fam1.setChildren(aKid1);
        Family fam2 = new Family(mom2, dad2);
        fam2.setPet(parrotKiril);
        fam2.setChildren(aKid2);
        Family fam3 = new Family(mom3, dad3);
        fam3.setChildren(aKid3);
        fam3.setPet(catVasya);

        mom1.setFamily(fam1);
        dad1.setFamily(fam1);
        aKid1.setFamily(fam1);

        mom2.setFamily(fam2);
        dad2.setFamily(fam2);
        aKid2.setFamily(fam2);

        mom3.setFamily(fam3);
        dad3.setFamily(fam3);
        aKid3.setFamily(fam3);

        System.out.println("family1: " + fam1.toString());
        System.out.println("family2: " + fam2.toString());
        System.out.println("family3: " + fam3.toString());

        System.out.println("fam1.countFamily()= " + fam1.countFamily());
        System.out.println("fam1.getPet(): " + fam1.getPet());

        fam1.getPet().eat();
        fam1.getPet().respond();
        fam1.getPet().foul();

        dad2.greetPet(parrotKiril);
        mom3.describePet(mom3.getFamily().getPet());
        fam3.setChildren(new Human("newBaby", fam3.getFather().getSurname(), 2021));
        System.out.println(fam3.toString());
        System.out.println("fam3 countFamily()= " + fam3.countFamily());
    }
}

/*В классе Main создайте несколько семей, чтобы у каждого из классов были использованы все возможные конструкторы. Выведите информацию о каждом человеке на экран.
В классе Main создайте маму, папу, ребенка и его домашнее животное. Присвойте все необходимые ссылки (у ребенка на родителей и питомца), чтобы получилась полноценная семья. Вызовите все доступные методы у ребенка (включая метод toString()) и у его питомца.

Методы должны не просто добавлять/удалять элементы в массив Human но и производить необходимые модификации (добавленному/удаленном элементу установить/удалить ссылку на текущую семью). При удалении элемента, в массиве не должно оставаться пустых мест - необходимо создать новый массив.
*/