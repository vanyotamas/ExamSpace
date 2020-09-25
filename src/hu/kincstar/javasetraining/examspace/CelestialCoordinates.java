package hu.kincstar.javasetraining.examspace;

import java.util.Objects;

public class CelestialCoordinates {
    private final long x;
    private final long y;
    private final long z;

    public CelestialCoordinates(long x, long y, long z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public long getX() {
        return x;
    }

    public long getY() {
        return y;
    }

    public long getZ() {
        return z;
    }

    @Override
    public String toString() {
        return "CelestialCoordinates{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CelestialCoordinates)) return false;
        CelestialCoordinates that = (CelestialCoordinates) o;
        return x == that.x &&
                y == that.y &&
                z == that.z;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y, z);
    }
}
