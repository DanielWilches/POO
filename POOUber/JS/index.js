

var mustan = new Car("1033812", new Account('daniel prieto wilches', 1033812288, 'danielprietowilches@gmail.com', 123));

mustan.printCar();

var mustand2 = new UberX(
    "1033812",
    new Account(
        "daniel prieto wilches",
        1033812288,
        "danielprietowilches@gmail.com",
        123
    ),
    "mazda", 
    "cr1209"
);
console.log(mustand2.printUberX());

var pago_prueba = new Tarjeta(321,10000, "346790112323", "102");
console.log(pago_prueba.printDataTarjeta());

var pago_Paypal = new Paypal("123", 15000, "danielprietowilches@gmail.com");
console.log(pago_Paypal.printDataPaypal());

var pago_efectivo = new Efectivo(20000, "123");
console.log(pago_efectivo.printDataEfectivo());