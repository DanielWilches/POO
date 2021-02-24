<?php
require_once('Car.php');
// al momento de ralizar la herencia en php requerimos hacer la importacion 
//del archivo padre del cual se va a heredar 
class UberX extends Car {
    public $brand;
    public $model;

    public  function __construct ($license, $driver,$brand, $model) {
        parent::__construct ($license, $driver);
        // el parent es similar al metodo super  en java, cumple su misma funcion. 
        $this->license = $license;
        $this->driver= $driver;
        $this->brand = $brand;
    }
    funtion PrintDataCar () {
        echo "license is: ".this->license.", the conductor is:  ".$this->driver->name. " and the document is: ".$this->driver->document;
    }
}

?>