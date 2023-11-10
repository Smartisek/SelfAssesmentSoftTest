import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


class GeometryTest {
    @Test
    void IsntTriangle(){
        int a = 10;
        int b = 4;
        int c = 15;

        Geometry g = new Geometry();
        String expected = "Not a triangle";
        String actual = g.classify(a,b,c);

        assertEquals(expected, actual);
        System.out.println(actual);
    }

    @Test
    void IsScalane(){
        int a = 20;
        int b = 10;
        int c = 15;

        Geometry g = new Geometry();
        String expected = "Scalane";
        String actual = g.classify(a,b,c);

        assertEquals(expected, actual);
        System.out.println(actual);
    }

    @Test
    void IsIsosceles(){
        int a = 20;
        int b = 15;
        int c = 15;

        Geometry g = new Geometry();
        String expected = "Isosceles";
        String actual = g.classify(a,b,c);

        assertEquals(expected, actual);
        System.out.println(actual);
    }

    @Test
    void IsEquilateral(){
        int a = 15;
        int b = 15;
        int c = 15;

        Geometry g = new Geometry();
        String expected = "Equilateral";
        String actual = g.classify(a,c,b);

        assertEquals(expected, actual);
        System.out.println(actual);
    }

}