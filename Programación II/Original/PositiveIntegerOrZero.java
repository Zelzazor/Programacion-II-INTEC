public class PositiveIntegerOrZero{
    private int value;

    public PositiveIntegerOrZero(int value){
        if(value < 0)
            throw new IllegalArgumentException("Number not Positive or Zero");
        else
            this.value = value;
    }

    public int getValue(){
        return value;
    }

    public void setValue(int value){
        if(value < 0)
            throw new IllegalArgumentException("Number not Positive or Zero");
        else
            this.value = value;
    }
    public String toString(){
        return Integer.toString(value);
    }


}