package ch09.exercise.sol7;

public class Chatting {
    class Chat {
        void start() {
        }

        void sendMessage() {
        }
    }

    void startChat(String chatId) {
        String nickName = chatId;


        Chat chat = new Chat() {
            @Override
            public void start() {
                while (true) {
                    String inputdata = "안녕하세요";
                    String message = "[" + nickName + "]" + inputdata;
//                    sendMessage();
                }
            }
        };
        chat.start();
    }


}




