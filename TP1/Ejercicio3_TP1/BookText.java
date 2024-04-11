package Ejercicio3_TP1;

public class BookText extends Book{
    private String curse;

    public BookText(String title, String author, float price, String curse) {
        super(title, author, price);
        this.curse = curse;
    }
    public String getCurse() {
        return curse;
    }

    public void setCurse(String curse) {
        this.curse = curse;
    }

    @Override
    public void data() {
        System.out.println("Titulo: " + this.getTitle());
        System.out.println("Autor: " + this.getAuthor());
        System.out.println("Precio: " + this.getPrice());
        System.out.println("Curso: " + this.getCurse());
    }
}
