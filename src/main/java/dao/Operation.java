package dao;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class Operation {
    private Integer codeOperation;
    private String description;
    private Date dateOp;
    private Set<Compte> comptes = new HashSet<>(); // Using HashSet for multiple accounts

    // Default constructor
    public Operation() {
        super();
    }

    // Parameterized constructor
    public Operation(Integer codeOperation, String description, Date dateOp, Set<Compte> comptes) {
        this.codeOperation = codeOperation;
        this.description = description;
        this.dateOp = dateOp;
        this.comptes = comptes;
    }

    // Getters and Setters
    public Integer getCodeOperation() {
        return codeOperation;
    }

    public void setCodeOperation(Integer codeOperation) {
        this.codeOperation = codeOperation;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDateOp() {
        return dateOp;
    }

    public void setDateOp(Date dateOp) {
        this.dateOp = dateOp;
    }

    public Set<Compte> getComptes() {
        return comptes;
    }

    public void setComptes(Set<Compte> comptes) {
        this.comptes = comptes;
    }

    // Helper method to add a Compte to the Set
    public void addCompte(Compte compte) {
        this.comptes.add(compte);
    }
}
