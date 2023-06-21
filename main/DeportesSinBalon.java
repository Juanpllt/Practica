package main;

public class DeportesSinBalon extends Deportes {
    String implemento;

    public DeportesSinBalon(String nombre,int duracion,String lugar,String popularidad, String implemento){
         super(nombre, duracion, lugar, popularidad); 
         this.implemento = implemento;
    }
    @Override
    public void Ganar(int duracion){
        System.out.println("El equipo o jugador gano y la duracion acaba =" + duracion);
    }
    
}