//**************************************************************************************************
/*
CLASS: OnlineStudent
AUTHOR:
Manuel Sanchez - msanc156 - msanc156@asu.edu
Ilsa Ramirez - iramirez - iramirez@asu.edu
Estevan Perez - eperez56 - eperez56@asu.edu
 */
//**************************************************************************************************
package main;

public class OnlineStudent extends Student {

    private boolean mTechFee;

    public OnlineStudent(String pFirstName, String pId, String pLastName) {
        super(pFirstName, pId, pLastName);
    }

    @Override
    public void calcTuition() {
        double t = getCredits() * TuitionConstants.ONLINE_CREDIT_RATE;
        if (getTechFee()) {
            t = t + TuitionConstants.ONLINE_TECH_FEE;
        }
        setTuition(t);
    }

    public boolean getTechFee() {
        return mTechFee;
    }

    public void setTechFee(boolean pTechFee) {
        mTechFee = pTechFee;
    }
}
