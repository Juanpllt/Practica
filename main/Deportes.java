package main;

public abstract class Deportes {
    
    private String nombre;
    private int duracion;
    private String lugar;
    private String popularidad;
    
    
    public Deportes(String nombre,int duracion,String lugar,String popularidad){
        this.nombre = nombre;
        this.duracion = duracion;
        this.lugar = lugar;
        this.popularidad = popularidad;
    }
    
    public abstract void Ganar(int duracion);
    public void posicionar(){
        System.out.println("Los jugadores se posicionan en sus respectivos lugares");
    }
    public void moverse(){
        System.out.println("El jugador se esta moviendo ");
    }
    
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public int getDuracion(){
        return duracion;
    }
    public void setDuracion(int duracion){
        this.duracion = duracion;
    }
    
    public String getLugar(){
        return lugar;
    }
    public void setLugar(String lugar){
        this.lugar = lugar;
    }
    
    public String getPopularidad(){
        return popularidad;
    }
    public void setPopularidad(String popularidad){
        this.popularidad = popularidad;
    }
}
