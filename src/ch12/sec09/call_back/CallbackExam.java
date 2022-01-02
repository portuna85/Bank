package ch12.sec09.call_back;

public class CallbackExam {
    public static void main(String[] args) {
        Callback exam = new Callback();

        exam.doWork("3","3");
        exam.doWork("3", "삼");

        exam.finish();
    }
}
