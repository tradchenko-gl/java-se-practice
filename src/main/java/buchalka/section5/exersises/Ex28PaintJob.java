package buchalka.section5.exersises;

public class Ex28PaintJob {

    public static int getBucketCount (double width, double height, double areaPerBucket, int extraBuckets) {
        int bucketsToBuy = 0;

        if ((width <= 0) || (height <= 0) || (areaPerBucket <= 0) || (extraBuckets < 0)) {
            return -1;
        }

        double area = width*height;
        int totalBuckets = (int)(Math.ceil(area/areaPerBucket));
        bucketsToBuy = totalBuckets - extraBuckets;

        return bucketsToBuy;
    }

    public static int getBucketCount (double width, double height, double areaPerBucket) {
        int bucketsToBuy = 0;

        if ((width <= 0) || (height <= 0) || (areaPerBucket <= 0)) {
            return -1;
        }

        double area = width*height;
        bucketsToBuy = (int)(Math.ceil(area/areaPerBucket));

        return bucketsToBuy;
    }

    public static int getBucketCount (double area, double areaPerBucket) {
        int bucketsToBuy = 0;

        if ((area <= 0) || (areaPerBucket <= 0)) {
            return -1;
        }

        bucketsToBuy = (int)(Math.ceil(area/areaPerBucket));

        return bucketsToBuy;
    }
}
