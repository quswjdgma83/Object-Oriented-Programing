public class BankUtil {
    public static String generateAcctNum(int fLower, int fUpper, int sLower, int sUpper) {
        return "" + RandomUtil.randIntInRange(fLower, fUpper) + '-'
                + RandomUtil.randIntInRange(sLower, sUpper);
    }
}
