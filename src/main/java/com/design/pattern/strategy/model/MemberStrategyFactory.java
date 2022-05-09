package com.design.pattern.strategy.model;

/**
 * 会员策略工厂
 *
 * @author 曾俊凯
 * @date 2022/5/3
 */
public class MemberStrategyFactory {
    public static MemberStrategy getStrategy(Integer MemberLevel) {
        switch (MemberLevel) {
            case 1:
                return new PrimaryMemberStrategy();
            case 2:
                return new IntermediateMemberStrategy();
            case 3:
                return new AdvanceMemberStrategy();
            default:
                throw new RuntimeException("暂无该等级会员……");
        }
    }
}
