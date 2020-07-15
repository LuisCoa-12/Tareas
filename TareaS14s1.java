abstract class SerVivo{
    abstract void alimentarse();
}
class Planta extends SerVivo{
    public void alimentarse(){
        System.out.println("Las plantas se alimentan de sol y agua");
    }
}
abstract class Animal extends SerVivo{
    abstract void alimentarse();
}
class AnimalCarnivoro extends Animal{
    public void alimentarse(){
        System.out.println("Los animales carnivoros se alimentan de carne");
    }
}
class AnimalHervivoro extends Animal{
    public void alimentarse(){
        System.out.println("Los animales hervivoros se alimentan de plantas");
    }
}


////OTRA CLASE////


public class Principal{
    public static void main(String[] args) {
        
        Planta sanseviera = new Planta();
        AnimalCarnivoro leon = new AnimalCarnivoro();
        AnimalHervivoro jirafa = new AnimalHervivoro();
        sanseviera.alimentarse();
        leon.alimentarse();
        jirafa.alimentarse();
    }
}
