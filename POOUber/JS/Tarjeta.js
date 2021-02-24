class Tarjeta extends Payment { 
    num;
    cvc;
    constructor(id, amount, num, cvc) {
        super(id, amount);
        this.num = num;
        this.cvc = cvc;
    }

    printDataTarjeta() { 
        console.log(this.num)
        return `la cantidad de dinero pagado ${this.amount} el medio fue tarjeta el numero de esta es, ${this.num} numero de recibo ${this.id}`;
    }
}