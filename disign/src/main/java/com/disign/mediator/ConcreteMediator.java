package com.disign.mediator;

/**
 * @author fhj
 * @version 1.0
 * @ClassName ConcreteMediator
 * @Description TODO
 * @date 2019/9/29  10:42
 **/
public class ConcreteMediator extends Mediator{

    private List list;

    private Text text;

    private ComboBox comboBox;


    private  Button button;

    /**
     * 1.点击添加按钮，列表新增，下拉框新增，文本清空
     * 2.列表选中,下拉框修改，文本显示
     * 3.下拉框选中，文本显示
     *
     *  增加组件类，需要增加具体中介类，重写componentChanged
     *
     * @param component
     */
    @Override
    public void componentChanged(Component component) {

        if(component == button){
            button.update();
            list.update();
            comboBox.update();
            text.update();

        }else if(component == list){
            list.select();
            comboBox.select();
            text.select();

        }else if(component == comboBox){
            comboBox.select();
            text.select();
        }

    }


    public void setList(List list) {
        this.list = list;
    }

    public void setText(Text text) {
        this.text = text;
    }

    public void setComboBox(ComboBox comboBox) {
        this.comboBox = comboBox;
    }

    public void setButton(Button button) {
        this.button = button;
    }
}
