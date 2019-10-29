import java.io.File;
import java.util.Scanner;

public class Archivos {
  public Archivos (){

  Puntos puntos = new Puntos (seleccionarArchivo());
  }
  private File seleccionarArchivo(){
    File retorno=null;
    try{
    Scanner sc = new Scanner(System.in);
    System.out.println("Ingrese La ruta del archivo ");
    System.out.print("==>");
    //String ruta = sc.nextLine();
    retorno = new File ("entrada.in");
  }catch (Exception e){
    e.printStackTrace();
  }

    return retorno;
  }



}
