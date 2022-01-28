package review;

import java.time.LocalDateTime;

public class Board {
    private int num;
    private String title;
    private String content;
    private LocalDateTime created;

    public Board(int num, String title, String content, LocalDateTime created) {
        this.num = num;
        this.title = title;
        this.content = content;
        this.created = created;
    }

    public int getNum() {
        return num;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public LocalDateTime getCreated() {
        return created;
    }

    @Override
    public String toString() {
        return "Board{" +
                "num=" + num +
                ", title='" + title + '\'' +
                ", discription='" + content + '\'' +
                ", created=" + created +
                '}';
    }
}
