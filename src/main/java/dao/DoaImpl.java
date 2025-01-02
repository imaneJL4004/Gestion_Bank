package dao;

import org.hibernate.Session;
import org.hibernate.Transaction;
import util.HibernateUtil;

public class DoaImpl implements IDao {

    @Override
    public void addClient(Client client) {
        Session ses = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction tx = null;
        try {
            tx = ses.beginTransaction();
            ses.save(client);
            tx.commit();
        } catch (Exception e) {
            if (tx != null) {
                tx.rollback(); // Rollback the transaction if any error occurs
            }
            e.printStackTrace();
        }
    }

    @Override
    public void addCompte(Compte compte, int codeClient) {
        Session ses = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction tx = null;
        try {
            tx = ses.beginTransaction();
            Client client = (Client) ses.get(Client.class, codeClient);
            client.getComptes().add(compte);
            compte.setClient(client);
            ses.save(compte);
            tx.commit();
        } catch (Exception e) {
            if (tx != null) {
                tx.rollback(); // Rollback the transaction if any error occurs
            }
            e.printStackTrace();
        }
    }
}
