package ch09.sec04;

public class Button {
    OnClickListener listener;

    void setOnClickListener(OnClickListener listener) {
        this.listener = listener;
    }

    void touch() {
        listener.onCLick();
    }

    interface OnClickListener {
        void onCLick();
    }
}