public class Lion extends Animal{  //extends to parent class

    //PROPERTIES (specific to lion class)

    private boolean canWaitToBeKing;
    private double jumpHeight;

    //CONSTRUCTOR

    public Lion(String name, boolean canWaitToBeKing){
        super(name); //HAS TO BE FIRST
                     // whatever the parent class does, this does it too
        this.canWaitToBeKing = canWaitToBeKing;
    }

    //BEHAVIOUR

    @Override // optional tag, but clearer to external reader
    public String makeNoise(){ //overrides parent method
        return "ROAR";
    }
}
