package singleton;

public class CameraRunner {

    public static void main(String[] args) {

        Camera canon1 = Camera.getCameraInstance();
        canon1.setCameraName("DS430");
        Camera nikon = Camera.getCameraInstance();

        System.out.println(canon1.getCameraName());
        System.out.println(nikon.getCameraName());

        nikon.setCameraName("NK3456");

        System.out.println(canon1.getCameraName());
        System.out.println(nikon.getCameraName());
    }
}
