package dao;

public interface IDao {
    public void addClient(Client c);
    public void addCompte(Compte c, int codeClient);
}
