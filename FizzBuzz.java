package FizzBuzz;

public class FizzBuzz {
    public void execute(){

    }

    public String processNumber(int number){
        if(isMulitpleOf3(number) && isMulitpleOf5(number)){
            return "Fizz Buzz";
        }
        else if(isMulitpleOf3(number)){ //if number is divisible by 3, remaninder will be 0
            return "Fizz";
        } else if(isMulitpleOf5(number)) {//if number is divisible by 5, remaninder will be 0
            return "Buzz";
        } else {
            return Integer.toString(number);
        }
    }

    private boolean isMulitpleOf3(int number){
        return number % 3 == 0;
    }
    private boolean isMulitpleOf5(int number){
        return number % 5 == 0;
    }
    

    
}