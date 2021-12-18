package lect5;

public enum Category {
    IT("programowanie"),
    TEST("testowanie"),
    DEV_OPS("dev ops");

    private final String categoryName;

    public String getCategoryName() {
        return categoryName;
    }

    Category(String categoryName) {
        this.categoryName = categoryName;
    }
}
