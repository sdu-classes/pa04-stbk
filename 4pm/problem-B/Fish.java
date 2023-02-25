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
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void play() {
        System.out.println("The fish " + this.name + " is playing!");
    }

    @Override
    public void eat() {
        System.out.println("The fish " + this.name + " is eating!");
    }

    @Override
    public void walk() {
        // System.out.println("This fish can't walk!");
        throw new UnsupportedOperationException("This fish can't walk!");
    }
}