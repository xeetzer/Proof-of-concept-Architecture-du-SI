package ch.hegarc.servicenotaire.business;

import java.util.Date;

public class ResumeActe {
    private int numeroOrdre;
    private Date dateDeActe;
    private int minutaireNo;
    private int minuteNo;

    private String natureActe;

    public ResumeActe() { }

    public ResumeActe(String natureActe) {
        this.natureActe = natureActe;
    }

    public ResumeActe(int numeroOrdre, Date dateDeActe, int minutaireNo, int minuteNo, String natureActe) {
        this.numeroOrdre = numeroOrdre;
        this.dateDeActe = dateDeActe;
        this.minutaireNo = minutaireNo;
        this.minuteNo = minuteNo;
        this.natureActe = natureActe;
    }

    public int getNumeroOrdre() {
        return numeroOrdre;
    }

    public void setNumeroOrdre(int numeroOrdre) {
        this.numeroOrdre = numeroOrdre;
    }

    public Date getDateDeActe() {
        return dateDeActe;
    }

    public void setDateDeActe(Date dateDeActe) {
        this.dateDeActe = dateDeActe;
    }

    public int getMinutaireNo() {
        return minutaireNo;
    }

    public void setMinutaireNo(int minutaireNo) {
        this.minutaireNo = minutaireNo;
    }

    public int getMinuteNo() {
        return minuteNo;
    }

    public void setMinuteNo(int minuteNo) {
        this.minuteNo = minuteNo;
    }

    public String getNatureActe() {
        return natureActe;
    }

    public void setNatureActe(String natureActe) {
        this.natureActe = natureActe;
    }
}
