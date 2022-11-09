package main;

public class Role {
    public String name;

    public Role(String name) {
        if(this.name==null) throw new IllegalArgumentException("name can't be null");
        if(this.name.isBlank()) throw new IllegalArgumentException("name can't be null");
        this.name = name;
    }

}
