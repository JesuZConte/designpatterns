package solid.segretationprinciple;

public interface ShapeInterface {
    double area();

    // this would violate the segration principle because not all shapes have volumes
    // we better take it to another interface
    //double volume();
}


interface SolidShapeInterface {
    double volume();
}

