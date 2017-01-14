
public class Board {

    int xCounter, yCounter;
    String[][] PlayingBoard = new String[3][3];

    public Board() {

        xCounter = 0;
        while (xCounter < 3) {

            yCounter = 0;
            while (yCounter < 3) {
                PlayingBoard[yCounter][xCounter] = "empty";
                yCounter++;

            }
            xCounter++;
        }

    }

    public void printPlayingBoard() {

        xCounter = 0;
        while (xCounter < PlayingBoard.length) {

            yCounter = 0;
            while (yCounter < PlayingBoard[xCounter].length) {
                System.out.print(PlayingBoard[xCounter][yCounter] + "\t");

                yCounter++;
            }
            System.out.println();
            xCounter++;
        }

    }

    public void putO(String UserIntAsString) {

        switch (UserIntAsString) {
            case "1": {
                PlayingBoard[0][0] = "O";

                break;
            }
            case "2": {

                PlayingBoard[0][1] = "O";

                break;
            }
            case "3": {

                PlayingBoard[0][2] = "O";

                break;
            }
            case "4": {

                PlayingBoard[1][0] = "O";
                break;
            }
            case "5": {
                PlayingBoard[1][1] = "O";
                break;
            }
            case "6": {

                PlayingBoard[1][2] = "O";
                break;
            }
            case "7": {

                PlayingBoard[2][0] = "O";
                break;
            }
            case "8": {

                PlayingBoard[2][1] = "O";
                break;
            }
            case "9": {

                PlayingBoard[2][2] = "O";

                break;
            }
            default: {

            }

        }

    }
    
    public boolean TieChecker(){

if(this.CheckerO()==false&&this.CheckerX()==false&&!PlayingBoard[0][0].contains("empty")
        &&!PlayingBoard[0][1].contains("empty")&&!PlayingBoard[0][2].contains("empty")
        &&!PlayingBoard[1][0].contains("empty")&&!PlayingBoard[1][1].contains("empty")
        &&!PlayingBoard[1][2].contains("empty")&&!PlayingBoard[2][0].contains("empty")
        &&!PlayingBoard[2][1].contains("empty")&&!PlayingBoard[2][2].contains("empty")){

return true;

}




return false;
}

    public boolean CheckerO() {
        if ((PlayingBoard[0][0].equals("O") && PlayingBoard[0][1].equals("O") && PlayingBoard[0][2].equals("O"))
                || (PlayingBoard[1][0].equals("O") && PlayingBoard[1][1].equals("O") && PlayingBoard[1][2].equals("O"))
                || (PlayingBoard[2][0].equals("O") && PlayingBoard[2][1].equals("O") && PlayingBoard[2][2].equals("O"))
                || (PlayingBoard[0][0].equals("O") && PlayingBoard[1][0].equals("O") && PlayingBoard[2][0].equals("O"))
                || (PlayingBoard[0][1].equals("O") && PlayingBoard[1][1].equals("O") && PlayingBoard[2][1].equals("O"))
                || (PlayingBoard[0][2].equals("O") && PlayingBoard[1][2].equals("O") && PlayingBoard[2][2].equals("O"))
                || (PlayingBoard[0][0].equals("O") && PlayingBoard[1][1].equals("O") && PlayingBoard[2][2].equals("O"))
                || (PlayingBoard[2][0].equals("O") && PlayingBoard[1][1].equals("O") && PlayingBoard[0][2].equals("O"))) {
            return true;
        }

        return false;

    }

    public boolean CheckerX() {

        if ((PlayingBoard[0][0].equals("X") && PlayingBoard[0][1].equals("X") && PlayingBoard[0][2].equals("X"))
                || (PlayingBoard[1][0].equals("X") && PlayingBoard[1][1].equals("X") && PlayingBoard[1][2].equals("X"))
                || (PlayingBoard[2][0].equals("X") && PlayingBoard[2][1].equals("X") && PlayingBoard[2][2].equals("X"))
                || (PlayingBoard[0][0].equals("X") && PlayingBoard[1][0].equals("X") && PlayingBoard[2][0].equals("X"))
                || (PlayingBoard[0][1].equals("X") && PlayingBoard[1][1].equals("X") && PlayingBoard[2][1].equals("X"))
                || (PlayingBoard[0][2].equals("X") && PlayingBoard[1][2].equals("X") && PlayingBoard[2][2].equals("X"))
                || (PlayingBoard[0][0].equals("X") && PlayingBoard[1][1].equals("X") && PlayingBoard[2][2].equals("X"))
                || (PlayingBoard[2][0].equals("X") && PlayingBoard[1][1].equals("X") && PlayingBoard[0][2].equals("X"))) {
            return true;
        }

        return false;

    }

    public void putX(String UserIntAsString) {

        switch (UserIntAsString) {
            case "1": {
                PlayingBoard[0][0] = "X";

                break;
            }
            case "2": {

                PlayingBoard[0][1] = "X";

                break;
            }
            case "3": {

                PlayingBoard[0][2] = "X";

                break;
            }
            case "4": {

                PlayingBoard[1][0] = "X";
                break;
            }
            case "5": {
                PlayingBoard[1][1] = "X";
                break;
            }
            case "6": {

                PlayingBoard[1][2] = "X";
                break;
            }
            case "7": {

                PlayingBoard[2][0] = "X";
                break;
            }
            case "8": {

                PlayingBoard[2][1] = "X";
                break;
            }
            case "9": {

                PlayingBoard[2][2] = "X";

                break;
            }
            default: {

            }

        }

    }

    public boolean validatePlacement(String UserIntAsString) {

        switch (UserIntAsString) {
            case "1": {
                if (PlayingBoard[0][0].contains("empty")) {
                } else {
                    return false;
                }

                break;
            }
            case "2": {

                if (PlayingBoard[0][1].contains("empty")) {
                } else {
                    return false;
                }

                break;
            }
            case "3": {

                if (PlayingBoard[0][2].contains("empty")) {
                } else {
                    return false;
                }

                break;
            }
            case "4": {

                if (PlayingBoard[1][0].contains("empty")) {
                } else {
                    return false;
                }
                break;
            }
            case "5": {
                if (PlayingBoard[1][1].contains("empty")) {
                } else {
                    return false;
                }

                break;
            }
            case "6": {

                if (PlayingBoard[1][2].contains("empty")) {
                } else {
                    return false;
                }

                break;
            }
            case "7": {

                if (PlayingBoard[2][0].contains("empty")) {
                } else {
                    return false;
                }

                break;
            }
            case "8": {

                if (PlayingBoard[2][1].contains("empty")) {
                } else {
                    return false;
                }
                break;
            }
            case "9": {

                if (PlayingBoard[2][2].contains("empty")) {

                } else {
                    return false;
                }
                break;
            }
            default: {

            }

        }

        return true;
    }

    public void reset() {

        xCounter = 0;
        while (xCounter < 3) {

            yCounter = 0;
            while (yCounter < 3) {
                PlayingBoard[yCounter][xCounter] = "empty";
                yCounter++;

            }
            xCounter++;
        }

    }

}
