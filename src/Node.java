
public class Node {
  String data;
  Node next;
  public Node (String data) {
    this.data =data;
  }
  public Node (Node next,String data) {
    this.data =data;
  }
  public String getData() {
    return this.data;
  }
  public Node getNext() {
    return this.next;
  }
  public void setData (String data) {
    this.data = data;
  }
  public void setNext(Node next) {
    this.next = next;
  }

}
