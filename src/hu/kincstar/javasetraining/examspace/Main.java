package hu.kincstar.javasetraining.examspace;

public class Main {

    public static void main(String[] args) {
	// write your code here
        SpaceAgency sa = new SpaceAgency();
        sa.registerSatellite(new Satellite("sat1", new CelestialCoordinates(10, 10, 10)));
        sa.registerSatellite(new Satellite("sat2", new CelestialCoordinates(20, 20, 20)));
        try {
            System.out.println(sa.getRegisteredSatellies().toString());
            System.out.println(sa.findSatelliteByRegisterIdent("sat1").getRegisterIdent());
            System.out.println(sa.findSatelliteByRegisterIdent("sat3").getRegisterIdent());
        }
        catch (NullPointerException | IllegalArgumentException ex)
        {
            System.out.println(ex.getMessage());
        }
    }
}

/*
Space agency
Valamikor a távoli jövőben...
A Naprendszert számos űreszköz járja, ezeket különböző szervezetek irányítják, megadják az aktuális céljukat.
Az esetleges zavaró hatások miatt a SpaceAgency nyilvántartja ezeket, regisztrációs számuk és a kitűzött
céljuk ismeretével. A célt mindig koordinátákkal adjuk meg, ez a Naphoz, mint origohoz rögzített,
és egyes kitüntetett csillagok irányában felvett x, y és z irányokban vannak meghatározva.
Az úticél módosítása is koordinátákban kerül megadásra, mindig a már megadott célponthoz képest a
különbség kerül átadásra. Az űreszköz Satellite navigációs rendszere ennek alapján automatikusan
irányítja önmagát.

Megvalósítás
SpaceAgency osztály és feladatai: Regisztrálni lehet az útjukra indított eszközöket és azonosítójuk
alapján ki is lehet keresni.
public void registerSatellite(Satellite satellite)
public Satellite findSatelliteByRegisterIdent(String registerIdent)

Satellite osztály és feladatai:
A CelestialCoordinates immutable, azaz állapota nem módosítható.
Az aktuális úticél új különbözeti koordináták megadásával frissíthető,
ekkor a Satellite attribútuma új értéket vesz fel.
public Satellite(CelestialCoordinates destinationCoordinates, String registerIdent)
public void modifyDestination(CelestialCoordinates diff)
public String toString()
CelestialCoordinates osztály attribútumként a koordinátákat tartalmazza, ezek mind final változók,
értéket a konstruktorban kapnak. Getter metódusok segítségével olvashatók.

Hibakezelés
Üres String, mint paraméter nem fogadható el, továbbá a szatellit regisztrációnál nem kaphat null paramétert.
Amennyiben a megadott azonosítóval nem található űreszköz, szintén kivételt várunk
 */
