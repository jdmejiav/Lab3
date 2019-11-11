import java.util.Scanner;
import java.io.*;
public class Puntos {

  LinkedList path;
  LinkedList forbidden;
  boolean isPosible=true;
  public Puntos (File file) throws FileNotFoundException{
      path = new LinkedList();
      forbidden= new LinkedList();
      Scanner sc = new Scanner(file);
      if (file.exists())System.out.println("El archivo de exixtir, existe");
      int testCases = Integer.parseInt(sc.nextLine());

      leerArchivo(sc, testCases);

  }
  private void leerArchivo(Scanner sc,int testCases)throws FileNotFoundException{
    try{
        while (sc.hasNext()){
          readTestCases(sc,testCases);
          System.out.println("path:  ");
          path.imprimir();

          int nForbiddenCases = Integer.parseInt(sc.nextLine());
          readForbidden(sc,nForbiddenCases);
          System.out.println("forbidden:  ");
          forbidden.imprimir();

        }
    }catch (Exception e){
      e.printStackTrace();
    }
  }
  private void readTestCases(Scanner sc,int testCases)throws FileNotFoundException{

      for (int i =0;i<testCases;i++){

        String temp = sc.nextLine();
        path.add (temp);
      }
  }
  private void readForbidden(Scanner sc,int nForbiddenCases)throws FileNotFoundException{
      for (int i =0;i<nForbiddenCases;i++){
          forbidden.add(sc.nextLine());
      }
      if (sc.hasNextLine()){
        sc.nextLine();
      }
  }
}
