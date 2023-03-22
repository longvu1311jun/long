package demo_1Bang.domainmodel;

public class Category {

    private Long id;
    private String categoryCode;
    private String categoryName;

    public Category() {
    }

    public Category(Long id, String categoryCode, String categoryName) {
        this.id = id;
        this.categoryCode = categoryCode;
        this.categoryName = categoryName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCategoryCode() {
        return categoryCode;
    }

    public void setCategoryCode(String categoryCode) {
        this.categoryCode = categoryCode;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    @Override
    public String toString() {
        return "Category{" + "id=" + id + ", categoryCode=" + categoryCode + ", categoryName=" + categoryName + '}';
    }

}
