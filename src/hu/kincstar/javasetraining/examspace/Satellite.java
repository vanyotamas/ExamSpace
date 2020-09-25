package hu.kincstar.javasetraining.examspace;

public class Satellite {
    private String registerIdent;
    private CelestialCoordinates destinationCoordinates;

    public Satellite(String registerIdent, CelestialCoordinates destinationCoordinates) {
        this.registerIdent = registerIdent;
        this.destinationCoordinates = destinationCoordinates;
    }

    public void modifyDestination(CelestialCoordinates diff)
    {
        destinationCoordinates = new CelestialCoordinates(
                destinationCoordinates.getX() + diff.getX(),
                destinationCoordinates.getY() + diff.getY(),
                destinationCoordinates.getZ() + diff.getZ());
    }

    public String getRegisterIdent() {
        return registerIdent;
    }

    @Override
    public String toString() {
        return "Satellite{" +
                "registerIdent='" + registerIdent + '\'' +
                ", destinationCoordinates=" + destinationCoordinates.toString() +
                "}\n";
    }
}
