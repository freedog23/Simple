import java.util.Arrays;

class ArrayAlg {
    
    private static class Pair {
        private double min;
        private double max;

        Pair(double min, double max) { 
            this.min = min;
            this.max = max;    
        }
        
        public double getMin() { return min; }
        public double getMax() { return max; }
    }
    
    public static Pair elementMinMax(double[] array) {
        double min = Double.MAX_VALUE;
        double max = Double.MIN_VALUE;
        
        for(double d : array) {
            if (min > d)  min = d;
            if (max < d) max = d;
        }
        
        return new Pair(min, max);
    }

    public static void main(String[] args) {
        double[] d = new double[20];
        for(int i = 0; i < d.length; i++)
            d[i] = 100 * Math.random();
        
        ArrayAlg.Pair p = ArrayAlg.elementMinMax(d);
        
        for(double i : d) 
            System.out.print(i + " ");
        
        System.out.println();
        System.out.println("element min " + p.getMin());
        System.out.println("element max " + p.getMax());
    }
}