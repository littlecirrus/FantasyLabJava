package ToolSet;

public class Spell implements IHeal, IAttack{
    private String name;
    private int damage;

    public Spell(String name, int damage) {
        this.name = name;
        this.damage = damage;

    }
}
