package Example.smart;

public class SmartPhone {
        private String company = "APPLE";
        String modelName;
        String model;
        String color;

        public SmartPhone() {
        }

        public SmartPhone(String modelName, String model, String color) {
            this.modelName = modelName;
            this.model = model;
            this.color = color;
        }

    public String getCompany() {
        return company;
    }

    void powerOn() {
            System.out.println("전원을 켭니다.");
        }

        void powerOff() {
            System.out.println("전원을 끕니다.");
        }

        void sendCall() {
            System.out.println("전화를 건다.");
        }

        void receiveCall() {
            System.out.println("전화를 수신");
        }

        void hangUp() {
            System.out.println("전화 종료");
        }

        void sendMessage(String message) {
            System.out.println("발신메시지 : "+message);
        }

        void receiveMessage(String message) {
            System.out.println("수신메시지 : "+message);
        }
}