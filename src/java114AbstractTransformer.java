//programmerJohn
//demonstrate usage of AbstractSupper class for a voltage transformer
abstract class Transformer{
    //abstract method to be implemented by subclasses
    public abstract double transformVoltage(double inputVoltage);
}
//subclass
class StepUpTransformer extends Transformer{
    private double turnsRatio;

    public StepUpTransformer(double turnsRatio){  //constructor
        this.turnsRatio = turnsRatio;
    }

    @Override
    public double transformVoltage(double inputVoltage){
        return(inputVoltage * turnsRatio);
    }
}
//subclass
class StepDownTransformer extends Transformer{
    private double turnsRatio;

    public StepDownTransformer(double turnsRatio){   //constructor
        this.turnsRatio = turnsRatio;
    }

    @Override
    public double transformVoltage(double inputVoltage){
        return (inputVoltage / turnsRatio);
    }
}
public class java114AbstractTransformer {
    public static void main(String[] args){
        Transformer stepUp = new StepUpTransformer(5.0); //create object and initialize instance variable
        Transformer stepDown = new StepDownTransformer(0.2); //create object and int instance variable

        System.out.println("StepUp Transformer output voltage: " +
                stepUp.transformVoltage(120));
        System.out.println("StepDown Transformer output voltage: " +
                stepDown.transformVoltage(240.0));
    }
}
