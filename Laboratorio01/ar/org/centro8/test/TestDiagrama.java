package ar.org.centro8.test;
import ar.org.centro8.entities.AutoClasico;
import ar.org.centro8.entities.AutoNuevo;
import ar.org.centro8.entities.Colectivo;


public class TestDiagrama {
    public static void main(String[] args) {
        //Auto nuevo viene con radio y precio
        System.out.println("----------------Auto Nuevo viene con radio y precio----------------");
    
        AutoNuevo autoNuevo1=new AutoNuevo("Verde", "Fiat", "Uno", "Pionner", 30);        
        System.out.println(autoNuevo1);
                       
        //Auto Clasico que viene con radio y se le cambia la radio
        System.out.println("----------------Auto Clasico viene con radio y precio----------------");
        
        AutoClasico autoClasico1=new AutoClasico("Gris", "Ford", "Corsa", 580000, "Jensen", 30);
        autoClasico1.agregarRadio("Pionner", 50);;
        System.out.println(autoClasico1);

        //Auto clasico que viene con precio y sin radio
        System.out.println("----------------Auto Clasico viene con precio y sin radio----------------");

        AutoClasico autoClasico2=new AutoClasico("Marron", "Peugeot", "308", 3020000);
        System.out.println(autoClasico2);
        
        //Auto clasico  viene sin precio y se le agrega una radio
        System.out.println("----------------Auto Clasico viene sin precio y sin radio se le agrega una radio----------------");
        AutoClasico autoClasico3=new AutoClasico("Gris", "Dodge", "1500");
        autoClasico2.agregarRadio("Jensen", 50);;
        System.out.println(autoClasico3);

        //Colectivo  viene con precio y sin radio
        System.out.println("----------------Colectivo viene con precio y sin radio----------------");

        Colectivo colectivo1=new Colectivo("Azul", "Mercedes Benz", "1114", 2800000);
        System.out.println(colectivo1);
        
        

  

    }
    
}
