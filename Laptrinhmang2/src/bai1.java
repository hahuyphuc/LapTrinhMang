import java.io.File;

public class bai1 {
    public static void taoThuMuc(String path)
    {
        File file = new File(path);
        file.mkdirs();
    }
    public static void main (String[] agrs){
        String path = "D:\\temp";
        XuLyFile.taoThuMuc(path);
    }
}
