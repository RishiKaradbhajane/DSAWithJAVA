import javax.swing.SpringLayout;

public class oops_interface {
    public static void main(String[] args) {
        horse h = new horse();
        h.moves();
        animal an = new animal();
        an.eatmeat();
        an.eatveg(); 
    }
}

interface chessPlayer{
    void moves(); //it is by default public, abstract
}

class queen implements chessPlayer{
    public void moves(){
        System.out.println("up, down, left, right, diagonal(in all four direction)");
    }
}

class rook implements chessPlayer{
    public void moves(){
        System.out.println("up,down,left,right");
    }
}

class king implements chessPlayer{
    public void moves(){
        System.out.println("up,down,left,right diagonal (by 1 step)");
    }
}

class horse implements chessPlayer{
    public void moves(){
        System.out.println("up,down,left,right diagonal (by 1 step)");
    }
}

interface herbivores{
    void eatveg();
}
interface carnivores{
    void eatmeat();
}
class animal implements herbivores,carnivores{
    public void eatveg(){
        System.out.println("eats vegetarian food");
    }
    public void eatmeat(){
        System.out.println("eats flesh of other animals");
    }
}