public class Empresa{
    private String nombre;
    private int tamano;
    public String[] empleados = new String[tamano];
    
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public int getTamano(){
        return tamano;
    }
    public void setTamaño(int tamano){
        this.tamano = tamano;
    }
    Empresa(){
        this.nombre = "Samso";
        this.tamano = 50; 
    }
    public int getEmpleado(int get){
        get = 3;
        return empleados.length;
    }
    public void despideEmpleado(){
        System.out.println("Ningun empleado despedido");
    }
}
class Empleado extends Empresa{
    
}
///////OTRA CLASE////////

public class Principal{
    public static void main(String[] args){
        Empresa ep = new Empresa();
        System.out.println("Nombre de la empresa: " + ep.getNombre());
        System.out.println("La empresa tiene " + ep.getTamano() + " empleados");
        ep.despideEmpleado();
    }
}
