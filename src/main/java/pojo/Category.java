package pojo;

public class Category {
    private Integer id;
    private String name;

    public Category() {
        setId(32);
        setName("Jessy");
    }

    public Category(Integer id, String name) {
        setId(id);
        setName(name);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
