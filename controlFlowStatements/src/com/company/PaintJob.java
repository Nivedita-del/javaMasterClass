package com.company;

public class PaintJob {
    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets){
        if((width <= 0)||(height <=0)||(areaPerBucket <=0)||(extraBuckets <0)){
            return -1;
        }
        else{
            double area = width*height;
            int bucket = (int) Math.ceil((area/areaPerBucket)-extraBuckets);
            return bucket;
        }
    }
    public static int getBucketCount(double width, double height, double areaPerBucket){
        if((width <= 0)||(height <=0)||(areaPerBucket <=0)){
            return -1;
        }
        else{
            double area = width*height;
            int bucket = (int) Math.ceil((area/areaPerBucket));
            return bucket;
        }
    }
    public static int getBucketCount(double area, double areaPerBucket){
        if((area <= 0)||(areaPerBucket <=0)){
            return -1;
        }
        else{
            int bucket = (int) Math.ceil((area/areaPerBucket));
            return bucket;
        }
    }

    public static void main(String[] args) {
        System.out.println(getBucketCount(7.25,4.3,2.35));
    }
}
