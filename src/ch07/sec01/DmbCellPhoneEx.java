package ch07.sec01;

public class DmbCellPhoneEx {
    public static void main(String[] args) {
        // DmbPhone 객체 생성
        DmbPhone dmbPhone = new DmbPhone("SHE-6009", "RED",67);

        // CellPhone 객체 생성
        CellPhone cellPhone = new CellPhone();
        cellPhone.setPhoneName("Iphone");
        String phoneName = cellPhone.getPhoneName();

        // CellPhone에서 DmbPhohe으로 상속받은 필드
        System.out.println(cellPhone.company);
        System.out.println("핸드폰 이름 : "+phoneName);
        System.out.println("모델 : " + dmbPhone.model);
        System.out.println("색상 : " + dmbPhone.color);

        System.out.println("채널 : "+dmbPhone.getChannel());

        dmbPhone.powerOn();
        dmbPhone.turnOnDmb();
        dmbPhone.setChannel(61);
        int i = dmbPhone.getChannel();
        dmbPhone.changeChannelDmb(i);
        dmbPhone.turnOffDmb();

        dmbPhone.sendCall();
        dmbPhone.endCall();
        dmbPhone.receiveCall();
        dmbPhone.endCall();

        dmbPhone.setPhoneName("뭐하농?");
        System.out.println("바꾼핸드폰이름: "+dmbPhone.getPhoneName());

        dmbPhone.sendMessage("ㅋㅋㅋㅋ");
        dmbPhone.receiveMessage("심심하당");
    }
}
