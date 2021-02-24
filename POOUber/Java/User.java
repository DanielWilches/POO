public class User extends Account {
    String user; 

    public User(String name, String document, String user) {
        super(name, document);
        this.user = user;
    }

    void printDataUser(){
        System.out.println("el nombre de l usuario es "+this.name +" con el documento "+ this.document+ "  y nombre de usuario  "+ this.user );
    }

}