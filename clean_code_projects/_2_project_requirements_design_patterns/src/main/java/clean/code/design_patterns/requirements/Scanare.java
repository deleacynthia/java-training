package clean.code.design_patterns.requirements;

import java.util.ArrayList;
import java.util.List;

public class Scanare implements CasaDeMarcat{
    private List<CasaDeMarcat> casaDeMarcat = new ArrayList<>();
    public void adaugare(CasaDeMarcat casa){

        this.casaDeMarcat.add(casa);
    }
    @Override
    public void scaneaza(){
        for(CasaDeMarcat casaDeMarcat1: casaDeMarcat)
            casaDeMarcat1.scaneaza();
    }
}
