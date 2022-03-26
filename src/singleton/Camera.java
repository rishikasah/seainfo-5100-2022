package singleton;

public class Camera {

    private Camera(){}

    private static Camera cameraInstance;

    private String cameraName;

    public void setCameraName(String name){
        cameraName = name;
    }

    public String getCameraName(){
        return cameraName;
    }

    public static Camera getCameraInstance(){

        if(cameraInstance == null) {
            synchronized (Camera.class) {
                if(cameraInstance == null) {
                    cameraInstance = new Camera();
                }
            }
        }
        return cameraInstance;
    }
}
