class Main {
    public static void main(String[] args) {
        UberX munstan = new UberX("100", new Account("daniel prieto", "1033812288"),"mazda", "spark");
        // podemos enviar un nuevo objeto por parametro para crear otro nuevo
        munstan.setPassegenger(4);
        munstan.printDataCar();
        

        User pruebaUser = new User("daniel prietro", "1033812299", "daniel");
        pruebaUser.printDataUser();

        Driver pruebaDriever = new Driver("daniel prieto", "10338122909", "cundo");
        pruebaDriever.printDataDirver();

    
    }
}