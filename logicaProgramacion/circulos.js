//Definimos variables 
let pantalla = document.querySelector("canvas");
let pincel = pantalla.getContext("2d");

//Formamos el tablero en la pantalla
pincel.fillStyle = "grey";
pincel.fillRect(0,0,600,400);

function mostrarAlerta(evento){
    let x = evento.pageX - pantalla.offsetLeft;
    let y = evento.pageY - pantalla.offsetTop;
    console.log(evento);
    alert("coordenada en el eje x: "+x+"\ncoordenada en el eje y: "+y);
}
function dibujarCirculo(evento){
    let x = evento.pageX - pantalla.offsetLeft;
    let y = evento.pageY - pantalla.offsetTop;

    pincel.fillStyle = "blue";
    pincel.beginPath();
    pincel.arc(x,y,10,0,2*3.14);
    pincel.fill();
    
    console.log("coordenada en el eje x: "+x+"\ncoordenada en el eje y: "+y);
    
}
pantalla.onclick = dibujarCirculo;

