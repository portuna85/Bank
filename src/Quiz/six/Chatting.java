package Quiz.six;

public class Chatting {

    void startChat(String chatId) {
        String nickname = null;
        nickname = chatId;

        String finalNickname = nickname;
        Chat chat = new Chat() {

            @Override
            void star() {

                while (true) {
                    String inputData = "안녕하세요";
                    String message = "[" + finalNickname + "]" + inputData;

                }
            }
        };
    }

    private class Chat {

        void star() {}

        void sendMessage(String msg) {}

    }
}
