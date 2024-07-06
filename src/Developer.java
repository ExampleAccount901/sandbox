public class Developer extends Employee {
    protected String language;

    public Developer(String name, String id, String language) {
        super(name, id);
        this.language = language;
    }

    public void writeCode() {
        System.out.println(name+ " is writing in " + language + " language");
    }

    @Override
    public String toString() {
        return "Developer{" +
                "language='" + language + '\'' +
                ", id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
