package chap_07.camera;

public final class ActionCam extends Camera {
    public ActionCam() {
        super("액션 카메라");
    }
    public final String lens = "광각렌즈";

    public final void makeVideo() {
        System.out.println(this.name + ": " + this.lens + "로 멋진 비디오를 제작합니다.");
    }
}
