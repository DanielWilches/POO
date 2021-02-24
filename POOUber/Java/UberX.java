public class UberX extends Car {
    String brand;
    String model;
    // recordemos que el constructor en java debe tener el mismo nombre a la clase donde se encuentra
    // tambien cuando heredamos de una clase padre a una hija, la clase hija debe tener los mismo parametros
    // en su constructor que el constructor de la clase padre. 
    public UberX(String license, Account driver, String brand, String model) {
        super(license, driver);
        // EL metodo super hace referencia al constructor de la clase padre. o super representara a la super clase, la super clase es la clase padre.
        this.brand = brand;
        this.model = model;
        //Con el metodo super tengo auto maticamete accees a los atributos de la  clase padre. 
    }
    @Override
    void printDataCar() {
        super.printDataCar();
        System.out.println("model : "+ this.model+ " marca : "+this.brand);
    }

}