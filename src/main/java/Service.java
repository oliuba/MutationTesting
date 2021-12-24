public class Service {
    private final String server;

    public Service(String server) {
        this.server = server;
    }

    public boolean serve() {
        return server.equals("good");
    }
}
