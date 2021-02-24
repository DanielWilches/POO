class UberX extends Car {
    constructor(license, driver, brand, model) {
        super(license, driver);
        this.brand = brand;
        this.model = model;
    }

    printUberX() {
        return`la licencia del uberx es ${this.license} su conductor es ${this.driver.name} y el modelo de carro es ${this.model} de la marca ${this.brand}`
    }
}