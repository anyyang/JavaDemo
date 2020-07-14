package cn.liuyangjob;

import java.io.File;

public class DeleteTongMingWenJianText {


    public void getAllFiles() {
        File file = new File("L:/jay/VipSongsDownload");
        if (file.isDirectory()) {
            File[] files = file.listFiles();

            if (null == files) return;

            for (File fName : files) {
                if (fName.getName().contains("(1)") || fName.getName().contains("(2)")) {
                    System.out.println(fName.getName());
                    fName.delete();
                }
            }
        }
    }

    public static void main(String[] args) {
        new DeleteTongMingWenJianText().getAllFiles();
    }
}

