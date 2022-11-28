public class WashingMachine extends Device{
    private double xp;
    private double kn;
    private double eths;
    private double dp;
    private String apst;
    static int countWM;


    /** prosorina adio function */
    //private String periodicMaintanceWM(){}

    /** constractor public
     * @param xp    XORITIKOTHTA PLHSHS
     * @param kn    KATANALOSI NEROY
     * @param eths  EPIPEDO THORIVOU STHPSIMATOS
     * @param dp    DIARKEIA PROGRAMMATOS
     * @param apst  APODOSH STIPSIMATOS
     * */
    public WashingMachine(double m, double h, double d, String ak, String as, String ts, double ke, double xp, double kn, double eths, double dp, String apst) {
        super(m, h,d, ak, as, ts, ke);
        this.xp = xp;
        this.kn = kn;
        this.eths = eths;
        this.dp = dp;
        this.apst = apst;
        countWM++;
    }

    /**toString method public
     * return
     * */
    public String toString() {
        return xp + ", " + kn + ", " + eths + ", " + dp + ", " + apst + '\n' + countWM + '\n';
    }
}


