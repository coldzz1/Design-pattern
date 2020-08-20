package cold.desginpattern.EnumForSolveIfElse;

/**
 * Description: 测试类
 * Created by kele on 2020/8/20 12:41
 */
public class Test {

    //这样的方式只要有新增加的规则就需要修改主的逻辑,不符合开放封闭原则
    public static void main(String[] args) {
        String moniData="TOUTIAO";
        GeneralChannelRule rule = null;
        if(ChannelRuleEnum.TOUTIAO.getName().equalsIgnoreCase(moniData)){
            rule = new TencentChannelRule();
        }else  if (ChannelRuleEnum.TENCENT.equals(moniData)){
            rule = new ToutiaoChannelRule();
        }else {
            //匹配不到
            return;
        }
        //执行
        rule.process();
    }

    //这样的方式不需要更改主逻辑,只需要每次增加数据来源时,增加一个处理方式,和修改渠道的枚举值即可
    public static void test(){
        String moniData = "TOUTIAO";
        ChannelRuleEnum[] values = ChannelRuleEnum.values();
        for (ChannelRuleEnum rule:values
             ) {
            if(rule.getName().equalsIgnoreCase(moniData)){
                rule.getRule().process();
            }
        }


    }
}
