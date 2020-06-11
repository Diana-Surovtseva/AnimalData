class Cat extends Animal {
    Cat( String name, int age ) {
        super(name, age);
    }

    @Override
    public String toString() {
        //return super.toString();
        return ("I am a Cat "+ "with name " + name + " with age " + age);

    }
}
