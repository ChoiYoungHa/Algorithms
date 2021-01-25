package test;

public class BookDTO {
    public String name;
    public int price;
    public String company;
    public int page;

    // 인스턴스화 할 때 ()에 다음 값들 name, price, company, page의 데이터들을
    // 넣어 주어야 객체 생성이 가능하도록 만든 생성자
    public BookDTO(String name, int price, String company, int page) {
        this.name = name;
        this.price = price;
        this.company = company;
        this.page = page;
    }

    // Default Constructor (기본 생성자)
    // 이 클래스에 원래 아무것도 정의되어 있지 않아도 밑에 있는 것을 자바가 자동으로
    // 정의해주기 때문에 우리가 ()괄호 안에 아무것도 넣지 않고 인스턴스 생성이 가능한 것이다.
    public BookDTO(){
        String name;
        int price;
        String company;
        int page;
    }

}
