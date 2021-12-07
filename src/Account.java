public class Account {

    String name;
    String accountNo;
    String cardNo;
    String phoneNo;
    private int like;
    Address address = new Address();

    public Account() {
    }

    public Account(String name, String accountNo, String cardNo, String phoneNo, int like, Address address) {
        this.name = name;
        this.accountNo = accountNo;
        this.cardNo = cardNo;
        this.phoneNo = phoneNo;
        this.like = like;
        this.address = address;
    }

    public void setAccountNo(String accountNo) {

        if (accountNo.contains("-")) {
            this.accountNo = accountNo;
        } else {
            this.accountNo = "----";
        }
    }

    public void like(String nameOrAccount) {

        if (nameOrAccount.length() > 10) {
            // 10보다 작은 값은 이름으로 판정
            this.name = nameOrAccount;
            this.accountNo = "";
            this.like += 3;

        } else {
            // 10보다 큰 값은 어카운트로 판장
            this.name = "";
            this.accountNo = nameOrAccount;
            this.like += 10;

        }


    }

    public void like(String account, int count) {

        if (count > 1) {
            this.like += count;
        } else {
            this.like++;
        }

    }



    @Override
    public String toString() {
        return "Account{" +
                "name='" + name + '\'' +
                ", accountNo='" + accountNo + '\'' +
                ", cardNo='" + cardNo + '\'' +
                ", phoneNo='" + phoneNo + '\'' +
                ", like=" + like +
                ", address=" + address +
                '}';
    }
}