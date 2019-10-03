  
class Queen extends Piece {
    
    Queen() {
        position = new Position(0, 4);
    }
    public boolean isValidMove(Position newPosition) {
        super.isValidMove(newPosition);
        if ((newPosition.column == this.position.column || newPosition.row == this.position.row)
        || (Math.abs(newPosition.row - this.position.row) == Math.abs(newPosition.column - this.position.column))) {
            return true;
        }
        return false;
    }
    // public void move(Position newPosition) {
    //     if (this.isValidMove(newPosition)) {
    //         this.position = newPosition;
    //     }
    // }
}