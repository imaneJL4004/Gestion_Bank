
import dao.Client;
import dao.DoaImpl;

public class HibernateTest {
    public static void main(String[] args) {
        DoaImpl doa = new DoaImpl();
        doa.addClient(new Client(16,"Imane","JALAL","0621648220"));
        doa.addClient(new Client(17,"nour","jl","0667059185"));
    }
}
