class Piece {
    Position position;
    Piece () {
        position = new Position(0, 0);
    }
    public boolean isValidMove(Position newPosition) {
        if (newPosition.row > 0 && newPosition.column > 0) {
            if (newPosition.row < 8 && newPosition.column < 8) {
                return true;
            }
        }
        return false;
    }
    
    public final void move(Position position) {
        if (isValidMove(position)) { 
            // System.out.println("changed");
            this.position = position;
        }
    }
}