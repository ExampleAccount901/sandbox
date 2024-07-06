public class BackendDeveloper extends Developer {
    protected String stack;

    public BackendDeveloper(String name, String id, String language, String stack) {
        super(name, id, language);
        this.stack = stack;
    }

    public void printStack() {
        System.out.println(stack);
    }
}
