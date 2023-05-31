class Fighter extends Character {
    private int attackPower;

    public Fighter(String name, int attackPower) {
        super(name);
        this.attackPower = attackPower;
    }
    
    @Override
    int attack() {
        return attackPower;
    }

    @Override
    int attack(String attackType) {
        if (attackType.equals("melee")) {
            return attackPower*2;
        } else if (attackType.equals("ranged")) {
            return attackPower;
        } else {
            return attackPower;
        }
    }
    
}
