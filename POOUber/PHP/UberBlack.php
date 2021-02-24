<?php
require_once('Car.php');
class  UberBlack  extends Car {
    public  $typeCarAccepted ;
    public  $seastMaterial;
    
    public funtion __construct($license, $driver, $typeCarAccepted, $seastMaterial){
        parent:: __construct($license, $driver);
        $this->typeCarAccepted= $typeCarAccepted;
        $this ->seastMaterial =$seastMaterial;

    }
}
?>