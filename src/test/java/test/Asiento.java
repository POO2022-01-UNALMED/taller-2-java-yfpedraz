package test;
class Asiento{
    String color="Azul";
    int precio=0;
    int registro;

    public Asiento(String color, int precio,int registro){
        this.registro=registro;
        this.color=color;
        this.precio=precio;
    }

    void cambiarColor(String color){
        switch(color) {
        case "rojo":
        case "negro":
        case "amarillo":
        case "verde":
        case "blanco":
                this.color=color;
        default:
        // code block
        }
    }
}