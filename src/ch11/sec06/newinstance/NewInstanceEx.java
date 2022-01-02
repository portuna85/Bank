package ch11.sec06.newinstance;

public class NewInstanceEx {
    public static void main(String[] args) {
        try {
            Class clazz = Class.forName("ch11.sec06.newinstance.SendAction");
           // Class clazz = Class.forName("ch11.sec06.newinstance.ReceiveAction");
            Action action = (Action) clazz.newInstance();
            action.execute();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
