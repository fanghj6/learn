package com.version2.behavior.visit;

/**
 * @author fhj
 * @version 1.0
 * @ClassName Visitor
 * @Description TODO
 * @date 2020/3/26  11:26
 **/
public interface Visitor {

     void visit(NormalEmployee normalEmployee);

     void visit(TemporaryEmployee temporaryEmployee);
}
