import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
    class Vector implements Cloneable, Iterable<Double>{
        private List<Double> coordinates;
        public Vector() {
            this.coordinates = new ArrayList<>();

        }
        public Vector(List<Double> values) {
            this.coordinates= new ArrayList<>(values); } // This is the new ArrayList "Values" which will
            // store the values assign in this.coordinate as deep copy. so, changing the orginal will not
            // effect the value Arraylist.

            public void  addCoordinate(double values){
                coordinates.add(values);
        }
        public double get(int i) {
            return coordinates.get(i); // Return me the values stored at ith position in coordinates Arraylist.

        }
        public void set(int i, double val) {
            coordinates.set(i , val); // Replace the value stored at specific i with another value "val".
        }
        public int length() {
            return coordinates.size(); 
        } // Tells us the size of the arrayList coordinate.
        public Vector add(Vector other) {
            if(this.length() != other.length()) {
                throw new IllegalArgumentException(" Vector should have same dimensions");
            }
            List<Double> newCoords = new ArrayList<>();
            for (int i = 0; i< this.length(); i++) {
                newCoords.add(this.get(i) + other.get(i));
            }
            return new Vector (newCoords);
        }
        @Override
        public Vector clone() {
            return new Vector (this.coordinates); // It will make the deep copy of the Values ArrayList which is already copied with
            // coordinates Arraylist...
        }
        @Override 
        public String toString() {
            return coordinates.toString();
        }
        @Override
        public boolean equals(Object o) { // Here we are compairing the coordinate Arraylist before cloning and "this.coordinate" Arraylist after cloning.
            if (this == o) return true;
            if (!(o instanceof Vector)) return false;
            Vector vector = (Vector) o; // Casting Vector to o... We make sure that this o should be used as vector for vector comparison as object cannot compare vector.
            return Objects.equals(coordinates , this.coordinates); // coordinates = Before Cloning  this.coordinates = After Cloning

        }
        @Override
        public Iterator<Double> iterator() {
            return coordinates.iterator();
        }

    }


    

