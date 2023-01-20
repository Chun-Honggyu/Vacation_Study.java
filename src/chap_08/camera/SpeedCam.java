package chap_08.camera;

import chap_08.detector.Detectable;
import chap_08.reporter.Reportable;

public class SpeedCam extends Camera implements Detectable, Reportable {

    @Override
    public void showMainFeature() {
        System.out.println("속도 측정, 번호 인식");
    }

    public Detectable detector;
    public Reportable reporter;

    public void setDetector(Detectable detector) {
        this.detector = detector;
    }

    public void setReporter(Reportable reporter) {
        this.reporter = reporter;
    }

    public void detect() {
        detector.detect();
    }

    public void report() {
        reporter.report();
    }
}
