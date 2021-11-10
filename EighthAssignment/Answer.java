import java.util.*;

class GFG{
    static boolean isEven(int n){
        if((n^1)==n+1)
            return true;
        else
            return false;
    }

    public static void main(String[] args){
        int n=100;
        System.out.println(isEven(n)==true? "Even" : "Odd");
    }
}


 
