package clean.code.design_patterns.requirements;

public class Cereale implements CasaDeMarcat {
    @Override
    public void scaneaza(){
        PretTotal pretTotal = PretTotal.getInstance();
        pretTotal.AdaugaProdus( 14);
    }
}
