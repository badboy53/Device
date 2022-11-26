public class AirCondition extends Device{
    private double ips;
    private double kps;
    private double kth;
    private double esm;
    private double eksm;
    static int countAC;


    /** prosorina adio function */
    //private String periodicMaintanceAC(){}

    /** constractor public
     * @param ips   ISXIS PSIKSHS
     * @param kps   KATANALOSH PSIKSHS
     * @param kth   KATANALOSH THERMANSHS
     * @param esm   ISXIS THORIVOU ESOTERIKHS MONADAS
     * @param eksm  ISXIS THORIVOU EKSOTERIKHS MONADAS
     * */
    public AirCondition(double m, double h, double d, String ak, String as, String ts, double ke, double ips, double kps, double kth, double esm, double eksm) {
        super(m, h,d, ak, as, ts, ke);
        this.ips = ips;
        this.kps = kps;
        this.kth = kth;
        this.esm = esm;
        this.eksm = eksm;
        countAC++;
    }

    /**toString method public
     * return
     * */
    public String toString(){
        return m + ", " + h + ", " + d + ", " + ak + ", " + as + ", " + ts + ", " + ke + ", " + ips + ", " + kps + ", " + kth + ", " + esm + ", " + eksm + '\n' + countAC + '\n';
    }
}
