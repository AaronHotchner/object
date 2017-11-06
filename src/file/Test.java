package file;

import java.io.File;
import java.io.IOException;
import java.util.Date;


public class Test {
	public static void main(String[] args) {
		File file = new File("src/file/image/us.gif");
		System.out.println("是否存在？" + file.exists());
		System.out.println("是否是文件？" + file.isFile());
		System.out.println("是否是文件夹" + file.isDirectory());
		System.out.println("最后修改时间：" + new Date(file.lastModified()));
		
		//System.out.println();
		
		try {
			System.out.println("路径：" + file.getCanonicalPath());
		} catch (IOException e) {
			System.out.println("没有此文件！");
			e.printStackTrace();
		}
		
		
		
		//digui(new File("e:"));
        //digui(new File("e:\\"));
	}
	
//	public static void digui(File f)
//    {
//        System.out.println(f.getPath());
//        if( !f.exists() ){
//            System.out.println("not exist");
//            return;
//        }
//        File [] name = f.listFiles();
//        System.out.println(name.length);
//        for(int i = 0 ;i < name.length; i++)
//        {
//            System.out.println(name[i]);
//        }
//    }
}
