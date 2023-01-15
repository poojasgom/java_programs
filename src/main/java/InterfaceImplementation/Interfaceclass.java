package InterfaceImplementation;

import java.util.Queue;

public class Interfaceclass {

  public static void main(String[] args) {
    Queen obj  = new Queen();
    obj.moves();
  }
}

interface ChessPlayer{
  void moves();
}

class Queen implements ChessPlayer{

  public void moves() {
    System.out.println("UP , DOWN, LEFT, RIGHT,DIAGONAL");
  }
}

class Rook implements ChessPlayer{
  public void moves(){
    System.out.println("up left down right");
  }
}
