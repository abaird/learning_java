interface MugBehavior {
  void putTopOn();
  void takeTopOff();
  void fillErUpMac();
  void pourOut();
}

class Mug implements MugBehavior {
  String color = "clear";
  String top = "off";
  String filled = "empty";

  void fill(int fullOrNot) {
    if (fullOrNot == 1) {
      filled = "full";
    } else {
      filled = "empty";
    } 
  }

  void changeColor(String newColor){
    color = newColor;
  }

  public void putTopOn(){
    top = "on";
  }

  public void takeTopOff(){
    top = "off";
  }

  public void fillErUpMac(){
    filled = "full";
  }

  //public void pourOut(){
   // filled = "empty";
  //}

  void printStates() {
    System.out.println("color: " + color +
        ", top: " + top + ", filled: " + 
        filled);
  }

}

class MugDemo {
  public static void main(String[] args){
    Mug mug1 = new Mug();

    mug1.printStates();
    mug1.changeColor("red");
    mug1.fillErUpMac();
    mug1.putTopOn();

    mug1.printStates();
  }
}


