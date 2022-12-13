let pantalla = document.querySelector("canvas");
let pincel = pantalla.getContext("2d");
pincel.fillStyle = "lightgrey";
pincel.fillRect(0,0,600,400);
let x = 0;

function crearCirculo(x,y,radio){
    pincel.fillStyle = "blue";
    pincel.beginPath();
    pincel.arc(x,y,radio,0,2*Math.PI);
    pincel.fill();
}
function limpiarPantalla(){
    pincel.clearRect(0,0,600,400);
}
function exibirMensaje(){
    console.log("Mostrar mensaje");
}
function actualizarPantalla(){
    limpiarPantalla();
    crearCirculo(x,20,10);
    x++;
}
for (let i = 20; i < 600; i++){
   crearCirculo(i,20,20);
}

setInterval(actualizarPantalla,100);
