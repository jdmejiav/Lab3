import java.util.Scanner;
import java.io.File;

public class Puntos {

  LinkedList path;
  LinkedList forbidden;
  boolean isPosible=true;
  public Puntos (File file){
      path = new LinkedList();
      Scanner sc = new Scanner(file);
      int testCases = sc.nextInt();
      leerArchivo(sc, testCases);

  }
  private void leerArchivo(Scanner sc,int testCases){
    try{
        while (sc.hasNext()){
          readTestCases(sc,testCases);
          int nForbiddenCases = sc.nextInt();
          readForbidden(sc,nForbiddenCases);
        }

    }catch (Exception e){
      e.printStackTrace();
    }
  }
  private void readTestCases(Scanner sc,int testCases){
      for (int i =0;i<testCases;i++){
        path.add(sc.nextLine());
      }
  }
  private void readForbidden(Scanner sc,int nForbiddenCases){
      for (int i =0;i<nForbiddenCases;i++){
          path.add(sc.nextLine());
      }
      if (sc.hasNextLine()){
        sc.nextLine();
      }
  }
}
