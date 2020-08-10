package optional;

import java.util.Optional;

public class Online {
    private Integer id;
    private String title;
    private boolean closed;

    public Progress progress;


    public Online(Integer id, String title, boolean closed) {
        this.id = id;
        this.title = title;
        this.closed = closed;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isClosed() {
        return closed;
    }

    public void setClosed(boolean closed) {
        this.closed = closed;
    }

    public Progress getProgress() {
       if (progress == null) {
            throw new IllegalStateException();
        }
//        자바8 이전에는 이런식으로 예외처리를 하던가, null체크를 했음
        return progress;
    }

/*    public Optional<Progress> getProgress(){
        return Optional.ofNullable(progress);
    }*/
}