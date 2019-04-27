package Login.Form;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class LoginForm {
    @NotNull
    @Size(min = 2,max =30)
    private String userName;

    @Size(min=6)
    @NotNull
    private String password;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "LoginForm{" +
                "userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
