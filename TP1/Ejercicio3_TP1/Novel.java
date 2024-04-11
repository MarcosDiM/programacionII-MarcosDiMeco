package Ejercicio3_TP1;

public class Novel extends Book{
    private String type;

    public Novel(String title, String author, float price, String type) {
        super(title, author, price);
        this.type = type;
    }

    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }

    @Override
    public void data() {
        System.out.println("Titulo: " + this.getTitle());
        System.out.println("Autor: " + this.getAuthor());
        System.out.println("Precio: " + this.getPrice());
        System.out.println("Tipo de novela: " + this.getType());
    }
}
