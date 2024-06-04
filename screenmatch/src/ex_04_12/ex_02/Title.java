package ex_04_12.ex_02;

public class Title implements Comparable<Title> {
    private String name;

    public Title(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public int compareTo(Title other) {
        return this.name.compareTo(other.getName());
    }
}
