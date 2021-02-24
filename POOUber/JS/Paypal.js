class Paypal extends Payment { 
    email;
    constructor(id, amount, email) {
        super(id, amount);
        this.email = email;
    }

    printDataPaypal() { 
        return `el email de medio de pago es ${this.email} el monto total es ${this.amount} y la identificacion del pago es ${this.id}`;
    }
}