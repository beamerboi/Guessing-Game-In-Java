import java.util.Scanner;

public class main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Number game = new Number();

        int toCompare = game.getNumber();
        System.out.println(toCompare);


        System.out.println("I have randomly chosen a number between [1,100] \n Try to guess it. \n You have 10 guess(es) left:");
        int input = scanner.nextInt();
        int i = 10;
        do{
            if(game.verif(input,toCompare) == true){
                System.out.println("You Won, Congratz, take some time to celebrate now");
                break;
            }
            i--;
            if(game.verif(input,toCompare) == false) {
                if (input < game.getNumber()) {
                    System.out.println(input + " your number is bigger than the random generated number, you still have " + i + " times left.");
                } else {
                    System.out.println(input + " your number is lower than the random generated number, you still have " + i + " times left.\"");
                }
                System.out.println("Try again: ");
                input = scanner.nextInt();
            }

        }while((input != game.getNumber())&&(i>0));
        if(i <= 0){
            System.out.println("You lost..Better luck next time :D");
        }
    }
}
