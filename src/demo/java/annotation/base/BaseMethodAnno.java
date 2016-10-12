package demo.java.annotation.base;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 根据Annotation是否包含成员变量，可以把Annotation分为如下两类:
 * 
 * - 标记Annotation：没有成员变量的Annotation被称为标记。
 *   这种Annotation仅用自身的存在与否来为我们提供信息，例如@override等
 * - 元数据Annotation：包含成员变量的Annotation。
 *   因为它们可以接受更多的元数据，因此被称为元数据Annotation
 * 
 * 
 * @Target指定Annotation用于修饰哪些程序元素:
 * - ElementType.TYPE：能修饰类、接口或枚举类型
 * - ElementType.FIELD：能修饰成员变量
 * - ElementType.METHOD：能修饰方法
 * - ElementType.PARAMETER：能修饰参数
 * - ElementType.CONSTRUCTOR：能修饰构造器
 * - ElementType.LOCAL_VARIABLE：能修饰局部变量
 * - ElementType.ANNOTATION_TYPE：能修饰注解
 * - ElementType.PACKAGE：能修饰包
 *
 * @Retention包含一个名为“value”的成员变量:
 * - RetentionPolicy.SOURCE：Annotation只保留在源代码中，编译器编译时，直接丢弃这种Annotation
 * - RetentionPolicy.CLASS：编译器把Annotation记录在class文件中。当运行Java程序时，JVM中不再保留该Annotation
 * - RetentionPolicy.RUNTIME：编译器把Annotation记录在class文件中。当运行Java程序时，JVM会保留该Annotation，程序可以通过反射获取该Annotation的信息
 * 
 * @Documented
 * 如果定义注解A时，使用了@Documented修饰定义，则在用javadoc命令生成API文档后，所有使用注解A修饰的程序元素，将会包含注解A的说明
 * 
 * @Inherited
 * 指定Annotation具有继承性
 * 
 * 
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface BaseMethodAnno {

}
