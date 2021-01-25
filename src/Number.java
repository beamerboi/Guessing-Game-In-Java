import java.util.Random;

public class Number {

    public int getNumber(){
    Random random = new Random();
    return random.nextInt(100-1)+1;
    }
    public boolean verif(int input,int toCompare){
        if(input == toCompare){
            return true;
    }
        else {
            return false;
        }
    }
}
