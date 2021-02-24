class Car {
    id;
    license;
    driver;
    passenger;

    constructor(license, driver) {
        this.license = license;
        this.driver = driver;
        this.id = Math.random(0, 1);
    }

    printCar() {
        console.log("license", this.license);
        console.log("driver", this.driver);
        console.log("id", this.id);
    }
}

