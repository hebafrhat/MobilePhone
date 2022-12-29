package yurasha;

public class son extends father{
    private String name;

    public son(String name2) {
        super(name2);
        this.name = name2;
    }

    @Override
    public void Iam() {
        System.out.println("I am son , my name is "+name);
    }
}
