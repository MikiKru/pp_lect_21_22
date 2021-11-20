package lect3;

public class Operations {
    private int number1;
    private int number2;

    public int setPositiveNumber1(){
        if(number1 < 0){
            number1 = 0;
            return 0;
        }
        return number1;
    }
    public int setPositiveNumber2(){
        if(number2 < 0){
            number2 = 0;
            return 0;
        }
        return number2;
    }
    public Operations(int number1, int number2) {
        this.number1 = number1;
        this.number2 = number2;
    }
    @Override
    public String toString() {
        return "Operations{" +
                "number1=" + number1 +
                ", number2=" + number2 +
                '}';
    }
    public int getNumber1() {
        return number1;
    }
    public void setNumber1(int number1) {
        this.number1 = number1;
    }
    public int getNumber2() {
        return number2;
    }
    public void setNumber2(int number2) {
        this.number2 = number2;
    }
}
