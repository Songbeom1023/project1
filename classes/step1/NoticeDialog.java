package classes.step1;

import javax.swing.*;

public class NoticeDialog extends JDialog {
    NoticeMain nm = null;

    public NoticeDialog() {}

    public NoticeDialog(NoticeMain nm) {
        this.nm = nm;//이 코드를 적지 않으면 다른 메소드에서 nm 사용시 NullPointerException 발생.
    }

    public void initDisplay() {
        this. setSize(400,500);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        NoticeDialog nd = new NoticeDialog();
        nd.initDisplay();
    }
}
