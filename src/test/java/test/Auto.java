package test;
class Auto{
    String modelo ;
    int precio;
    Asiento[] asientos;
    String marca;
    Motor motor;
    int registro;
    static int cantidadCreados =0;

    public Auto(){
        
    }
    
    public Auto(String modelo,int precio,Asiento[] lista, String marca, Motor motor, int registro){
        this.modelo=modelo;
        this.precio=precio;
        this.asientos=lista;
        this.marca=marca;
        this.motor=motor;
        this.registro=registro;
        cantidadCreados+=1;
    }

    int cantidadAsientos(){
        return this.asientos.length;
    }

    String verificarIntegridad(){
        for (int i = 0; i < this.asientos.length; i++) {
            if (this.asientos[i].registro != this.registro ) return "Las piezas no son originales";
        }
        if (this.motor.registro !=this.registro) return "Las piezas no son originales";
        return "Auto original";
    }
    
}