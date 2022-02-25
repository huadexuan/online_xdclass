package net.xdclass.online_xdclass.utils;

public class JsonData {

    private int code;

    private Object data;

    private String msg;

    public JsonData() {
    }

    public JsonData(int code, Object data, String msg) {
        this.code = code;
        this.data = data;
        this.msg = msg;
    }

    public static JsonData buildSucces(){
        return new JsonData(0,null,null);
    }
    //成功返回数据
    public static JsonData buildSucces(Object data){
        return new JsonData(0,data,null);
    }

    public static JsonData buildError(Integer code, String msg){
        return new JsonData(-1,null,msg);
    }

    public static JsonData buildError(String msg){
        return new JsonData(-1,null,msg);
    }

    public static JsonData buildSucces(int code, String msg){
        return new JsonData(code,null,msg);
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    @Override
    public String toString() {
        return "jsonData{" +
                "code=" + code +
                ", data=" + data +
                ", msg='" + msg + '\'' +
                '}';
    }
}
