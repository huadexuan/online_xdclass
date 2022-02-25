package net.xdclass.online_xdclass.model.request;

/**
 * @author hdx
 * @title: loginRequest
 * @projectName online_xdclass
 * @description: TODO
 * @date 2022/2/2518:32
 */
public class LoginRequest {

    private String phone;

    private String pwd;

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    @Override
    public String toString() {
        return "loginRequest{" +
                "phone='" + phone + '\'' +
                ", pwd='" + pwd + '\'' +
                '}';
    }
}
