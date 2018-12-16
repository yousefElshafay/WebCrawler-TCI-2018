public class User {


    private String Name;
    private String password;

    public String getName() {
        return Name;
    }

    public User(String name, String password) {
        Name = name;
        this.password = password;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

