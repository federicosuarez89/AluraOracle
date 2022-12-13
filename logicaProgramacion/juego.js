let pantalla = document.querySelector("canvas");
let pincel = pantalla.getContext("2d");
pincel.fillStyle = "lightgrey";
pincel.fillRect(0,0,600,400);
let x = 0;
let radio = 10;
let xAleatorio,yAleatorio;


function crearCirculo(x,y,radio,color){
    pincel.fillStyle = color
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
    xAleatorio = posiciónAzar(600);
    yAleatorio = posiciónAzar(400);
    disenarObjetivo(xAleatorio,yAleatorio);
    x++;
}
function disenarObjetivo(x,y){
    crearCirculo(x,y,radio+20,"red");
    crearCirculo(x,y,radio+10,"white");
    crearCirculo(x,y,radio,"black");
}
function posiciónAzar(maximo){
    return Math.floor(Math.random()*maximo);
}
function dispara(evento){
    let x = evento.pageX - pantalla.offsetLeft;
    let y = evento.pageY - pantalla.offsetTop;
    if((x < xAleatorio + radio) && 
        (x > xAleatorio - radio)&&
        (y < yAleatorio + radio)&&
        (y > yAleatorio - radio)){
            alert("!!!! GANASTE !!!!!");
        }
            

    
    
}

setInterval(actualizarPantalla,1600);
pantalla.onclick = dispara;