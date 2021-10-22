package main;

public class main {
    Libro[] libros;

    public main(int cantLibros){
        libros=new Libro[cantLibros];
    }
    public void AgregarLibro(Libro l){
        for(int i=0;i<libros.length;i++){
            if(libros[i]==null){
                libros[i] = 1;
                break;
            }
        }
    }

    public int CantidadLibrosEstado(int estado){
        int c=0;
        for(Libro libro : libros){
            if(libro!=null && libro.getEstado()==estado){
                c++;
            }
        }
        return c;
    }

    public float SumaReparacion(){
        float suma=0;
        for(Libro libro : libros){
            if(libro!=null & libro.getEstado()==3){
                suma+=libro.getPrecioReposicion();
            }
        }
        return suma;
    }

    public String ListadoPorTitulo(String titulo){
        String mensaje="";
        for(Libro libro : libros){
            if(libro!=null & libro.getTitulo().equals(titulo)){
                mensaje=libro.ListadoPersonas();
            }
        }
        return mensaje;
    }
}
