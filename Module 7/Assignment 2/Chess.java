public class Chess {
    public static void main(String[] args) {
        Game game = new Game();
        // Queen queen = new Queen();
        Piece pi = new Piece();
        //System.out.println(pi.isValidMove(new Position(2,9)));
        Queen qu = new Queen();
        qu.move(new Position(1, 5));
        System.out.println(qu.position.row);
    }
}