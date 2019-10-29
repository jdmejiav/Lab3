import java.io.File;
import java.util.Scanner;

public class Archivos {
  private File file;
  public Archivos (){
  //file = seleccionarArchivo();
  file = new File ("entrada.in");
  Puntos puntos = new Puntos (file);
  }
  private File seleccionarArchivo(){
    File retorno=null;
    try{
    Scanner sc = new Scanner(System.in);
    System.out.println("Ingrese La ruta del archivo ");
    System.out.print("==>");
    //String ruta = sc.nextLine();
    //retorno = new File ("entrada.in");
  }catch (Exception e){
    e.printStackTrace();
  }

    return retorno;
  }
  public File getFile (){
    return this.file;
  }


}
