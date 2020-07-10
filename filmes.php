<?php
$user_name = "root";
$password = "";
$host = "localhost";
$db_name = "db_filmes";

$con = mysqli_connect($host,$user_name,$password,$db_name);
$sql = "select * from filmes;";

$result = mysqli_query($con,$sql);
$response = array();

while ($row = mysqli_fetch_array($result)){
	array_push($response,array("Titulo" => $row["titulo"],"Genero" => $row["genero"],"Sinopse" => $row["sinopse"],"Ano" => $row["ano"]));

}

echo json_encode($response);

?>