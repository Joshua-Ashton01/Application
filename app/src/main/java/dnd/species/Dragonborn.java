package dnd.species;

public class Dragonborn implements Species {
    private final int speed = 30;
    private final int maxAge = 80;
    private String[] traits;
    private String[] skills;
    private String[] languages;
    private String[] proficiencies;

    public Dragonborn() {
        this.languages = new String[]{"Common", "Draconic"};
        this.skills = new String[]{};
    }

    @Override
    public String getSpecies() { return this.getClass().getSimpleName(); }

    @Override
    public int maxAge() { return maxAge; }

    @Override
    public int getSpeed() { return speed; }

    @Override
    public String[] getTraits() { return traits; }

    @Override
    public String[] getSkills() { return skills; }

    @Override
    public String[] getLanguages() { return languages; }

    @Override
    public String[] getProficiencies() { return proficiencies; }

    @Override
    public int[] getASI() { return new int[]{0, 0, 5}; }

    @Override
    public String toString() { return this.getClass().getSimpleName(); }

}
