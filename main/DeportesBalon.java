package main;

public class DeportesBalon extends Deportes{
    
    String tamanoBalon;

    public DeportesBalon(String nombre,int duracion,String lugar,String popularidad, String tamanoBalon){
         super(nombre, duracion, lugar, popularidad); 
         this.tamanoBalon = tamanoBalon;
    }
    
    @Override
    public void Ganar(int duracion){
        System.out.println("El equipo que alla anotado mas y cuando la duracion del deporte acaba= "+duracion);
    }
    
    public void Sacar(){
        System.out.println("Un jugador hace un saque inicial o dentro del juego ");
    }
    
    public void cogerBalon(){
        System.out.println("El jugador coge el balon " );
    }
    
}
