package CLASSPACK;

/**
 * Animal
 */
public class Animal {

        protected String type = "";
        protected String name = "";
        protected String bread = "";

    public Animal (String type, String name, String bread){
        this.type = type;
        this.name = name;
        this.bread = bread;
    }
    public String getType(){
        return type;
    }

    public String getName(){
        return name;
    }

    public String getbread(){
        return bread;
    }

}