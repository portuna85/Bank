package Example.smart;

public class SmartPhoneEx extends Cellphone {
    public static void main(String[] args) {
        Cellphone phone1 = new Cellphone();
        SmartPhone phone2 = new SmartPhone();
        System.out.println("회사 명 : " + phone2.getCompany());
        System.out.println("모델 명 : " + phone1.modelName);
        System.out.println("모델 번호 : " + phone1.model);
        System.out.println("색상 : " + phone1.color);
    }
}