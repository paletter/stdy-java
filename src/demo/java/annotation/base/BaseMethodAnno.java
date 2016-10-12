package demo.java.annotation.base;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * ����Annotation�Ƿ������Ա���������԰�Annotation��Ϊ��������:
 * 
 * - ���Annotation��û�г�Ա������Annotation����Ϊ��ǡ�
 *   ����Annotation��������Ĵ��������Ϊ�����ṩ��Ϣ������@override��
 * - Ԫ����Annotation��������Ա������Annotation��
 *   ��Ϊ���ǿ��Խ��ܸ����Ԫ���ݣ���˱���ΪԪ����Annotation
 * 
 * 
 * @Targetָ��Annotation����������Щ����Ԫ��:
 * - ElementType.TYPE���������ࡢ�ӿڻ�ö������
 * - ElementType.FIELD�������γ�Ա����
 * - ElementType.METHOD�������η���
 * - ElementType.PARAMETER�������β���
 * - ElementType.CONSTRUCTOR�������ι�����
 * - ElementType.LOCAL_VARIABLE�������ξֲ�����
 * - ElementType.ANNOTATION_TYPE��������ע��
 * - ElementType.PACKAGE�������ΰ�
 *
 * @Retention����һ����Ϊ��value���ĳ�Ա����:
 * - RetentionPolicy.SOURCE��Annotationֻ������Դ�����У�����������ʱ��ֱ�Ӷ�������Annotation
 * - RetentionPolicy.CLASS����������Annotation��¼��class�ļ��С�������Java����ʱ��JVM�в��ٱ�����Annotation
 * - RetentionPolicy.RUNTIME����������Annotation��¼��class�ļ��С�������Java����ʱ��JVM�ᱣ����Annotation���������ͨ�������ȡ��Annotation����Ϣ
 * 
 * @Documented
 * �������ע��Aʱ��ʹ����@Documented���ζ��壬������javadoc��������API�ĵ�������ʹ��ע��A���εĳ���Ԫ�أ��������ע��A��˵��
 * 
 * @Inherited
 * ָ��Annotation���м̳���
 * 
 * 
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface BaseMethodAnno {

}
