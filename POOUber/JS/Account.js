
class Account { 
    id;
    name;
    document;
    email;
    password;

    constructor(name, document, email, password) {
        this.id = Math.random(0, 100);
        this.name = name;
        this.document = document;
        this.email = email;
        this.password = password;
        this.printAccount(this.id, this.name, this.document, this.email, this.password);
    }
    printAccount(id,name,document, email , password) { 
        var Account = {
            id,
            name,
            document,
            email,
            password
        };
        console.log('Cuenta usuario', Account);
        
    }

}