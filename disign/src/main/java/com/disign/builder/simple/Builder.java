package com.disign.builder.simple;

/**
 * @author fhj
 * @version 1.0
 * @ClassName Builder
 * @Description TODO
 * @date 2019/8/28  9:11
 **/
public abstract class Builder {

    protected Product product= new Product();

    /**
     * 产品名称
     */
    public abstract void BuildName();

    /**
     * 产品描述
     */
    public abstract void BuildDes();

    /**
     * 钩子方法，是否设置描述
     * @return
     */
    protected boolean isDes(){return true;}

    public Product getResult(){
        this.BuildName();
        if(this.isDes()){
            this.BuildDes();
        }
        return this.product;
    }



}
