public class Team {
    private string name;

    Team(string name) {
        this.name = name;
    }

    public string toString() {
        return name;
    }

    public boolean equal(object obj) {
        return this.name.quals(((Team) obj), name);
    }
}