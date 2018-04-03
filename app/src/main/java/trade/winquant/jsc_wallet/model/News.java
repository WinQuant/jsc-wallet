package trade.winquant.jsc_wallet.model;

import java.util.Date;

public class News {
    private int id;
    private String author;
    private String title;
    private String summary;
    private String contents;
    private Date createdTime;
    private Date lastModifieTime;

    public News(int id, String author, String title, String summary, String contents, Date createdTime, Date lastModifieTime) {
        this.id = id;
        this.author = author;
        this.title = title;
        this.summary = summary;
        this.contents = contents;
        this.createdTime = createdTime;
        this.lastModifieTime = lastModifieTime;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return this.id;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return this.author;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return this.title;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getSummary() {
        return this.summary;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

    public String getContents() {
        return this.contents;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    public String getCreatedTime() {
        // TODO
        // return this.createdTime;
        return "";
    }

    public void setLastModifieTime(Date lastModifieTime) {
        this.lastModifieTime = lastModifieTime;
    }

    public String getLastModifieTime() {
        // TODO
        // return this.lastModifieTime;
        return "";
    }

    public String getImgSrc() {
        return "";
    }
}
