package exam03;

public class Resource2 implements AutoCloseable {
    @Override
    public void close() throws Exception {
        System.out.println("Resource2 자원해제");
    }
}
