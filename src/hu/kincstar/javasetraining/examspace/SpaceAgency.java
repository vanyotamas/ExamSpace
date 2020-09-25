package hu.kincstar.javasetraining.examspace;

import java.util.ArrayList;
import java.util.List;

public class SpaceAgency {
    private List<Satellite> registeredSatellies = new ArrayList();

    public void registerSatellite(Satellite satellite) {
        if (satellite == null || satellite.getRegisterIdent().isEmpty())
            throw new NullPointerException("Paramater can't be null!");
        registeredSatellies.add(satellite);

        // TODO ide lehetne még ellenőrzés, hogy ugyanazt a szatellittet ne adhassa meg
    }

    public Satellite findSatelliteByRegisterIdent(String registerIdent) {
        if (registerIdent == null || registerIdent.isEmpty())
            throw new NullPointerException("Paramater can't be null!");
        for (Satellite s : registeredSatellies) {
            if (s.getRegisterIdent() == registerIdent)
                return s;
        }
        throw new IllegalArgumentException(registerIdent + " is illegal!");
    }

    public List<Satellite> getRegisteredSatellies() {
        return registeredSatellies;
    }
}
