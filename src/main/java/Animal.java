public abstract class Animal {  //abstract class means no longer able
                                //to make new Animal class, instead make lion
                                //or parrots
    //PROPERTIES

    protected String name;

    //CONSTRUCTOR

    public Animal(String name){
        this.name = name;
    }

    //BEHAVIOUR

    public String makeNoise(){
        return "Hello, my name is " + this.name + ".";
    }

    public String eat(){
        return "Mmmm, that was tasty!";
    }

}
