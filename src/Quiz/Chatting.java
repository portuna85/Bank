package Quiz;

public class Chatting {

    void startChat(String chatId) {

        String finalName = chatId;

        new Chat() {
            @Override
            void start() {
                while (true) {
                    String input = "안녕하세요";
                    String message = "(" + finalName + ")" + input;
                    sendMessage(message);
                }

            }
        };
    }

    private class Chat {
        void start() {}

        void sendMessage(String msg) {

        }
    }
}