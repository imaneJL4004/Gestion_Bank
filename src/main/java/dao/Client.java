package dao;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

public class Client implements Serializable {
    private Integer codeClient;
    private String nomClient;
    private String prenomClient;
    private String numTelephone;
    private Set<Compte> comptes = new HashSet<Compte>();

    // Default constructor
    public Client() {
         super();
    }

    // Parameterized constructor
    public Client(Integer codeClient, String nomClient, String prenomClient, String numTelephone) {
        this.codeClient = codeClient;
        this.nomClient = nomClient;
        this.prenomClient = prenomClient;
        this.numTelephone = numTelephone;
    }

    // Getters and Setters
    public Integer getCodeClient() {
        return codeClient;
    }

    public void setCodeClient(Integer codeClient) {
        this.codeClient = codeClient;
    }

    public String getNomClient() {
        return nomClient;
    }

    public void setNomClient(String nomClient) {
        this.nomClient = nomClient;
    }

    public String getPrenomClient() {
        return prenomClient;
    }

    public void setPrenomClient(String prenomClient) {
        this.prenomClient = prenomClient;
    }

    public String getNumTelephone() {
        return numTelephone;
    }

    public void setNumTelephone(String numTelephone) {
        this.numTelephone = numTelephone;
    }

    public Set<Compte> getComptes() {
        return comptes;
    }

    public void setComptes(Set<Compte> comptes) {
        this.comptes = comptes;
    }
    public void addCompte(Compte compte,int codeClient) {
        this.comptes.add(compte);
    }
}
