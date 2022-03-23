package test;
class Motor{
    int numeroCilindros;
    String tipo;
    int registro;

    public Motor(){
        
    }

    public Motor(int cilindros,String tipo,int registro){
        this.registro=registro;
        this.numeroCilindros=cilindros;
        this.tipo=tipo;  
    }
    
    void cambiarRegistro(int registro){
        this.registro=registro;
    }

    void asignarTipo(String tipo){
        if (tipo=="gasolina") this.tipo=tipo;
        if (tipo=="electrico") this.tipo=tipo;
    }    
}