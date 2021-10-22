package  main;

public class Prestamo{
    private String nombre;
    private int cantDias;
    private boolean devuelvo;

    public String getnombre(){
        return nombre;
    }
    public void setnombre(String nombre){
        this.nombre=nombre;
    }
    public int getcantDias(){
        return cantDias;
    }
    public void setCantDias(int cantDias){
        this.cantDias=cantDias;
    }
    public boolean isDevuelvo(){
        return devuelvo;
    }
    public void setDevuelvo(boolean devuelvo){
        this.devuelvo=devuelvo;
    }

    public Prestamo(String nombre, int cantDias,boolean devuelvo){
        this.nombre =nombre;
        this.cantDias = cantDias;
        this.devuelvo =devuelvo;
    }
    @Override
    public String toString(){
        return "Prestamo :" + "nombre "+nombre+", cantDias "+cantDias+", devuelvo "+devuelvo;
    }

    public String  Fuedevuelto(){
        String mensaje="";
        if(this.devuelvo==true){
            mensaje="Fue devuelto";
        }else{
            mensaje="No fue devuelto";
        }
        return mensaje;
    }
}