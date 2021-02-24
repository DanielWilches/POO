class Efectivo extends Payment { 
    constructor(id, amount) { 
        super(id, amount);
    }

    printDataEfectivo() { 
        return `El monto de pago fue ${this.amount} y su identificacion ${this.id}`;
    }
}