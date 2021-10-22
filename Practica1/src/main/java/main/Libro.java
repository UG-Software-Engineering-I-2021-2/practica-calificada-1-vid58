package main;

public class Libro {

    private String titulo;
    private float precioReposicion;
    private int estado;
    Prestamo []prestamos;

    public String getTitulo(){
        return titulo;
    }
    public void setTitulo(String titulo){
        this.titulo=titulo;
    }
    public float getPrecioReposicion(){
        return precioReposicion;
    }
    public void setPrecioReposicion(float precioReposicion){
        this.precioReposicion=precioReposicion;
    }
    public int getEstado(){
        return estado;
    }
    public void setEstado(int estado){
        this.estado=estado;
    }
    public Prestamo[] getPrestamos(){
        return prestamos;
    }
    public void setPrestamos(Prestamo[] prestamos){
        this.prestamos=prestamos;
    }
    public Libro(String titulo, float precioReposicion,int estado,int cantPrestamos){
        this.titulo=titulo;
        this.precioReposicion=precioReposicion;
        this.estado=estado;
        this.prestamos=new Prestamo[cantPrestamos];
    }

    @Override
    public String toString(){
        return "Libro: "+"titulo "+titulo+", precioReposicion "+precioReposicion+", estado "+Estado()+", prestamos "+prestamos.toString();
    }

    public String Estado(){
        String mensaje="";
        if(this.estado==1){
            mensaje="Disponible";
        }else if(this.estado==2){
            mensaje="Prestado";
        } else if(this.estado==3){
            mensaje="Reparacion";
        }
        return mensaje;
    }

    public void AgregarPrestamo(Prestamo p){
        for(int i=0;i< prestamos.length;i++){
            if(prestamos[i]==null){
                prestamos[i]=p;
                break;
            }
        }
    }
    public String ListadoPersonas(){
        String mensaje="";
        for (Prestamo prestamo : prestamos){
            if(prestamo!=null){
                mensaje=prestamo.getnombre()+"\n";
            }
        }
        return mensaje;
    }
}
