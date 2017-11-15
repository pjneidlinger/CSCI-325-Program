/**
  * Student Name: PJ Neidlinger
  * Program Name: Checkers
  * Creation Date: 4/19/2017
  * Last Modified Date: 4/25/2017
  * CSCI Course: CSCI 325
  * Grade Received: 100
  * Comments Regarding Design: This program has multiple classes that work together to create a game of checkers.
  * This King class creates a checker piece that is a king, that is an extension of the normal Checker class.
  */
public class King extends Checker {

    public King() {}

    public char getPiece() {
        // Return the "value" that is stored for a King
        return mPiece;
    }
    public void setPiece(char piece) {
        // Set a piece as a passed parameter
        mPiece = piece;
    }
}
