public class Oven extends Device{
    private int tps;
    private double tf;
    private String diak;
    private String pso;
    private String sk;
    static int countOv;


    /** prosorina adio function */
    //private String periodicMaintanceOv(){}

    /** constractor public
     * @param tps   ARITHMOS TROPOY PSISIMATOS
     * @param tf    XORITIKOTITA FOURNOU
     * @param diak  DIAKOPTES
     * @param pso   PSIFIAKI OTHONI
     * @param sk    SISTIMA KATHARISMOY
     * */
    public Oven(double m, double h, double d, String ak, String as, String ts, double ke, int tps, double tf, String diak, String pso, String sk) {
        super(m, h,d, ak, as, ts, ke);
        this.tps = tps;
        this.tf = tf;
        this.diak = diak;
        this.pso = pso;
        this.sk = sk;
        countOv++;
    }

    /**
     * toString method public
     * return
     * */
    public String toString(){
        return m + ", " + h + ", " + d + ", " + ak + ", " + as + ", " + ts + ", " + ke + ", " + tps + ", " + tf + ", " + diak + ", " + pso + ", " + sk + '\n' + countOv + '\n';
    }
}
