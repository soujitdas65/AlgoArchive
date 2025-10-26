class Solution {
    class Box {
        int count;
        int units;
        Box(int count, int units) {
            this.count=count;
            this.units=units;
        }
    }
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        int l=boxTypes.length,result=0;
        Box[] cal=new Box[l];
        for(int i=0;i<l;i++) 
        cal[i]=new Box(boxTypes[i][0],boxTypes[i][1]);
        Arrays.sort(cal,(a,b) -> Double.compare(b.units,a.units));
        for(int i=0;i<l;i++) {
            if(cal[i].count<=truckSize) {
                truckSize-=cal[i].count;
                result+=cal[i].count*cal[i].units;
            }
            else {
                result+=truckSize*cal[i].units;
                break;
            }
        }
        return result;
    }
}