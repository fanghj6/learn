package com.disign.visitor;

/**
 * @author fhj
 * @version 1.0
 * @ClassName Employee  员工抽象类
 * @Description TODO
 * @date 2019/11/20  15:00
 **/
public interface Employee {

      void  accept(Department department);
}
