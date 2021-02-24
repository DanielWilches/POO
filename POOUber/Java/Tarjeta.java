public class Tarjeta extends Payment {
    Integer num;
    Integer cvc;
    public Tarjeta(Integer id, Integer amount, Integer num, Integer cvc) {
        super(id, amount);
        this.num = num;
        this.cvc = cvc;
    } 
}