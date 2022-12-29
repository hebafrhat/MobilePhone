package yurasha;

public class father extends grandfather{
    private String name;

    public father(String name1) {
        super(name1);
        this.name = name1;
    }
    @Override
    public void Iam() {
        System.out.println("I am father , my name is "+name);
    }
}
