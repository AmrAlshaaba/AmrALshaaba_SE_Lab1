package se.hkr;

public class MockTest {
    public static void main(String[] args) {
        Mock m = new Mock();
        m.connect("www.youtube.com","1234","amr");
        m.connect("www.youtube.com","1234","amr");
        m.disconnect();
        m.disconnect();
    }
}
