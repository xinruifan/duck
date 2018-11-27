package domain;

public class duck {
    private String name;
    private Enum color;

    public duck(String name){
        this.name=name;
    }
    public duck(String name,Enum color) {
        this.name = name;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public Enum getColor() {
        return color;
    }

    public void setColor(Enum color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "我叫"+name+",我的毛是"+color+"色";
    }
}
