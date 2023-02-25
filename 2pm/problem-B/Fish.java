public class Fish extends Animal implements Pet {
    private String name;

    public Fish(String name) {
        super(0);
        this.name = name;
    }

    public Fish() {
        this("Nemo");
    }

    @Override
    public void eat() {
        System.out.println("Fish " + this.name + " is eating!");
    }

    @Override
    public String getName() {
        return this.name;
    }
    
    @Override
    public void setName(String name) {
        this.name = name;
    }
    
    @Override
    public void play() {
        System.out.println("Fish " + this.name + " is playing!");
    }

    @Override
    public void walk() {
        throw new UnsupportedOperationException("The fish can't walk!");
        // System.out.println("The fish can't walk!");
    }
}