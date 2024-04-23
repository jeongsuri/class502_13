package exam03;

public class Resource implements AutoCloseable{
    @Override
    public void close() throws Exception {
        System.out.println("자원해제!");
    }
}
