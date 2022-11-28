public class Fridge extends Device{
    private double xk;
    private double xs;
    private double eth;
    private String ekl;
    private String c;
    static int countF;

    /** prosorina adio function*/
    //private String periodicMaintanceF(){}


    /** constractor public
     *
     * @param xk    XORITIKOTHTA KATAPSIKSHS
     * @param xs    XORITIKOTHTA SINTIRISIS
     * @param eth   EPIPEDO THORIVOU
     * @param ekl   ENERGIAKH KLASH
     * @param c     COLOR
     * */
    public Fridge(double m, double h, double d, String ak, String as, String ts, double ke, double xk, double xs, double eth, String ekl, String c) {
        super(m, h,d, ak, as, ts, ke);
        this.xk = xk;
        this.xs = xs;
        this.eth = eth;
        this.ekl = ekl;
        this.c = c;
        countF++;
    }



    /**toString method public
     * return
     * */
    public String toString(){
        return xk + ", " + xs + ", " + eth + ", " + ekl + ", " + c + '\n' + countF + '\n';
    }


}
