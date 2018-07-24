package pmp.tianxundai.com.projectmasterplan;

import administrator.example.com.framing.interfaces.DarkNavigationBarTheme;
import administrator.example.com.framing.interfaces.DarkStatusBarTheme;
import administrator.example.com.framing.interfaces.Layout;
import administrator.example.com.framing.interfaces.NavigationBarBackgroundColor;
import administrator.example.com.framing.util.JumpParameter;
import pmp.tianxundai.com.projectmasterplan.base.BaseAty;

/**
 * 创建人:赵栋亮
 * 联系方式qq: 1037438704
 * 功能: 用于主界面
 * @author dell-pc
 */
@Layout(R.layout.activity_main)
@DarkStatusBarTheme(false) //true 为黑色  false 白色
@NavigationBarBackgroundColor(a = 0, r = 0, g = 0, b = 0)
//透明颜色   设置底部导航栏背景颜色（a = 255,r = 255,g = 255,b = 255 黑色的）
@DarkNavigationBarTheme(true) //开启底部导航栏按钮暗色模式
public class MainActivity extends BaseAty {

    @Override
    public void initViews() {
        //此方法用于实例化
    }
    /**
     * @param jumpParameter 从别的界面传的值用这个进行接收详情 请看文档
     * */
    @Override
    public void initDatas(JumpParameter jumpParameter) {

    }
    /**
     * 点击事件写在这个里面  请用匿名内部类的方式
     * */
    @Override
    public void setEvents() {

    }
}
