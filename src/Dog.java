 class Dog extends Animal{
     Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public String toString() {
        return "I am a Dog " + "with name "+ name+ " with age " + age;
        //return super.toString();
    }
}

