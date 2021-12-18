package lect5;

import java.time.LocalDateTime;

public class Post {
    private String title;
    private String content;
    private Category category;
    private User author;
    private LocalDateTime dateAdded;

    public Post(String title, String content, Category category, User author) {
        this.title = title;
        this.content = content;
        this.category = category;
        this.author = author;
        this.dateAdded = LocalDateTime.now();
    }

    @Override
    public String toString() {
        return "Post{" +
                "title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", category=" + category.getCategoryName() +
                ", author=" + author +
                ", dateAdded=" + dateAdded +
                '}';
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public User getAuthor() {
        return author;
    }

    public void setAuthor(User author) {
        this.author = author;
    }

    public LocalDateTime getDateAdded() {
        return dateAdded;
    }

    public void setDateAdded(LocalDateTime dateAdded) {
        this.dateAdded = dateAdded;
    }
}
