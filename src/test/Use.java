package test;

public class Use {
    public static void main(String[] args) {
        BookDTO javabook = new BookDTO("자바책", 12000, "책회사", 333);
        System.out.println(javabook.name);
        System.out.println(javabook.price);
        System.out.println(javabook.company);
}
