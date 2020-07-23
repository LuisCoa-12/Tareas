interface Phone{
    public void diaNumber();
    public boolean isCallInProgress();
}
class CellPhone implements Phone{
    public void diaNumber(){
        System.out.println("El dia es 10");
    }
    public boolean isCallInProgress(){
        return true;
    }
}
class LandlinePhone implements Phone{
    public void diaNumber(){
        System.out.println("El dia es 11");
    }
    public boolean isCallInProgress(){
        return true;
    }
}
class VideoPhone implements Phone{
    public void diaNumber(){
        System.out.println("El dia es 25");
    }
    public boolean isCallInProgress(){
        return false;
    }
}
public class Pr{
    public static void main(String[] args){
        CellPhone c = new CellPhone();
        LandlinePhone l = new LandlinePhone();
        VideoPhone v = new VideoPhone();
        c.diaNumber();
        c.isCallInProgress();
        l.diaNumber();
        l.isCallInProgress();
        v.diaNumber();
        v.isCallInProgress();
    }
}
