package net.sf.kerner.utils.math.point;

public class Point3D extends Point2D {

    protected final double z;

    public Point3D(double x, double y, double z) {
        super(x, y);
        this.z = z;
    }

    public Point3D(Point3D template) {
        this(template.getX(), template.getY(), template.getZ());
    }

    // Override //

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        long temp;
        temp = Double.doubleToLongBits(z);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!super.equals(obj)) {
            return false;
        }
        if (!(obj instanceof Point3D)) {
            return false;
        }
        Point3D other = (Point3D) obj;
        if (Double.doubleToLongBits(z) != Double.doubleToLongBits(other.z)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return super.toString() + ",z=" + getZ();
    }

    // Getter / Setter //

    public double getZ() {
        return z;
    }

}
