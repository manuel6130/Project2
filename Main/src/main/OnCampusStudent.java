//**************************************************************************************************
/*
CLASS: OnCampusStudent
AUTHOR:
Manuel Sanchez - msanc156 - msanc156@asu.edu
Ilsa Ramirez - iramirez - iramirez@asu.edu
Estevan Perez - eperez56 - eperez56@asu.edu
 */
//**************************************************************************************************
package main;

public class OnCampusStudent extends Student {

    public static int RESIDENT = 1;
    public static int NON_RESIDENT = 2;
    private int mResident;
    private double mProgramFee;

    public OnCampusStudent(String pFirstName, String pId, String pLastName) {
        super(pFirstName, pId, pLastName);
    }

    @Override
    public void calcTuition() {
        double t;
        if (getResidency() == 1) {
            t = TuitionConstants.ONCAMP_RES_BASE;
        } else {
            t = TuitionConstants.ONCAMP_NONRES_BASE;
        }
        t = t + getProgramFee();
        if (getCredits() > TuitionConstants.ONCAMP_MAX_CREDITS) {
            t = t + (getCredits() - TuitionConstants.ONCAMP_MAX_CREDITS) * TuitionConstants.ONCAMP_ADD_CREDITS;
        }
        setTuition(t);

    }

    public double getProgramFee() {
        return mProgramFee;
    }

    public int getResidency() {
        return mResident;
    }

    public void setProgramFee(double pProgramFee) {
        mProgramFee = pProgramFee;
    }

    public void setResidency(int pResident) {
        mResident = pResident;
    }
}
