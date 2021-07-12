package by.training.wlood.s05_basics_of_oop.task5a.bean;

import java.util.Objects;

public class Packaging {
    private PackagingType packagingType;

    public Packaging() {
    }

    public Packaging(PackagingType packagingType) {
        this.packagingType = packagingType;
    }

    public PackagingType getPackageType() {
        return packagingType;
    }

    public void setPackageType(PackagingType packagingType) {
        this.packagingType = packagingType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Packaging aPackage = (Packaging) o;
        return packagingType == aPackage.packagingType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(packagingType);
    }

    @Override
    public String toString() {
        return "Package{" +
                "packageType=" + packagingType +
                '}';
    }
}
