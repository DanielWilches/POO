public class Car {
    private Integer id;
    private String license;
    private Account driver;
    private  Integer passegenger;

    public Car(String license , Account driver) {
        // en el construcctor iran los parametors obligatios para crear un nuevo objeto
        this.license = license;
        this.driver = driver;
        System.out.println("constructor");
    }


    void printDataCar() {
        if (passegenger != null) {
            System.out.println(
                "id: " + this.driver.document + "  license: " + this.license + " driver : " + this.driver.name +" y la capacidad de pasajeros es de "+ this.passegenger+" de la marca");
        }
    }
    
    public Integer getPassegenger() {
        return passegenger;
    }

    public void setPassegenger(Integer passegenger) {
        if (passegenger == 4) {
            this.passegenger = passegenger;
        } else {
            System.out.println("necesitas asignar 4 pasajeros");
        }
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public Account getDriver() {
        return driver;
    }

    public void setDriver(Account driver) {
        this.driver = driver;
    }
}
