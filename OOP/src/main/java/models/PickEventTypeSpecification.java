package models;

public class PickEventTypeSpecification {
    private String id;
    private String timestamp;
    private PickerTypeSpecification picker;
    private ArticleTypeSpecification article;
    private Integer quantity;

    public String getId() {
        return id;
    }

    public void setId(final String id) {
        this.id = id;
    }

    public String getTimeStamp() {
        return timestamp;
    }

    public void setTimeStamp(final String timeStamp) {
        this.timestamp = timeStamp;
    }

    public PickerTypeSpecification getPicker() {
        return picker;
    }

    public void setPicker(final PickerTypeSpecification picker) {
        this.picker = picker;
    }

    public ArticleTypeSpecification getArticle() {
        return article;
    }

    public void setArticle(final ArticleTypeSpecification article) {
        this.article = article;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(final Integer quantity) {
        this.quantity = quantity;
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("***** PickEventTypeSpecification *****\n");
        sb.append("ID=" + getId() + "\n");
        sb.append("timeStamp=" +getTimeStamp() + "\n");
        sb.append("PickerTypeSpecification=" + getPicker() + "\n");
        sb.append("ArticleTypeSpecification=" + getArticle() + "\n");
        sb.append("quantity=" + getQuantity() + "\n");


        return sb.toString();
    }
    }
