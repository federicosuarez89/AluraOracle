//Definimos variables 
let pantalla = document.querySelector("canvas");
let pincel = pantalla.getContext("2d");

//Formamos el tablero en la pantalla
pincel.fillStyle = "grey";
pincel.fillRect(0,0,600,400);

function mostrarAlerta(evento){
    console.log(evento);
    alert("usted hizo un click");
}
pantalla.onclick = mostrarAlerta;

