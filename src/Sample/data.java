package Sample;

public class data {
    private String username,password,data;

    public data(String username, String password, String data) {
        this.username = username;
        this.password = password;
        this.data = data;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        String u=getUsername();
        this.username = username;
        System.out.println("username changed form "+u+" to "+getUsername());
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        String P=getPassword();
        this.password = password;
        System.out.println("password  changed form "+P+" to "+getPassword());
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        String D=getData();
        this.data = data;
        System.out.println("Data changed form "+D+" to "+getData());
    }

    public void info(){
        System.out.println("username is :"+getUsername());
        System.out.println("password is :"+getPassword());
        System.out.println("data is :"+getData());
    }

}
