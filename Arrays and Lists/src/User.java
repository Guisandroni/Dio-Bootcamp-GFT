import static java.util.Objects.isNull;

public class User {
    private String name;
    private int code;

    public User(String name, int code){
        this.code=code;
        this.name=name;
    }
    public String setName(){
        return name;
    }

    public int setCode(){
        return code;
    }

    public void getCode( int code){
        this.code=code;
    }

    public void getName(String name){
        this.name=name;
    }


    @Override
    public String toString(){
        return "User{" + name + "," + code + "}";
    }


}
