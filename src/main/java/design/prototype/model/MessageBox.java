package design.prototype.model;

public class MessageBox extends CloneNewInstance implements Product {

    private char boxChar;

    public MessageBox(char boxChar) {
        this.boxChar = boxChar;
    }

    // 用于测试: 修改后, 是否生成的原型是不同的?
    public void setBoxChar(char boxChar) {
        this.boxChar = boxChar;
    }

    // --------
    // - text -
    // --------
    @Override
    public void use(String s) {
        String boxStr = String.format("%c", boxChar);
        System.out.println(boxStr.repeat(s.length() + 4));

        System.out.printf("%c ", boxChar);
        System.out.print(s);
        System.out.printf(" %c", boxChar);
        System.out.println();

        System.out.println(boxStr.repeat(s.length() + 4));
    }
}
