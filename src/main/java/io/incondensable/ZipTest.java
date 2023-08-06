//package io.incondensable;
//
//import java.io.File;
//import java.io.FileInputStream;
//import java.io.FileOutputStream;
//import java.io.IOException;
//import java.util.zip.ZipEntry;
//import java.util.zip.ZipOutputStream;
//
///**
// * @author abbas
// */
//public class ZipTest {
//    public static void main(String[] args) {
//        long before = System.currentTimeMillis();
//        File tiffFile = new File("/Users/incondensable/Desktop/Final-tif.zip");
//        try (ZipOutputStream zos = new ZipOutputStream(new FileOutputStream(tiffFile))) {
//            ZipEntry ze = new ZipEntry("/Users/incondensable/Desktop/Final.tif");
//            zos.putNextEntry(ze);
//            FileInputStream fis = new FileInputStream("/Users/incondensable/Desktop/shit.tif");
//            byte[] buffer = new byte[1024];
//            int len;
//            int i = 0;
//            while ((len = fis.read(buffer)) > 0) {
//                zos.write(buffer, 0, len);
//                i++;
//            }
//            System.out.println(i);
//            zos.closeEntry();
//            fis.close();
//        } catch (IOException e) {
//            System.out.println(e.getMessage());
//        }
//        long after = System.currentTimeMillis();
//        System.out.println(after - before);
//    }
//}
//
//// 32768 -> 3816
//// 4096 -> 3891
//// 1024 -> 3975 // second try: 4010
//// 512 -> 4149
//// 32 -> 6968
