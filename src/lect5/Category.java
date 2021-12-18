package lect5;

public enum Category {
    IT("programowanie"),
    TEST("testowanie"),
    DEV_OPS("dev ops");

    private final String categoryName;

    Category(String categoryName) {
        this.categoryName = categoryName;
    }
}
