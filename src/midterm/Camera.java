package midterm;

// Question 5
public class Camera {

    private Camera(){}

    private static  Camera camera;
    private static Object object = new Object();
    private String cameraName = "Default Name";

    public String getCameraName() {
        return cameraName;
    }

    public void setCameraName(String cameraName) {
        this.cameraName = cameraName;
    }

    public static Camera getInstance() {

        if (camera == null) {
            synchronized (object) {
                if (camera == null) {
                    camera = new Camera();
                }
            }
        }

        return camera;
    }
}
