public class Parrot extends Animal{

    private double wingSpan;

    public Parrot(String name){
        super(name);
    }

    @Override
    public String makeNoise(){
        return "Squawk!";
    }

}
