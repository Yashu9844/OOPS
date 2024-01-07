public class interFace {
    public static void main(String[] args) {
        Queen q = new Queen();
        q.moves();

        pawns p =new pawns();
        p.moves();
    }
}
interface chessPlayer{
    void moves();
}
class Queen implements  chessPlayer{
    public void moves(){
        System.out.println("all direction except L Shape");
    }

}
class pawns implements  chessPlayer{
    public void moves(){
        System.out.println("diagonal");
    }
}                                      // multiple interfaces creates and implemented :
                                        // interface herbivore {
                                         //       public void eat();
                                           // class man implements herbivore,chessPlayer{
                                            //  should implement both the methods included in both interface
