public class Driver  extends Account{
    String user;

    public Driver(String name, String document, String user) {
        super(name, document);
        this.user = user;
    }

    void printDataDirver() {
    System.out.println("El nombre del conductor es "+this.name+ " su documento es "+this.document+" el nombre de usuario es "+ this.user);
    }
}
