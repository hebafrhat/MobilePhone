package junit5;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    // نصنع ميتودا ستاتيك كي يعرفوها كل الميثودس الاخرين بدلا من إضافة Calculator C=new Calculator(); لكل ميتودا
    static Calculator C=new Calculator();

    @org.junit.jupiter.api.Test
    void add() {
        // اضفنا بدلا منها الميتودا الستاتك Calculator C=new Calculator();
        assertEquals(9,C.add(3,6));
    }

    @org.junit.jupiter.api.Test
    void minus() {
        Calculator C=new Calculator();
        assertEquals(0,C.minus(4,4));
    }

    @org.junit.jupiter.api.Test
    void multibly() {
        Calculator C=new Calculator();
        assertEquals(16,C.multibly(4,4));
    }

    @org.junit.jupiter.api.Test
    void div() {
        Calculator C=new Calculator();
        assertEquals(1,C.div(4,4));
    }
}