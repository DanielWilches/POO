<?php
require_once('Car.php');
class UberPool extends Car {
    public  $brand ;
    public $model ;

    public funtion __construct  ($license, $driver, $brand, $model){
        parent::__construct($license, $driver);
        $this->brand= $brand; 
        $this -> $model = $model; 
    }

        public funtion PrintDataCar () {
        echo "license is: ".this->license.", the conductor is:  ".$this->driver->name. " and the document is: ".$this->driver->document;
    }
}



?>