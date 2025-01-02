package dao;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class Compte implements Serializable {
    private int numero;
    private Date dateCompte;
    private Double solde;
    private Client client;
    private Set<Operation> operations = new HashSet<>();  // A set to store operations

    // Default constructor
    public Compte() {
        super();
    }

    // Parameterized constructor
    public Compte(int numero, Date dateCompte, Double solde, Client client) {
        this.numero = numero;
        this.dateCompte = dateCompte;
        this.solde = solde;
        this.client = client;
    }

    // Getters and setters
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Date getDateCompte() {
        return dateCompte;
    }

    public void setDateCompte(Date dateCompte) {
        this.dateCompte = dateCompte;
    }

    public Double getSolde() {
        return solde;
    }

    public void setSolde(Double solde) {
        this.solde = solde;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Set<Operation> getOperations() {
        return operations;
    }

    public void setOperations(Set<Operation> operations) {
        this.operations = operations;
    }

    // Helper method to add an Operation to the Set
    public void addOperation(Operation operation) {
        this.operations.add(operation);
    }
}
