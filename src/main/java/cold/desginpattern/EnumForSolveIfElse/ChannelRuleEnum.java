package cold.desginpattern.EnumForSolveIfElse;

/**
 * Description:渠道枚举类
 * Created by kele on 2020/8/20 12:35
 */
public enum  ChannelRuleEnum {
    /**
     * 头条
     */
    TOUTIAO("TOUTIAO",new ToutiaoChannelRule()),
    /**
     * 腾讯
     */
    TENCENT("TENCENT",new TencentChannelRule());


    ChannelRuleEnum(String name,GeneralChannelRule rule){
        this.name=name;
        this.rule=rule;
    }

    private String name ;

    //新的方式

    private GeneralChannelRule rule;

    public String getName() {
        return name;
    }

    public GeneralChannelRule getRule(){
        return rule;
    }


}
