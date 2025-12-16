package HomeworkJava3;

public class Fighter {
    @Override
    public String toString() {
        return "Fighter is a " + this.getClass().getSimpleName();
    }

    public boolean isVulnerable() {
        return false;
    }

    public int damagePoints(Fighter opponent) {
        return 0;
    }
}
