package com.version2.behavior.intermediary;

/**
 * @author fhj
 * @version 1.0
 * @ClassName UserInfoIntermediary
 * @Description TODO
 * @date 2020/3/23  18:24
 **/
public class UserInfoIntermediary implements Intermediary {

    private Button button;

    private List list;

    private Combox combox;

    private Text text;

    public void setButton(Button button) {
        this.button = button;
    }

    public void setList(List list) {
        this.list = list;
    }

    public void setCombox(Combox combox) {
        this.combox = combox;
    }

    public void setText(Text text) {
        this.text = text;
    }

    @Override
    public void operation(Component component) {
        if (button == component) {
            System.out.println("button add ");
            list.update();
            combox.update();
            text.update();
        } else if (list == component) {
            list.select();
            combox.select();
            text.select();
        } else if (combox == component) {
            combox.select();
            list.select();
            text.select();
        }
    }
}
