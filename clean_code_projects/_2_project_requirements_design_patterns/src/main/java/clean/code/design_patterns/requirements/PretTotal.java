package clean.code.design_patterns.requirements;

public class PretTotal {
    private int total ;

    private static final PretTotal instance = new PretTotal();

    private PretTotal() {

        this.total = 0;
    }

    public static PretTotal getInstance() {

        return instance;
    }

    public int getTotal() {

        return total;
    }

    public void AdaugaProdus(int pretProdus) {

        this.total += pretProdus;
    }
}
