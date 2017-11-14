/**
 * Student Name: PJ Neidlinger
 * Program Name: Checkers
 * Creation Date: 4/17/2017
 * Last Modified Date: 4/19/2017
 * CSCI Course: CSCI 325
 * Grade Received: 100
 * Comments Regarding Design: This program has multiple classes that work together to create a game of checkers.
 * This Checker class creates the checker piece that will be used extensively and be moved around the board.
 */
public class Checker {
    // This is the piece variable that will hold each Checker's "value"
    public char mPiece;

    public Checker() {}

    public char getPiece() {
        // Return the "value" that is stored for a checker
        return mPiece;
    }

    public void setPiece(char piece) {
        // Set a piece as a passed parameter
        mPiece = piece;
    }
}
