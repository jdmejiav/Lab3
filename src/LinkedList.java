

public class LinkedList {

  Node head;

  public LinkedList (String data){
    head = new Node (data);
  }
  public LinkedList (){
    head = null;
  }

  public void push (String data){
    if (head!=null){
      Node temp = head;
      head = new Node (data);
      head.setNext(temp);
    }else{
      head = new Node (data);
    }
  }
  public Node pop (){
    Node temp = head;
    head = head.getNext();
    return temp;
  }
  public Node peek (){
    return head;
  }
  public void PushToList(String data){
    /*data = data.replace(" ","");
    for (int i = data.length()-1;i>=0;i--){
      push(Integer.parseInt(data.charAt(i)));
    }*/
  }
}
