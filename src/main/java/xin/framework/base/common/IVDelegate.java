package xin.framework.base.common;

/**
 * 处理生命周期的一些操作和View成相关接口,自行定制添加
 * <p>
 * 如： 弹窗/toast
 * </P>
 * <p>
 * 邮箱：ittfxin@126.com
 * <p>
 * https://github.com/wzx54321/XinFrameworkLib
 */
public interface IVDelegate {


    void toastShort(String msg);

    void toastLong(String msg);
}
