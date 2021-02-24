<?php
class Car {
    public $id;
    public $license;
    public $driver;
    public $passenger;

    public function __construct ($driver , $license) {
        $this ->license =$license;
        $this ->driver =$driver;
    }
    public funtion PrintDataCar () {
        echo "license is: ".this->license.", the conductor is:  ".$this->driver->name. " and the document is: ".$this->driver->document;
    }
}
?>