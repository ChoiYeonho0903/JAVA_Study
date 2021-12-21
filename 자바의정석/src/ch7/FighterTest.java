package ch7;

public class FighterTest {
    public static void main(String[] args) {
        Fighter f = new Fighter();

        if(f instanceof Unit)
            System.out.println("Unit");
        if(f instanceof Fightable)
            System.out.println("Fightable");
        if(f instanceof Movable)
            System.out.println("Movable");
        if(f instanceof Attackable)
            System.out.println("Attackable");
        if(f instanceof Object)
            System.out.println("Object");
    }
}

class Fighter extends Unit implements Fightable{

    @Override
    public void move(int x, int y) {

    }

    @Override
    public void attack(Unit u) {

    }
}

class Unit {
    int currentHP;
    int x;
    int y;
}

interface Fightable extends Movable, Attackable {}
interface Movable {
    void move(int x, int y);
}
interface Attackable {
    void attack(Unit u);
}
