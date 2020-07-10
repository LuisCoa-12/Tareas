public class Polimorfismo{
    
    public static void main(String[] args){
        Vehiculo turismo = new VehiculoTurismo();
        turismo.setMatricula("1220 WUO");
        turismo.setMarca("Renault Supercinco");
        turismo.setModelo("24-4 de turismo");
        
        Vehiculo deportivo = new VehiculoDeportivo();
        deportivo.setMatricula("7491 ZCR");
        deportivo.setMarca("Mazda");
        deportivo.setModelo("Mazda MX-5 Miata 2019");
        
        Vehiculo furgoneta = new VehiculoFurgoneta();
        furgoneta.setMatricula("5811 UCX");
        furgoneta.setMarca("Ford");
        furgoneta.setModelo("Ford Fiesta Van");
        
        turismo.mostrarDatos();
        deportivo.mostrarDatos();
        furgoneta.mostrarDatos();
    }
}
class Vehiculo{
    private String matricula;
    private String marca;
    private String modelo;
    
    public String getMatricula(){
        return matricula;
    }
    public void setMatricula(String matricula){
        this.matricula = matricula;
    }
    public String getMarca(){
        return marca;
    }
    public void setMarca(String marca){
        this.marca = marca;
    }
    public String getModelo(){
        return modelo;
    }
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    public void mostrarDatos(){
        System.out.println("run");
    }
}
class VehiculoTurismo extends Vehiculo{
    private int numeroPuertas;
    public int getNumeroPuertas(){
        return 4;
    }
    public void setNumeroPuertas(int numeroPuertas){
        this.numeroPuertas = numeroPuertas;
    }
    public void mostrarDatos(){
        System.out.println("Matricula: " + getMatricula() + "\nMarca: " + getMarca() + "\nModelo: " + getModelo() + "\nNumero de puertas: " + getNumeroPuertas());
    }
}
class VehiculoDeportivo extends Vehiculo{
    private int cilindrada;
    public int getCilindrada(){
        return 2000;
    }
    public void setCilindrada(int cilindrada){
        this.cilindrada = cilindrada;
    }
    public void mostrarDatos(){
        System.out.println("Matricula: " + getMatricula() + "\nMarca: " + getMarca() + "\nModelo: " + getModelo() + "\nCilindrada: " + getCilindrada());
    }
}
class VehiculoFurgoneta extends Vehiculo{
    private int carga;
    public int getCarga(){
        return 100;
    }
    public void setCarga(int carga){
        this.carga = carga;
    }
    public void mostrarDatos(){
        System.out.println("Matricula: " + getMatricula() + "\nMarca: " + getMarca() + "\nModelo: " + getModelo() + "\nCarga: " + getCarga() + "%");
    }
}
