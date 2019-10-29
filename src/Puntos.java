import java.util.Scanner;
import java.io.File;

public class Puntos {

  LinkedList path;
  LinkedList forbidden;
  boolean isPosible=true;
  public Puntos (File file){
      path = new LinkedList();
      leerArchivo(file);
  }
  private void leerArchivo(File file){
    try{
      Scanner sc = new Scanner (file);
      int testCases = sc.nextInt();
      exce(sc,testCases);
    }catch (Exception e){
      e.printStackTrace();
    }
  }
  private void exce(Scanner sc,int testCases){
    String next = "";
    while(sc.hasNextLine()){
      if (!next.equals("")){
        for (int  i=0;i<testCases;i++){
          path.push (sc.nextLine());
        }
        int nforbidden = sc.nextInt();
        for (int  i=0;i<nforbidden;i++){
          forbidden.push (sc.nextLine());
        }
    }
      if (sc.hasNext())
      next=sc.nextLine();
    }
  }
  private void firstInsdex(){



  }
}
