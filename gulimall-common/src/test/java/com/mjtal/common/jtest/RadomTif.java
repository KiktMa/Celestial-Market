package com.mjtal.common.jtest;


import com.mjtal.common.dllinterface.GdalTest;
import com.mjtal.common.dllinterface.GeoSot;
import org.junit.Test;

public class RadomTif {

    @Test
    public void tifMerge() {
        double lon = 91.978195;
        double lat = 27.603013;
        double height = 0;
        int level = 18;
        String hexCode = GeoSot.INSTANCE.getHexCode(lat, lon, height, level);
        System.out.println(hexCode);

        GeoSot.INSTANCE.freeMemory(hexCode);
    }

    @Test
    public void test() {
        String startpath = "D:\\test_tif\\tif5\\geoAllT.tif";
        String endpath = "D:\\test_tif\\tif5\\test.tif";
        GdalTest.test.test(startpath);
    }

    public String ReverseSentence(String str) {
        if(str.length()==0||str.length()==1) return str;
        int strlen = str.length()-1;
        StringBuilder newstr = new StringBuilder();
        for(int j = strlen;j>=0;j--){
            newstr.append(str.charAt(j));
        }
        return String.valueOf(newstr);
    }
}
