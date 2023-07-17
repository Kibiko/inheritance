public class Parrot extends Bird{

    private double wingSpan;

    public Parrot(String name){
        super(name);
    }

    @Override
    public String makeNoise(){
        return "Squawk!";
    }

    public String sayName(){
        //return "My name is "+ this.name + "."; can not access animal.name since this is different class
        return "My name is "+ this.name + ".";
    }

}
