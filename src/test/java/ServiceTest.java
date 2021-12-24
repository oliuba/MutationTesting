import org.junit.Test;

import static org.junit.Assert.*;

public class ServiceTest {
    private Service service;
    private String server;

    @Test
    public void serveGood() {
        this.server = "good";
        this.service = new Service(server);
        assertTrue(service.serve());
    }

    @Test
    public void serveBad() {
        this.server = "bad";
        this.service = new Service(server);
        assertFalse(service.serve());
    }
}