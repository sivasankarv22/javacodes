import java.util.Scanner;

class Guesser {
    int Gnum;

    int guessNum() {
        System.out.println("Guesser, guess the number between 1 to 30");
        Scanner sc = new Scanner(System.in);
        Gnum = sc.nextInt();
        return Gnum;
    }
}

class Player {
    int pnum;

    int playerNum() {
        System.out.println("Player, guess the number between 1 to 30");
        Scanner sc = new Scanner(System.in);
        pnum = sc.nextInt();
        return pnum;
    }
}

class Umpire {
    int guessNum;
    int player1Num;
    int player2Num;
    int player3Num;

    void collectGuessNum() {
        Guesser g = new Guesser();
        guessNum = g.guessNum();
    }

    void collectPlayerNum() {
        Player p1 = new Player();
        Player p2 = new Player();
        Player p3 = new Player();

        player1Num = p1.playerNum();
        player2Num = p2.playerNum();
        player3Num = p3.playerNum();
    }

    void compare() {
        if (guessNum == player1Num) {
            System.out.println("Player 1 won!");
        } else if (guessNum == player2Num) {
            System.out.println("Player 2 won!");
        } else if (guessNum == player3Num) {
            System.out.println("Player 3 won!");
        } else {
            System.out.println("Game over");
        }
    }
}

 class GuesserGame {
    public static void main(String[] args) {
        Umpire u = new Umpire();
        u.collectGuessNum();
        u.collectPlayerNum();
        u.compare();
    }
}
