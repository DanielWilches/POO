<?php
require_once("Car.php");
require_once("UberX.php");
require_once("Account.php");

$uberX= new UberX("CVB123",new Account("1033812288","daniel prieto","1033812288","danielprietowilches@gmail.com", 1234),"mazda", "cx120");

$uberX  ->PrintDataCar();


?>

