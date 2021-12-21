package ch7;

public class RepairableTest {
    public static void main(String[] args) {
        Tank tank = new Tank();
        Dropship dropship = new Dropship();

        Marine marine = new Marine();
        SCV scv = new SCV();
        scv.repair(tank);
        scv.repair(dropship);
    }
}

interface Repairable {}

class Unit1 {
    int hitPoint;
    final int MAX_HP;
    Unit1(int hp) {
        MAX_HP = hp;
    }
}

class GroundUnit extends Unit1 {
    public GroundUnit(int hp) {
        super(hp);
    }
}

class AirUnit extends Unit1 {
    public AirUnit(int hp) {
        super(hp);
    }
}

class Tank extends GroundUnit implements Repairable {
    public Tank() {
        super(150);
        hitPoint = MAX_HP;
    }

    @Override
    public String toString() {
        return "Tank";
    }
}

class Dropship extends AirUnit implements Repairable {
    public Dropship() {
        super(125);
        hitPoint = MAX_HP;
    }

    @Override
    public String toString() {
        return "Dropship";
    }
}

class Marine extends GroundUnit {
    public Marine() {
        super(40);
        hitPoint = MAX_HP;
    }
}

class SCV extends GroundUnit implements Repairable {
    public SCV() {
        super(60);
        hitPoint = MAX_HP;
    }

    void repair(Repairable r) {
        if (r instanceof Unit1) {
            Unit1 u = (Unit1) r;
            while (u.hitPoint!=u.MAX_HP) {
                u.hitPoint++;
            }
            System.out.println(u.toString() + " 수리 끝");
        }
    }
}

