package dataObjects;

/**
 * Created by Preetika.Suvarna on 05/05/2017.
 */
public class LoginDataObject {
    private String username;
    private String password;
    private boolean isLoggedIn;

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsername() {
        return this.username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return this.password;
    }

    public void setIsLoggedIn(boolean isLoggedIn){
        this.isLoggedIn = isLoggedIn;
    }

    public boolean getIsLoggedIn() {
        return isLoggedIn;
    }

}
